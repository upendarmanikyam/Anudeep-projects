package javafullstack;
import java.util.Scanner;
public class SumofEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = sc.nextInt();

		        int sum = 0;
		        for (int i = 2; i <= number; i ++) {
		            sum += i;
		            
		        }

		        System.out.println("Sum of even numbers from 1 to " + number + " = " + sum);
		    }
		

	}


