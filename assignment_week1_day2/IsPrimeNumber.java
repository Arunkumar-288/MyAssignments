package assignment_week1_day2;

import java.util.Scanner;

public class IsPrimeNumber {
     
    // Method to check if number is prime
    public static boolean isPrime(int n) {
        if (n<=1) {
            return false; // 1 and below are not prime
        }
        for (int i=2; i<=n/2;i++) {
            if (n%i==0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, prime number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }

        sc.close();
    }
}


