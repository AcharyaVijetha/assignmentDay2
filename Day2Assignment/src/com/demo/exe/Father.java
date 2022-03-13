package com.demo.exe;

public class Father {
	  int age;
 	String name; 
public Father(int age,String name) {
	this.name=name;
	this.age=age;
}

public String getDetails() {
	return age+" "+name;
}
}
