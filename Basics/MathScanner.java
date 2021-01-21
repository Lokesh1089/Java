package LearnJava;

import java.util.Scanner;

public class MathScanner {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Math class
		int numOne =3;
		int numTwo =5;
		float numThree = 2.73f;
		System.out.println("Max num: " + Math.max(numOne, numTwo));
		System.out.println("Min num: " + Math.min(numOne, numTwo));
		System.out.println("Square root of num1: " + Math.sqrt(numOne));
		System.out.println("Absoulute value of num3: "+ Math.abs(numThree));
		System.out.println("Floor val of num3: " + Math.floor(numThree));
		System.out.println("Ceil val of num3: " + Math.ceil(numThree));
		System.out.println("Round val of num3: " + Math.round(numThree));
		
		//random num 
		
		System.out.println("Random num: " +Math.random());
		int randomNum = (int)(Math.random()*80);
		System.out.println("random num upto 80 : " +randomNum);
		
	
		// Scanner - getting input from user
		System.out.println("Enter Ypur Name, Age, City in Order !");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int age = input.nextInt();
		String city = input.next();
		System.out.println("Your Name is: " +name);
		System.out.println("Your Age is: " +age);
		System.out.println("Your city is: " +city);
		
		
		
		
	}

}
