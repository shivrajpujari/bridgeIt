
/*
 * 
 *  Purpose:To generate n distinct random numbers and count that number of randomness to generate total coupon  .
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   04-4-2018
 * 
 * */

package com.bridgeIt.functionalPrograms;

import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class Coupon {

	public static void main(String[] args) {
	
		System.out.println("Enter the N term:");
		int n = Utility.inputInt();
		Utility.NUMBER=n;
		int[] b=Utility.coupon(n);
		System.out.println(Arrays.toString(b));			
		
	}

}
