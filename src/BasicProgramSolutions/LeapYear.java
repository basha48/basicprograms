package BasicProgramSolutions;

import java.util.Scanner;

import Utility.Utilityfunctions;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("please any 4 digit year : ");
		int year =scanner.nextInt();
	String Year=	Utilityfunctions.CheckLeapYear(year);
	 System.out.println(  Year );
//		 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
//	         System.out.println( +year + "year is a leap year");
//	      else
//	         System.out.println( + year + " year is not a leap year");
//	   }
//		
	}
}


