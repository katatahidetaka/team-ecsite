package jp.co.internous.kingdom.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.kingdom.model.domain.MstProduct;

@Mapper
public interface MstProductMapper {

	@Select("SELECT * FROM mst_product")
	List<MstProduct> findAll();
	
	@Select("SELECT * FROM mst_product WHERE id = #{id}")
	MstProduct findById(int id);
	
	List<MstProduct>findByProductName(@Param("searchWords") String[] searchWords);

	List<MstProduct>findByCategoryAndProductName(@Param("inputCategory") int inputCategory, @Param("searchWords") String[] searchWords);
	
}
