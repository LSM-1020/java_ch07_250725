package com.LSM.ch07_3;

public class Circle extends Shape {
	
	private int radius;
	private static final double PI = 3.14; //PI는 final로 값도 외부에서 가져옴 설정 X

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}

	@Override
	public double getArea() { 
		// TODO Auto-generated method stub
		return radius * radius * PI;
	}

	@Override
	public void getColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("원 색깔:" + color);
	}


}
