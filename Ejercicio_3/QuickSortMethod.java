package com.lonquers.Ejercicio_3;

/**
 * Representa una clase para aplicar metodo de Quick Sort para organizar números 
 * dentro de un array. 
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */

public class QuickSortMethod {
    public static void quicksort(Double[] array, int first, int last){
        int central,i,j;
        Double pivot;
        central=(first+last)/2;
        pivot=array[central];
        i=first;
        j=last;
        
        do{
            while(array[i]<pivot) i++;
            while(array[j]>pivot) j--;
                if(i<=j){
                    Double temp;
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                    i++;
                    j--;
                }
        }
        while(i<=j);
            if(first<j)
                quicksort(array,first,j);
            if(i<last)
                quicksort(array,i,last);
    }
}
