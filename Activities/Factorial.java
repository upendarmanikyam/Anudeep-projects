package javafullstack;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number : ");
		        int n = scanner.nextInt();
		        scanner.close();

		        int factorial = 1;
		        for (int i = 1; i <= n; i++) {
		            factorial *= i;
		        }
		        System.out.println("Factorial of " + n + " is: " + factorial);
		    }
		}

		        

	


