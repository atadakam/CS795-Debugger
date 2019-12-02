/**
 * 
 */
package com.swe795.tracker;

/**
 * @author kesin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HistoryVariable hv = new HistoryVariable("a");
		/*
		 * hv.update(90); hv.update(12.1D); System.out.println(hv.toString());
		 * System.out.println(hv.undo()); System.out.println(hv.undo());
		 * System.out.println(hv.undo()); System.out.println(hv.undo());
		 * System.out.println(hv.toString()); hv.dispose();
		 * System.out.println(hv.toString());
		 */
		System.out.println("IN MAIN");
		Employee e = new Employee("John", "Professor", 42, 2121, 12);
		/*e.setMasonID(5);
		e.setMasonID(4);
		e.setMasonID(6);
		e.setMasonID(9);
		e.setYearsOnCampus(5);*/
		// System.out.println(e.toString());
		
		
		//Distance d = new Distance(2.1, 1.1, 3.3, 4.4);
		

	}
}
