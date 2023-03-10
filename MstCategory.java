package jp.co.internous.kingdom.model.domain;

import java.sql.Timestamp;

public class MstCategory {
	
	private int id;
	private String categoryName;
	private String categoryDescription;
	private Timestamp updatedAt;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getCategoryDescription() {
		return categoryDescription;
	}
	
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdateAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}
