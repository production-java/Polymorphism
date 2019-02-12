package com.zoo.polymorphism;

public class Tiger extends Animals{
	
	@Override
	public void sound() {
		System.out.println("aarhkkkkarhkkk  arkhh");
		
	}
	
	public static void main(String[] args) {
	Animals  obj =  new Tiger();
	obj.sound();

}

}