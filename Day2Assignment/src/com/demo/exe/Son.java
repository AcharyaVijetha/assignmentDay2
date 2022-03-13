package com.demo.exe;

public class Son extends Mother {
	String nickName;
	
public Son(int age,String name,int weight,String nickName)
{
super( age, name, weight);
this.nickName=nickName;

}
public String getDetails() {
	return super.getDetails()+" "+this.nickName;
	
}

}
