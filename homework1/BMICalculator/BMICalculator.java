package ntou.cs.java2024;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the BMI (Body Mass Index) calculator");
        System.out.print("Please enter your weight (kilograms): ");
        double weight = scanner.nextDouble();
        System.out.print("Please enter your height (centimeters): ");
        double heightInCentimeters = scanner.nextDouble();
        double heightInMeters = heightInCentimeters / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        
        System.out.printf("Your BMI is %.1f ", bmi);
        
        if (bmi < 18.5) {
            System.out.println("(Underweight)");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("(Normal)");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("(Overweight)");
        } else {
            System.out.println("(Obese)");
        }
        scanner.close();
    }
}
