package com.swe795.tracker;

import java.util.ArrayList;

public class Person {
	private String name = "Smith";
	private int age;
	
	/*public static ArrayList<String> fieldsList = new ArrayList();
	public static ArrayList<Integer> oldValueList = new ArrayList();
	public static ArrayList<Integer> newValueList = new ArrayList();*/
	

	
	public Person(String name, int age) {
		//DebuggerHook.injectDebugger(this, null);
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String wakeUpTime(){
		return "6am";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	//methods: (constructors), getName, setName, getAge, setAge
}
