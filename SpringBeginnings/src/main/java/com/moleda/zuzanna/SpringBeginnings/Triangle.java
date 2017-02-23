package com.moleda.zuzanna.SpringBeginnings;

public class Triangle {

	private String type;
	private Integer height;
	
	public Triangle(Integer height) {
		this.height = height;
	}

	public Triangle(String type) {
		this.type = type;
	}

	public Triangle(String type, Integer height) {
		this.type = type;
		this.height = height;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " Triangle drawn of height " + getHeight());
	}
}
