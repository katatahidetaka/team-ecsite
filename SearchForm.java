package jp.co.internous.kingdom.model.form;

import java.io.Serializable;

public class SearchForm implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private String inputWords;
	private int inputCategory;
	
	
	public String getInputWords() {
		return inputWords;
	}
	
	public void setInputWords(String inputWords) {
		this.inputWords = inputWords;
	}
	
	public int getInputCategory() {
		return inputCategory;
	}
	
	public void setInputCategory(int inputCategory) {
		this.inputCategory = inputCategory;
	}
	
	
}
