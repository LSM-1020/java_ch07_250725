package com.LSM.ch07_2_2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car mycar = new Car();
		mycar.carName = "소나타";
		mycar.year = 2010;
		mycar.frontTire = new HankookTire();
		mycar.frontTire = new KumhoTire();
		mycar.tirePrint(new HankookTire());
		
		HankookTire hanTire = new HankookTire();
		KumhoTire kumTire = new KumhoTire();
		kumTire.tireName();
		
		
	}

}
