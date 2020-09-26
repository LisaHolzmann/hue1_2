/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue1;

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

}
