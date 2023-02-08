/*
 * Taller 4 - Sofka U
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa una clase de una moto.
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */

public class Motorcycle extends Vehicle {
    

    public String cylinderCapacity;
    
    @Override
    public String crew() {
        return super.crew();
    }

    @Override
    public String displacementMedium() {
        displacementMedium = "Terrestrial";
        return (displacementMedium);
    }

    @Override
    public Date enrollmentDate() {
        return super.enrollmentDate();
    }

    @Override
    public Integer numberOfWheels() {
        numberOfWheels = 2;
        return numberOfWheels;
    }

    @Override
    public Integer numberOfPassengers() {
        return super.numberOfPassengers();
    }

    @Override
    public String name() {
        return super.name();
    }
     
    @Override
    public void setNewVehicle(ArrayList<String> newVehicle) {
        super.setNewVehicle(newVehicle);
    }

    @Override
    public ArrayList<String> getNewVehicle() {
        return super.getNewVehicle(); //
    }
    

    public String cylinderCapacity() {
        Integer displacementValue;
        System.out.println("Enter 1 if the displacement is high, enter 2 if it is low");
        Scanner sc = new Scanner (System.in);
        displacementValue = Integer.parseInt(sc.nextLine ());
        if (displacementValue==1){
            cylinderCapacity =("high cylinder");
        } else if (displacementValue==2){
            cylinderCapacity =("under cylinder");
        } else {
            cylinderCapacity = "not specified";
        }
        return(cylinderCapacity);
    }  

}
