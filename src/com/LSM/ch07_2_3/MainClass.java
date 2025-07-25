package com.LSM.ch07_2_3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//업 캐스팅
		Animal animal = new Dog(); 
		animal.name = "똘똘이";
//		animal.age = 4; //자식클래스 필드는 접근 불가
		animal.sound(); // 멍멍 이 출력-> 오버라이딩된 메소드가 실행됨 Dog클래스
		
		//다운 캐스팅
		Dog dog;//선언 일단 하고
		dog = (Dog) animal;//다운 캐스팅 위에서 만든 animal
		
		dog.age=10;
		dog.name="멍멍이";
		dog.sound();
		
		Animal animal2 = new Animal(); //인스턴스화 -> 실제 객체가 Animal클래스로 만들어짐
//		Dog dog2 = (Dog) animal2; //이 코드는 에러 발생 , ClasscasException 발생 위에서 부모가 새 메모리가 
								  //만들어졌는데 다운캐스팅을 하려고 해서 오류
		
		Animal animal3 = new Cat();
//		animal.eat; -> 자식 메소드는 접근 불가 오버라이딩을 하고 메소드로 접근해야함
		animal3.eat();
		Cat cat;
		cat=(Cat) animal3;
		
		
	}

}
