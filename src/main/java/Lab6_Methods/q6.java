
package Lab6_Methods;


package com.mycompany.lab_6_methods;

public class q6 {

    public static void main(String[] args) {
        
        // --- PART 1: First 20 Palindromic Primes ---
        System.out.println("First 20 Palindromic Primes:");
        int count = 0;
        int n = 0;
        
        while (count < 20) {
            if (isPalindromicPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
        System.out.println(); // New line
        

        // --- PART 2: First 20 Emirps ---
        System.out.println("\nFirst 20 Emirps:");
        count = 0;
        n = 0;
        
        while (count < 20) {
            if (isEmirp(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
        System.out.println();
    }

    // ==========================================
    //           THE REQUIRED METHODS
    // ==========================================

    // 1. Check if Palindromic Prime
    // (Must be Prime AND a Palindrome)
    public static boolean isPalindromicPrime(int n) {
        if (isPrime(n) && isPalindrome(n)) {
            return true;
        }
        return false;
    }

    // 2. Check if Emirp
    // (Must be Prime AND Reverse is Prime AND Not Palindrome)
    public static boolean isEmirp(int n) {
        if (isPrime(n)) {
            int reversed = reverse(n);
            // Check if reversed is a DIFFERENT prime number
            if (n != reversed && isPrime(reversed)) {
                return true;
            }
        }
        return false;
    }

    // ==========================================
    //             HELPER METHODS
    // ==========================================

    // Helper: Check if a number is Prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        
        // Check divisibility from 2 up to square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, so not prime
            }
        }
        return true;
    }

    // Helper: Reverse a number (e.g., 13 -> 31)
    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
    
    // Helper: Check if Palindrome using the reverse helper
    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
}
