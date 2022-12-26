package jp.co.internous.kingdom.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.kingdom.model.domain.MstCategory;
import jp.co.internous.kingdom.model.domain.MstProduct;
import jp.co.internous.kingdom.model.form.SearchForm;
import jp.co.internous.kingdom.model.mapper.MstCategoryMapper;
import jp.co.internous.kingdom.model.mapper.MstProductMapper;
import jp.co.internous.kingdom.model.session.LoginSession;

@Controller
@RequestMapping("/kingdom")
public class IndexController {
	
	@Autowired
	MstCategoryMapper mstCategoryMapper;
	
	@Autowired
	MstProductMapper mstProductMapper;
	
	@Autowired
	LoginSession loginSession;

	@RequestMapping("/")
	public String index(Model m) {
		
		if(loginSession.getUserId() == 0 && loginSession.getTempId() == 0) {
			
			Random rand = new Random();
			
			int tentativeId = rand.nextInt(100000000) + 100000000;
			int temporaryId = tentativeId * -1 ;
			
			loginSession.setTempId(temporaryId);
			
		}

		List<MstProduct> productsList = mstProductMapper.findAll();
		List<MstCategory> category = mstCategoryMapper.findAll();
		
		m.addAttribute("category",category);
		m.addAttribute("productsList",productsList);
		m.addAttribute("loginSession", loginSession);
			
		return "index";
	}

	@PostMapping("/search")
	public String search(SearchForm form, Model m) {
		
		List<MstProduct> productsList = null;
		
		String searchWords = form.getInputWords().replaceAll("　", " ").replaceAll("\\s{2,}", " ").trim();
		
		if(form.getInputCategory() == 0) {
			
			productsList = mstProductMapper.findByProductName(searchWords.split(" "));
			
		}else {
			
			productsList = mstProductMapper.findByCategoryAndProductName(form.getInputCategory(), searchWords.split(" "));
			
		}
		List<MstCategory> category = mstCategoryMapper.findAll();
		
		m.addAttribute("category",category);
		m.addAttribute("selected", form.getInputCategory());
		m.addAttribute("searchWords", searchWords);
		m.addAttribute("productsList",productsList);
		m.addAttribute("loginSession", loginSession); 

		
		return "index" ;
	}	

}
