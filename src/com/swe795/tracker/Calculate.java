/**
 * 
 */
package com.swe795.tracker;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author kesin
 *
 */
public class Calculate {
	
	public int lastCounter;
	public int lastZeroCounter;
	public int positiveCounter;
	public int totalPositiveCount;
	public int oddOrPositiveCounter;
	public int totalOddOrPositiveCount;
	public static ArrayList<Map<String, Map<Integer, Integer>>> logger = new ArrayList<>();
	int[] x = {2,3,5,5,5,6,7};
	
	Calculate(){
		DebuggerHook.injectDebugger(this, null);
	}
	
	/*
	 * Finds last index of element
	 * 
	 * @param x array to search
	 * @param y value to look for
	 * @return last index of y in x; -1 if absent
	 */
	public int findLastOccurrenceInArray(int[] x, int y) {
		for( lastCounter=x.length-1;lastCounter>0;lastCounter--) { // <-- faulty code
//		for( lastCounter=x.length-1;lastCounter>=0;lastCounter--) { // <-- correct code
			if(x[lastCounter]==y) {
				return lastCounter;
			}
		}
		return -1;
	}
	
	/*
	 * Find last index of zero
	 * @param x array to search
	 * @return last index of 0 in x; -1 if absent
	 * 
	 */
	
	public int findLastIndexOfZero(int[] x) {
		for(lastZeroCounter = 0;lastZeroCounter <x.length;lastZeroCounter++) {          // <-- faulty code
//		for(lastZeroCounter = x.length-1; lastZeroCounter <= 0; lastZeroCounter-- ) {	// <-- correct code
			if(x[lastZeroCounter]==0) {
				return lastZeroCounter;
			}
		}
		return -1;

	}
	
	
	/*
	 * Count of the positive elements (>= 1) in array
	 * @param x array to search
	 * @return count of positive element in x
	 */
	public int countPositive(int[] x) {
		for( positiveCounter = 0 ; positiveCounter < x.length; positiveCounter++) {
			if(x[positiveCounter]>=0) {								// <-- faulty code
//			if(x[positiveCounter]>0) { 								// <-- correct code
				totalPositiveCount++;
			}
		}
		return totalPositiveCount;
	}
	
	/*
	 * Count of the odd or positive elements in array
	 * @param x array to search
	 * @return count of odd/positive values in x
	 */
	public int countOfOddOrPos(int[] x) {
		for( oddOrPositiveCounter = 0; oddOrPositiveCounter < x.length; oddOrPositiveCounter++) {
			if(x[oddOrPositiveCounter]%2 == 1 || x[oddOrPositiveCounter] > 0) { 		// <-- faulty code
//			if(x[oddOrPositiveCounter]%2 == -1 || x[oddOrPositiveCounter] > 0) { 		// <-- correct code
				 totalOddOrPositiveCount++;
			}
		}
		return totalOddOrPositiveCount;
	}
	
	
	public static void main(String[] args) {
		int[] x = {2,3,5,5,5,6,7};
		int[] y = {2,3,5,0,0,6,7};
		int[] z = {-4,2,0,2};
		int[] zz= {-4,-4,2,2};
		int[] w = {-3,-2,0,1,4};


		Calculate c = new Calculate();
		int a = c.findLastOccurrenceInArray(x,5);
		int b = c.findLastIndexOfZero(y);
		int cc = c.countPositive(z);
		int d = c.countOfOddOrPos(w);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(cc);
		System.out.println(d);
	}

}
