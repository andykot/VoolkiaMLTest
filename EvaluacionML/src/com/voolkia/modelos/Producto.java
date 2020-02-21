package com.voolkia.modelos;

public class Producto {
	
	private String id;
	private String title;
	private String category_id;
	private String category_name;

	public Producto(String id, String title, String categoyId, String categoryName) {

		this.id = id;
		this.title = title;
		this.category_id = categoyId;
		this.category_name = categoryName;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	
	public String mostrarDatos() {
		String caractereristicas = "id: " + this.id +  " title: " + this.title +" category_id: "+ this.category_id+ " name: " + this.category_name;
	
		return caractereristicas;
	}
		
		
	 

}



