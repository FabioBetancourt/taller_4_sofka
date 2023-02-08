
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa una clase de una lancha.
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */

public class Boat extends Vehicle {

    public String boatType;
    
    @Override
    public String crew() {
        return super.crew();
    }

    @Override
    public String displacementMedium() {
        displacementMedium = "Aquatic";
        return (displacementMedium);
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
    
    /**
     * Método que establece el tipo de lancha
     * @return tipo motor, vela o remo.
     */
    public String typeBoat() {
        Integer type;
        System.out.println("Enter 1 if the boat is a motor boat, enter 2 if it is a sailing or rowing boat");
        Scanner scannerInput = new Scanner(System.in);
        type = Integer.parseInt(scannerInput.nextLine());
        if (type==1){
            boatType =("Motor Type");
        } else if (type==2){
            boatType =("Sail or oar type");
        } else {
            boatType = "Not Specified";
        }
        return(boatType);
    }
}
