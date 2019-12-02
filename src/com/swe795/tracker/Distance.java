package com.swe795.tracker;

public class Distance {
	double x1, y1;
	double x2, y2;
	
	double x2_1, y2_1;
	
	double distance;
	
	public Distance() {
		DebuggerHook.injectDebugger(this, null);

		x1 = 0;
		x2 = 0;
		
		x2 = 1;
		y2 = 1;
	}
	
	public Distance(double x1, double y1, double x2, double y2) {
		DebuggerHook.injectDebugger(this, null);
		this.x1 = x1;
		this.y1 = y1;
		
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public static double calculateSquared(double a) {
		return Math.pow(a, 2);
	}
	
	public static double calculateSquaredRoot(double a) {
		return Math.pow(a, 0.5);
	}
	
	
	public double calculateDistance() {
		x2_1 = (x2 - x1);
		y2_1 = (y2 - y1);
		
		// formula ( (x2-x1)^2 + (y2-y1)^2 )^0.5
		return distance = calculateSquaredRoot(calculateSquared(x2_1) + calculateSquared(y2_1));
	}
}
