package LearnJava;

public class typecastStringOpertors {
	public static void main(String[] args) {
		
		//Type casting
			//Widening casting
		byte num = 85;
		int num2 = num;
		num2 = 3485353;
		System.out.println(num);
		System.out.println(num2);
		
		int num3 = 124785;
		long num4 = num3;
		System.out.println(num3);
		System.out.println(num4);
		byte b = 9;
		double d = b;
		System.out.println(b);
		System.out.println(d);
		
		
			//Narrowing casting
		float f = 12.36f;
		byte b1 = (byte)f;
		System.out.println(f);
		System.out.println(b1);
		
		double d1 = 528659.63445;
		int ie = (int)d1;
		System.out.println(d1);
		System.out.println(ie);
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//String
		
		String name = "Veera";
		System.out.println(name);
			//length of the string
		String sent = "Hello this is sample sentence";
		int len = sent.length();
		System.out.println("Length of the sentence: " +len);
			//to upper to lower
		String name2 = "madhavan";
		String name3 = "MADDY";
		System.out.println("madhavan in upper case: " +name2.toUpperCase());
		System.out.println("MADDY in lower case: " +name3.toLowerCase());
			//index
		String greetings = "Wish you happy Pongal";
		int index = greetings.indexOf("happy");
		System.out.println("Index of the happy in greetings is: " +index);
			// concat
		String firstName = "Ajay";
		String lastName = "Ganesh";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		String xx = "89";
		String yy = "21";
		System.out.println(xx+yy);
		
		String myName = "Karthick";
		int myAge = 23;
		System.out.println(myName+myAge);
		
		// escape sequences \' \" \\ \t \b \n \r \f
		
		String sent1 = "This is a worlds \"fastest\" car!";
		System.out.println(sent1);
		String sent2 = "This is a \'smallest\' bike in the world";
		System.out.println(sent2);
		String sent3 = "Hey hi \\gopher!\\ im learning java";
		System.out.println(sent3);
		String nam1 = "Varun\nKumar";
		System.out.println(nam1);
		String nam2 = "Krithick\tVarun";
		System.out.println(nam2);
		String nam3 = "Ashwin  Kumar";
		System.out.println(nam3);
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//Operators
		
			// Arithmetic operators
		System.out.println("Arithimetic operation results");
		int numb1 = 13;
		int numb2 = 34;
		System.out.println(numb1+numb2);
		System.out.println(numb2-numb1);
		System.out.println(numb1*numb2);
		System.out.println(numb2/numb1);
		System.out.println(numb2%numb1);
		
			//Assignment operators
		System.out.println("Assignment operators");
		 numb1 += 4;
		System.out.println(numb1);
		numb2 *= 2;
		System.out.println(numb2);
		numb2 -= 26;
		System.out.println(numb2);
			// Comparison operators
		int i = 12;
		int j = 8;
		System.out.println("Comparison operators");
		System.out.println(i==j);
		System.out.println(i!=j);
		System.out.println(i>j);
		System.out.println(i<j);
		System.out.println(i>=j);
			// Logical operators
		int m = 5;
		int n = 17;
		System.out.println("Logical operators");
		System.out.println(m>6 && n>15);
		System.out.println(m>5 || n>15);
		System.out.println(!(m==5 && n==17));
		
	}

}
