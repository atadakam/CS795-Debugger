/**
 * 
 */
package com.swe795.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kesin
 *
 */
public class Test {
	private int param1;
	public static ArrayList<Map<String, Map<Double, Double>>> logger = new ArrayList<>();

	// dataStructure: field1, oldValue, newValue
	public Test(int param1) {
		System.out.println("THERE");

		DebuggerHook.injectDebugger(this, null);
		// Student obj = new Student("Smith", "CS", 22, 1212, 3);
		this.param1 = param1;
	}

	public static void main(String[] args) {

		// Person a = new Person("Anita", 26);
		// System.out.println("HERE");

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
		e.setMasonID(5);
		e.setMasonID(4);
		e.setMasonID(6);
		e.setMasonID(9);
		e.setYearsOnCampus(5);
		// System.out.println(e.toString());
		
//		Distance d0 = new Distance();
		Distance d1 = new Distance(2, 2, 3, 4);
		
//		System.out.println("Distance of d0: " + d0.calculateDistance());
		System.out.println("Distance of d1: " + d1.calculateDistance());
	}
}
