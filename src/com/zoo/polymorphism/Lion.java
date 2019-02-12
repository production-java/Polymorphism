package com.zoo.polymorphism;

public class Lion extends Animals{
	
	@Override
	public void sound() {
	System.out.println("argargarga");

	}
	
	public static  void main(String[] args) {
		Animals obj = new Lion();
		obj.sound();
	}
}