package com.LSM.ch07_2_2;

public class Car {

	String carName;
	int maxSpeed;
	int year;
	int carPrice;
	
	Tire frontTire = new KumhoTire(); //앞바퀴는 금호
	Tire rearTire = new HankookTire(); //뒷바퀴는 한국
	//Tire가 각각의 부모클래스라서 자식클래스로 선언할수 있음
	
	//메개변수 인수로 금호타이어 객체가 들어오면->금호, 한국타이어 객체가 들어오면-> 한국으로 출력하는 메소드
	public void tirePrint(Tire tire) { //부모로 매게변수 넣으면 자식꺼 다 받을수 있음
		tire.tireName();
		
	}
}
