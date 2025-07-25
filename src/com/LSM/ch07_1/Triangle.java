package com.LSM.ch07_1;

public class Triangle extends Shape {
	
	public double area() { //메소드 오버 라이딩
		double area = width*height*0.5;
		return area;
	}
	
	
}
