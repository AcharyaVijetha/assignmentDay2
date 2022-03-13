package com.demo.exe;

public class Duck extends Bird {
	
	public Duck(String Color){
		super(Color);
		
	}

	@Override
	public String getColor() {
	
	//System.out.println("Duck"+" "+"color"+" "+"is"+" "+super.getColor());
	return "Duck color is"+super.getColor();

	   
		
		
	}
}
