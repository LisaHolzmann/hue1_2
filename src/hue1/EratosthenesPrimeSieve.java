/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author holzm
 */
public class EratosthenesPrimeSieve {

    /**
     * @param args the command line arguments
     */
    static int[] primeArray = null;
    static int[] evenArray = null;

    static List<Integer> primes = new ArrayList<>();
    static List<Integer> evens = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        System.out.println("Obergrenze:");
        int ausw = Integer.parseInt(scanner.nextLine());
        EratosthenesPrimeSieve ep = new EratosthenesPrimeSieve(ausw);

    }

    public EratosthenesPrimeSieve(int grenze) {
        primeArray = new int[grenze];
        evenArray = new int[grenze];

    }

    public boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }
        if (p == 2) {
            return true;
        }

        for (int i = 2; i < p; i++) {

            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void primesList() {
        for (int i = 0; i < primeArray.length; i++) {
            primeArray[i] = i;
        }
        for (int i = 0; i < primeArray.length; i++) {
            if (isPrime(primeArray[i]) == false) {
                primeArray[i] = -1;
            }
        }
        for (int i = 0; i < primeArray.length; i++) {
            if (primeArray[i] != -1) {
                primes.add(primeArray[i]);
                // System.out.println(primeArray[i]);
            }
        }

    }
}
