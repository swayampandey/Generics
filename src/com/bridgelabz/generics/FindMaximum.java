package com.bridgelabz.generics;

public class FindMaximum {
	/*
	 * UC1 -->> Find maximum in given three integer
	 */
	
	public String checkMaximum(String X, String Y, String Z) {
		
		String max = X;
		if(Y.compareTo(max) > 0) {
			max = Y;
		}
		else if(Z.compareTo(max) > 0) {
			max = Z;
		}
		System.out.println(max);
		return max;
	}
	
}
