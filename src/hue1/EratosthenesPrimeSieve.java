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

        ep.primesList();
        ep.evenList();
        ep.printResults();

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

    public boolean isEven(int p) {

        if (p <= 2) {
            return false;
        }

        if (p % 2 == 0) {
            return true;
        }
        return false;
    }

    public void evenList() {
        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = i;
        }
        for (int i = 0; i < evenArray.length; i++) {
            if (isEven(evenArray[i]) == false) {
                evenArray[i] = -1;
            }
        }
        for (int i = 0; i < evenArray.length; i++) {
            if (evenArray[i] != -1) {
                evens.add(evenArray[i]);
                // System.out.println(evenArray[i]);
            }
        }

    }

    public void printResults() {
        for (int n = 0; n < evens.size(); n++) {
            for (int i = 0; i < primes.size(); i++) {
                boolean found = false;
                for (int j = 0; j < primes.size(); j++) {
                    if (primes.get(i) + primes.get(j) == evens.get(n)) {
                        System.out.println(evens.get(n) + ":" + primes.get(i) + "+" + primes.get(j));
                        found = true;
                        break;
                    }

                }
                if (found) {
                    break;
                }
            }
        }
    }
}
