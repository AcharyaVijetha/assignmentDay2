package com.demo.exe;

public class Mother extends Father {
	 int weight;
	public Mother(int age,String name,int weight) {
		super(age,name);
		this.weight=weight;
	}
	public String getDetails() {
		return super.getDetails()+" "+this.weight;
	}
	

}
