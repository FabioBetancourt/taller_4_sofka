/*
 * Taller 4 Sofka U
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa una clase de una bicicleta.
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */

public class Bicycle extends Vehicle {

    public String typeBicycle;
            
    @Override
    public String crew() {
        return super.crew();
    }

    @Override
    public String displacementMedium() {
        return ("terrestrial");
    }

    @Override
    public Date enrollmentDate() {
        return super.enrollmentDate();
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
        return super.getNewVehicle();
    }

    @Override
    public Integer numberOfWheels() {
        return (2); 
    }
    
    /**
     * Method that establishes the type of bicycle between 4 options, a
     * fifth option for the user to write the type of bicycle in case
     * that the 4 previous options is not the type of bicycle that is
     * want to register.
     * @return Type of bike.
     */
    public String typeBicycle( ){
        Integer type;
        System.out.println("Enter 1 if the bike is urban type, "
                + "enter 2 if mountain,"
                + "enter 3 if BMX,"
                + "enter 4 if tandem,"
                + "enter 5 if other and specify: ");
        Scanner sc = new Scanner (System.in);
        type = Integer.parseInt(sc.nextLine ());
        if (type==1){
            typeBicycle =("urban type");
        } else if (type==2){
            typeBicycle =("mountain type");
        } else if (type==3){
            typeBicycle =("BMX type");
        } else if (type==4){
            typeBicycle =("tandem type");
        } else if (type==5){
        System.out.println("Specify the type of bicycle: ");
            typeBicycle = (sc.nextLine ());
        } else {
            typeBicycle = "not specified";
        }
        return (typeBicycle);
    }

}
