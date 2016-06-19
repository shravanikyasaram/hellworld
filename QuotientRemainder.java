package com.bootcamp.corejava.lab3;

import java.util.Scanner;

/**
 * @author Shravani Reddy Kyasaram
 * program that displays two numbers
 * and uses the / and % operators to display the result 
 * and remainder after they are divided. 
 */
public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		float number1 = sc.nextFloat();
		float number2 = sc.nextFloat();
		QuotientRemainder qr = new QuotientRemainder();
		qr.calculate_Quotient_Remainder(number1, number2);
		//System.out.println("result:" );
		sc.close();

	}
	
	/**
	 * method to calculate division and remainder
	 * @param num1
	 * @param num2
	 */
	public void calculate_Quotient_Remainder(float num1, float num2){
		float division = num1 / num2;
		float remainder = num1 % num2;
		
		System.out.println("Division: " +division);
		System.out.println("Remainder: " +remainder);
	}

}
