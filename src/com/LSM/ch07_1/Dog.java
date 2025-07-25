package com.LSM.ch07_1;

public class Dog extends Animal {

	String dogTail;
	
	public Dog() {
		super(); //부모 클래스의 생성자 호출
		// TODO Auto-generated constructor stub
	}
	public Dog(String dogTail) {
		super();
		this.dogTail = dogTail;
	}
	public Dog(String name, int age) {
		super(name, age);
		
	}
	
	public void dogRun() {
		System.out.println("강아지 달리기");
	}

	
}
