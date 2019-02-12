package com.tv.polymorphism;

public class CasioTV extends TV{
	
	@Override
	public void onbutton() {
	System.out.println("shutting off casio tv");	
	}
	
	public static void main(String[] args) {
	TV obj = new  CasioTV();
	obj.onbutton();

}
}
