package com.lonquers.Ejercicio_3;

import java.util.Scanner;

/**
 * Representa una programa para aplicar metodos para organizar números Reales 
 * (naturales, enteros, racionales e irracionales) dentro de un array. 
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter number of numbers of the vector:");
        Scanner sc = new Scanner (System.in);
        /**
         * Value given by the user to enter the size of the vector,
         *  that is, quantity of numbers.
         */
        Integer quantityNumbers = Integer.parseInt(sc.nextLine());
        Double numbers [] = new Double [quantityNumbers];
        
        /**
         * For loop that prints the randomly created vector to the console.
         */
        System.out.println("The generated vector is the following: ");
        System.out.print("|");
        for (int i=0; i<quantityNumbers;i++){
            numbers[i] = (Math.random()*(100+99)+-100);
            System.out.print (numbers[i]);
            if (i!=numbers.length-1) System.out.print("\t");
        }
        System.out.println("|");
        

        System.out.println("Enter 1 if you want to arrange the numbers in the vector by "
                + "the bubble method. ");
        System.out.println("Enter 2 if you want to arrange the numbers in the vector by "
                + "the QuickSort method. ");
        /**
         * Value that the user enters to know which method to choose
         * 1 for bubble and 2 for Quick Sort.
         */
        Integer choiceMethod = Integer.parseInt(sc.nextLine());

        switch(choiceMethod){
            case 1:
                Double orderedArrangement[] = com.lonquers.Ejercicio_3.BubbleMethod.bubble(numbers);
                System.out.println("The organized vector is the following: ");
                System.out.print("|");
                for(int j = 0; j < quantityNumbers;j++){
                    System.out.print(orderedArrangement[j]);
                    if (j!=orderedArrangement.length-1) System.out.print("\t");
                }
                System.out.print("|");
                break;
            
            case 2:
                com.lonquers.Ejercicio_3.QuickSortMethod.quicksort(numbers,0,quantityNumbers-1);
                System.out.println("The organized vector is the following: ");
                System.out.print("|");
                for(int i =0; i<numbers.length;i++){
                    System.out.print(numbers[i]);
                    if (i!=quantityNumbers-1) System.out.print("\t");
                }
                System.out.print("|");
                break;
            default:
                System.out.print("No method selected");
        }
    }
}
