package com.LSM.ch07_3;

public class Triangle extends Shape {

	private int widht;
	private int height;
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Triangle(int widht, int height) {
		super();
		this.widht = widht;
		this.height = height;
	}

	public int getWidht() {
		return widht;
	}
	public void setWidht(int widht) {
		this.widht = widht;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double getArea() { // 삼각형 면적 출력으로 오버라이딩
		// TODO Auto-generated method stub
		return widht * height * 0.5;
	}
	@Override
	public void getColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("삼각형 색깔:" + color);
	}

	
	
}
