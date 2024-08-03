package assesment;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter an interger: ");
	        int number =1000;

	        int count = String.valueOf(number).length();
	        System.out.println("Number of digits in " + number + " is: " + count);

	         scanner.close();
	    }
	

	}


