package com.bootcamp.corejava.lab3;

import java.util.Scanner;

/**
 * @author Shravani Reddy Kyasaram
 * Program to convert temperature from Celsius to Fahrenheit.
 * and to convert temperature from Fahrenheit to Celsius.
 */
public class CelsiusFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit");
		double celsius = sc.nextDouble();
		CelsiusFahrenheit cf = new CelsiusFahrenheit();
		cf.convertCelsiusToFahrenheit(celsius);
		System.out.println("Enter temperature in Celsius");
		double fahrenheit = sc.nextDouble();
		
		cf.convertFahrenheitToCelsius(fahrenheit);
		sc.close();
	}
	
	/**
	 * method to convert Celsius to Fahrenheit.
	 * @param f
	 */
	public void convertCelsiusToFahrenheit(double f){
		double convertCelsius = (5.0/9.0)*(f - 32);
		
		System.out.println("Temperature in Fahrenheit is: " +convertCelsius);
		
	}
	
	/**
	 * method to convert Fahrenheit to Celsius.
	 * @param c
	 */
	public void convertFahrenheitToCelsius(double c){
		double convertFahrenheit =  9 * (c / 5) + 32;
		System.out.println("Temperature in Celsius is:" +convertFahrenheit);
		
	}

}
