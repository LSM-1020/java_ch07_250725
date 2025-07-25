package com.LSM.ch07_3;

public abstract class Shape {
	public abstract double getArea(); //추상 메소드는 내용은 없고 선언부만 존재
	
	public abstract void getColor(String color); //메소드 하나더 추가되면 자식클래스에서도 오버라이딩
}

