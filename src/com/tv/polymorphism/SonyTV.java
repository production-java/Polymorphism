package com.tv.polymorphism;

public class SonyTV extends TV{
	
	@Override
	public void onbutton() {
	System.out.println("Turning  on sony tv");

			
	}
	public static void main(String[] args) {
	TV obj = new SonyTV();
	obj.onbutton();
}
	
}
