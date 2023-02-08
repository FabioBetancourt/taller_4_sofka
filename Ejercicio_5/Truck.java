
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa una clase de un camión.
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */

public class Truck extends Vehicle {

    public Float height;
    
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
        numberOfWheels = 4;
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
        return super.getNewVehicle();
    }
    

    public Float height() {
        System.out.println("Enter the height of the truck in meters: ");
        Scanner sc = new Scanner (System.in);
        height = Float.valueOf(sc.nextLine ());
        return (height);
    }
    
}
