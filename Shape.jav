package com.lpu.shape;

public class Shape {
	private String name;
	public Shape(){
		name = "ShapeDefault";
	}
	
	
	public Shape(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
