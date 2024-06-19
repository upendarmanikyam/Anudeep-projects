package javafullstack;
import java.util.Scanner;

public class OddSumArray {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > 0 && a[i] % 2 != 0) {
                sum += a[i];
            }
        }

        // Print the sum of positive odd numbers
        System.out.println("Sum of positive odd numbers: " + sum);

        
    }
}


