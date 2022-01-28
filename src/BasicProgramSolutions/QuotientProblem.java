package BasicProgramSolutions;

import java.util.Scanner;

import Utility.Utilityfunctions;

public class QuotientProblem {

	public static void main(String[] args) {
		System.out.println("Enter dividend number: ");
       
        Scanner sc =new Scanner(System.in);
       int dividend=  sc.nextInt();
       System.out.println("Enter divisior number: ");
       Scanner scanner =new Scanner(System.in);
      int divisor= scanner.nextInt();
		 

	    int quotient =Utilityfunctions.Quotient(dividend, divisor);
	    int remainder =Utilityfunctions.Remainder(dividend, divisor);

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);

	}

}
