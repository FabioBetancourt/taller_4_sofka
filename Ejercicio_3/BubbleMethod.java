package com.lonquers.Ejercicio_3;

/**
 * Representa una clase para aplicar metodo de la burbuja para organizar números 
 * dentro de un array. 
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */

public class BubbleMethod {

    public static Double[] bubble(Double[] array) {
        Double aux;
        Double[] orderedArrangement;
        for(int i = 1; i < array.length; i++){
            for(int j = 0;j < array.length-i;j++){
                if(array[j] > array[j+1]) {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }   
            }
        }
        orderedArrangement = array;
    return orderedArrangement;
    } 
}
