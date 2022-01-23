package BasicProgramSolutions;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.print("Enter any number : ");
		Scanner sc =new Scanner(System.in);
    int Number= sc.nextInt();
    
    if(Number % 2 ==0) {
    	System.out.print(  Number+ " Number is even  ");
    	
    }
    else {
    	System.out.print(  Number+ " Number is odd  ");
    	
    }
    }
    
	}


