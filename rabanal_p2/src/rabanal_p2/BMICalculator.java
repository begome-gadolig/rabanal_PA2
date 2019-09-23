package rabanal_p2;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter \"E\" for English units (lb), or \"M\" for metric units (kg):");
		String unitsChoice = in.nextLine();
		
		if (unitsChoice.equalsIgnoreCase("E")) {
			System.out.println("Enter your weight in pounds:");
			double pounds = in.nextDouble();
			System.out.println("Enter your height in inches:");
			double inches = in.nextDouble();
			
			double bmi = 703 * pounds / (inches * inches);
			System.out.println("Your BMI: " + bmi);
			
			System.out.println("\nBMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
		}
		else if (unitsChoice.equalsIgnoreCase("M")) {
			System.out.println("Enter your weight in kilograms:");
			double kilograms = in.nextDouble();
			System.out.println("Enter your height in meters:");
			double meters = in.nextDouble();
			
			double bmi = kilograms / (meters * meters);
			System.out.println("Your BMI: " + bmi);
			
			System.out.println("\nBMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
		}
		
		in.close();
	}

}
