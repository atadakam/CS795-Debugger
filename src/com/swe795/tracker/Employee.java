package com.swe795.tracker;

public class Employee extends MasonPerson {
	private String x,jobTitle;

	public Employee(String name, String jobTitle, int age, int masonID, int yearsOnCampus) {
		super(name, age, masonID, yearsOnCampus);
		//DebuggerHook.injectDebugger(this, null);
		this.jobTitle = "Professor";
	}
	
	public Employee() {
		super();
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String favoriteFoodSite() {
		return "tacobell";
	}

	@Override
	public String wakeUpTime(){
		return "7am";
	}
	
	 @Override
	    public String toString()
	    {
		 System.out.println(this+"-----------");
	        return x.toString();
	    }
}
