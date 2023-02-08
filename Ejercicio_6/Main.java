package com.lonquers.Ejercicio_6;

import java.util.Scanner;
import java.util.Vector;

/**
 * Programa que lee números ingresados por consola y finaliza cuando se ingresa un 
 * número repetido. Al final, se muestran todos los números ingreados. 
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        int size = 1;

        int increment = 1;

        int dimmer = 0;

        Vector<Integer> Vector = new Vector<>(size, increment);

        do {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner (System.in);

        int number = Integer.parseInt(sc.nextLine());
            boolean dim = Vector.contains(number);
            if (!dim){
                Vector.add(number);
            } else {
                dimmer = dimmer + 1;
                System.out.println("The number entered was already found previously.");
            }
        } while (dimmer<1);
        System.out.println("The numbers entered are the following: ");
        System.out.println(Vector);
        System.out.println("The program has ended. ");
    }
}
