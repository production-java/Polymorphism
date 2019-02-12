package com.zoo.polymorphism;

public class Parrot extends Animals{
	
	@Override
	public  void sound() {
		System.out.println("kirkkirk   kirkk kirkkk");
	}

	public static  void main(String[] args) {
	Animals obj =  new Parrot();
	obj.sound();
}
}