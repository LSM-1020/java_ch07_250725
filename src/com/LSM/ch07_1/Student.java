package com.LSM.ch07_1;

public class Student extends Person { // 자식 클래스

	int grade;//학년 

	public Student(String name, int grade, int age) { //부모 매개변수 생성,부모에서 매개변수 하나더 생성되면 자식에도 추가해줘야함
		super(name,age); //부모생성자 호출하면서 name이라는 값 넘겨줌 name이 없으면 부모클래스의 기본생성자로 인식-> 현재 부모쪽에는 필드 생성자만 존재함 
		this.grade = grade;
		
	}
	
	
}
