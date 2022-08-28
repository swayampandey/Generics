package com.bridgelabz.generics;

public class FindMaximumMain {
	/*
	 * Refator1 -->> Find maximum using single generic method
	 */

	public static void main(String[] args) {
		
		FindMaximum max = new FindMaximum();
		System.out.println("Maximumn in given Strings is :\n");
		max.maximum(15, 4, 42);
		System.out.println();
		max.maximum(1.5, 4.0, 4.2);
		System.out.println();
		max.maximum("abc", "tuv", "ghi");
	}

}
