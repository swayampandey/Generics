package com.bridgelabz.generics;

public class FindMaximum {
	
	public  <T extends Comparable<T>> T maximum(T x, T y, T z) {
		
		T max = x; 	// assuming x as largest initially
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println("Values are : "+x+" "+y+" "+z);
		System.out.println("The Max of 3 Values : "+max);
		return max;
	}
	
	
	
}
