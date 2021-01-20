package LearnJava;

import java.util.Scanner;

public class ConditionsLoop {
	
	public static void main(String[] args) {		
		//if
		if (5>2) {
			System.out.println("Five is greater than two");
		}
		
		int num1 = 35;
		int num2 = 96;
		if (num1<num2) {
			System.out.println("num1 is less than num2");
		}
		//else
		int num3 = 23;
		if(num3>45) {
			System.out.println("63 is greater than 45");
		} else {
			System.out.println("63 is smaller than 45");
		}
		
		String name = "Raj";
		
		if(name == "Raj") {
			System.out.println("You have entered correct user name");
		} else {
			System.out.println("Please check your user name");
		}
		
		// else if
		
		int num4 = 65;
		int num5 = 50;
		
		if (num4>num5) {
			System.out.println("num4 is greater than num5");
		} else if (num4==num5) {
			System.out.println("num4 , num5 are equal");
		} else {
			System.out.println("numr4 is less than num5");
		}
		
		String yourCity = "Tirupattur";
		
		if(yourCity=="Trivandrum") {
			System.out.println("Your home town");
		} else if(yourCity=="Chennai") {
			System.out.println("This is where you studied nd worked");
		} else if(yourCity=="Trivandrum") {
			System.out.println("Your birth place!");
		} else {
			System.out.println("Have fun bro Where ever you are...");
		}
			
		int sleepTime = 8 ;
		if ( sleepTime == 8 ) {
			System.out.println("You sleeped enough time");
		}else if (sleepTime<5) {
			System.out.println("its ok but try spent more time on sleep");
		} else{
			System.out.println("try focus on your health");
		}
		
		// Ternary operator or short hand if else
		
		int mark =25;
		String result = (mark>35) ? "Pass" : "Fail";
		System.out.println("Your Exam result is "+result);
		
		int age = 21;
		String vote = (age>18)?"Yeah ! You can vote" : "Plz wait for your turn";
		System.out.println("Am i elegible to vote ? : " +vote );
		
		// Switch

		int num  = 5;
		
		switch(num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		default:
			System.out.println("Given Number is greater than FIVE");
		
		}
		
		String myName;
		Scanner inputName = new Scanner(System.in);
		
		myName = inputName.nextLine();
		
		switch(myName) {
		case "ajay":
			System.out.println("Welcome! " +myName);
			break;
		case "murali":
			System.out.println("Welcome! " +myName);
			break;
		case "naveen":
			System.out.println("Welcome! " +myName);
			break;
		case "chinna":
			System.out.println("Welcome! " +myName);
			break;
		default:
			System.out.println("Sorry bro You are not allowed for this meet");
		}
	
		
		// For loop
		
		for(int i = 1; i<=5; i++) {
			System.out.println("Good Morning");
		}
		
		for(int j=5; j>=1;j--) {
			System.out.println("Hello !");
		}
		
		//while loop
		
		int number = 5;
		
		while(number<=8) {
			System.out.println("Im from while loop !!!!");
			number++;
		}
		
		int numberOne = 5;
		while(numberOne>=1) {
			System.out.println("Me too From while");
			numberOne--;
		}
		
		// do while
		int numberTwo = 1;
		
		do {
			System.out.println("from do while");
			numberTwo++;
		} while(numberTwo<=3);
		
		// do while will execute at least one even condition fails
		int numberThree = 5;
		do {
			System.out.println("Playing with Do while");
		} while(numberThree>6);
		
		
		// For for arrays
		
		String student[] = {"Mani","Naveen","Arjun","Raj"};
		// forward print
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i]);
		}
		//print in reverse order
		
		for(int j= student.length-1;j>0;j--) {
			System.out.println(student[j]);
		}
		
		// For each 
		
		String fruits[]= {"Appple", "kiwi","Guava","Orange"};
		
		for(String fru:fruits) {
			System.out.println(fru);
		}
		
		int nums[]= {1,2,3,4};
		
		for(int numEach:nums) {
			System.out.println(numEach);
		}
	}
}
