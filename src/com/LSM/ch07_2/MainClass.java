package com.LSM.ch07_2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double a; //8byte
		int b=10; // 4byte
		a=b; 
//		b=a; //a는 4byte b는 8byte이기 때문에 대입 X 따라서 double로 int를 바꿔줘야함 
		b = (int) a; //강제형변환
		
		String c="100";
		int d = Integer.parseInt(c); //문자열을 정수로 변환 java.lang소속의 integer.parseint
	

	
		Person person = new Person();
		Student student = new Student();
		Soldier soldier = new Soldier();
		
		person = student;
//		soldier = person;
//		soldier = student; 위 둘은 안됨
		student = (Student) person; //강제 형변환 자식클래스로 만듬
		
		Person person2 = new Student();
	}
}