package com.LSM.ch07_2_2;

public class TireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire tire = new Tire();
		
		tire = new KumhoTire(); //업캐스팅
		
//		Tire tire2 = new Tire();
//	
		KumhoTire kumho2;
		kumho2 = (KumhoTire) tire; //부모를 자식으로 강제형변환 //다운캐스팅
		
		kumho2.tireName = "스노우 타이어";
		
		System.out.println(kumho2.tireName);
		
	}

}
