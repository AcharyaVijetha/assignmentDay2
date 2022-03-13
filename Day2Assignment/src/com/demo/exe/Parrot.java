package com.demo.exe;

public class Parrot extends Bird {
	public Parrot(String Color)
	{
		super(Color);
		
	}

	@Override
	public String getColor() {
		//System.out.println("parrot color is");
		return "parrot"+" "+"color"+" "+"is"+" "+super.getColor();
	}
	
}

