package BasicProgramSolutions;

import java.util.Scanner;

import Utility.Utilityfunctions;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.print("Enter any number : ");
		Scanner sc =new Scanner(System.in);
    int Number= sc.nextInt();
    
String CheckEvenOdd =Utilityfunctions.Checkevenodd(Number);

System.out.println(CheckEvenOdd);
    }
    
	}


