package com.bootcamp.corejava.lab3;


/**
 * @author Shravani REddy Kyasaram
 * Program that calculates investment
 */
public class Investment {

	public static void main(String[] args) {
		float total = 14000;
		System.out.println("Original investment: $" +total);
		
		//Increased by 40 percent
		total = total + (total * 0.4F);
		System.out.println("After one year: $" +total);
		
		//Loses 1500$ the second year
		total = total + (total - 1500);
		System.out.println("After two years: $" +total);
		
		//Increased by 12 percent the third year
		total = total * .12F;
		System.out.println("After third year: $" +total);

	}

}
