package com.LSM.ch07_3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Shape shape = new shape(); //추상클래스는 메모리에 객체 생성불가 (인스턴스 생성 x), new 불가
		
		Rectangle rectangle = new Rectangle(10,20);//생성자로 받아서 매개변수 넣어줌 
		System.out.println(rectangle.getArea());//값을 void가 아닌 return값을 받아주니까 안에 메소드 호출을 해줌
		
		Circle circle = new Circle();
		circle.setRadius(10);
		System.out.println(circle.getArea());
		
		
		 Shape shape = new Triangle(10,20);
		 System.out.println("삼각형 넓이:" + shape.getArea());
		
		 Triangle tri;
		 tri = (Triangle) shape;//다운캐스팅
		 tri.getArea();
		 System.out.println("삼각형 넓이:" + tri.getArea());
		 
		
	}

}
