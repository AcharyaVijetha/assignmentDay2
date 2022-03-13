package com.demo.exe;

public class Eagle extends Bird  {
	public Eagle(String Color)
	{
		super(Color);
		
	}
	
	public String getColor(){
		 //System.out.println("Eagle color is Brown");
		return "Eagle color is"+super.getColor();
	}

}


