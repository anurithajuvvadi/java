package com.spring.constructor;

public class Person {
private String pname;
private int id;

private Certificate certi;

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public Person(String pname, int id, Certificate certi) {
	super();
	this.pname = pname;
	this.id = id;
	this.certi = certi;
}

@Override
public String toString() {
	return "Person [pname=" + pname + ", id=" + id + ", certi=" + certi + "]";
}

}
