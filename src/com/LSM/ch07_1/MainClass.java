package com.LSM.ch07_1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle();
		rectangle.height = 10;
		rectangle.width = 20;
		rectangle.recArea = 50.5;
		System.out.println(rectangle.area());
		
		
		System.out.println("======================================");
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("멍멍", 5);
		
		System.out.println("======================================");
		
		Student stu = new Student("김철수", 2, 33);
		
		System.out.println("======================================");
		
		Triangle triangle = new Triangle();
		triangle.width = 10;
		triangle.height = 5;
		triangle.color = "red";
		
		//삼각형 면적
		System.out.println(triangle.area());
		//사각형 면적
		Rectangle rec = new Rectangle();
		rec.area();
		
			
		}	
	}
	
		
	
	

