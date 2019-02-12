package com.tv.polymorphism;

public class SamsungTV extends TV{
	
	@Override
	public void onbutton() {
		System.out.println("Shutting off Samsung TV");
			
		}
	
	public static void main(String[] args) {
		TV obj = new SamsungTV();
		obj.onbutton();
	
	}

}
