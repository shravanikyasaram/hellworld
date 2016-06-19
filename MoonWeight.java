package com.bootcamp.corejava.lab3;

import java.util.Scanner;

/**
 * @author Shravani Reddy Kyasaram
 * Program to convert earth weight to moon weight
 */
public class MoonWeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight to be calculated");
		Double Weight = sc.nextDouble();
		MoonWeight mw = new MoonWeight();
		System.out.println("Moon weight is:" +mw.getMoonWeight(Weight));
		sc.close();		

	}
	
	/**
	 * Method to calculate weight on moon
	 * @param a
	 * @return moon_weight
	 */
	public double getMoonWeight(double a){
		double moon_weight = a * .17D;
		return moon_weight;
		
	}

}
