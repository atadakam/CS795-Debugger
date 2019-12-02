package com.swe795.tracker;

//Anita Tadakamalla
//CS 211
//Coding Ex 6
//10/16/2014


public abstract class MasonPerson extends Person{
	private int masonID, yearsOnCampus;

	public MasonPerson(String name, int age, int masonID, int yearsOnCampus) {
		super(name, age);

		this.masonID = masonID;
		this.yearsOnCampus = yearsOnCampus;
	}
	
	/**
	 * 
	 */
	public MasonPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public abstract String favoriteFoodSite();
	
	public int getMasonID() {
		return masonID;
	}

	public void setMasonID(int masonID) {
		this.masonID = masonID;
	}

	public int getYearsOnCampus() {
		return yearsOnCampus;
	}

	public void setYearsOnCampus(int yearsOnCampus) {
		this.yearsOnCampus = yearsOnCampus;
	}
}
