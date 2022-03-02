package com.company;

public class SieveOfEratosthenes {

    /**
     *  Input: The specified value we want prime numbers less than.
     *  Output: Prints out the prime numbers less than the specified value.
     *  Description: Print all the prime numbers less than a specified value.
     */
    public static void Sieve(int n) {
        boolean[] a = new boolean[n];
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for (int i = 2; i < n; i++) {
            a[i] = true;
        }
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for (int i = 2; i < n; i++) {
            if(a[i] != false){
                for (int j = i; j * i < n; j++){
                    a[i*j] = false;
                }
            }
        }
        System.out.println("Number of prime numbers up to "+ n +":");
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for(int i = 2; i < n; i++){
            if (i > n - 100){
                if (a[i]){
                    System.out.print(" " + i);
                }
            }
        }System.out.println();
    }
}
