package com.bahamonde.utils.math;

public class MathUtils {
	
	public static int min(int... values) {
		int min = Integer.MAX_VALUE;
		for (int value : values) {
			if (Integer.MIN_VALUE == value) {
				return value;
			}
			
			min = Math.min(min, value);	
		}
		
		return min;
	}
	
	public static float min(float... values) {
		float min = Float.MAX_VALUE;
		for (float value : values) {
			if (Float.MIN_VALUE == value) {
				return value;
			}
			
			min = Math.min(min, value);	
		}
		
		return min;
	}
	
	public static double min(double... values) {
		double min = Double.MAX_VALUE;
		for (double value : values) {
			if (Double.MIN_VALUE == value) {
				return value;
			}
			
			min = Math.min(min, value);	
		}
		
		return min;
	}
	
	public static long min(long... values) {
		long min = Long.MAX_VALUE;
		for (long value : values) {
			if (Long.MIN_VALUE == value) {
				return value;
			}
			
			min = Math.min(min, value);	
		}
		
		return min;
	}

}
