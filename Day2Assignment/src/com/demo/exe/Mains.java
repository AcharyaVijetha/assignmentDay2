package com.demo.exe;

public class Mains {
	public static void main(String[] args) {
	Father f=new Father(45,"joy");
	System.out.println(f.getDetails());
	Mother  m=new Mother(40,"jesica", 30);
	System.out.println(m.getDetails());
	Son s=new Son(45,"james", 10,"jay");
	System.out.println(s.getDetails());
	}

}
