
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa una clase de un coche. 
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */

public class Car extends Vehicle {

    public Integer numberOfDoors;
    public ArrayList<String> car = new ArrayList<>();

    @Override
    public String name() {
        return super.name();
    }
    
    @Override
    public Integer numberOfWheels() {
        numberOfWheels = 4;
        return (numberOfWheels);
    }
    
    @Override
    public Integer numberOfPassengers() {
        return super.numberOfPassengers();
    }

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
    public void setNewVehicle(ArrayList<String> newVehicle) {
        super.setNewVehicle(newVehicle);
    }

    @Override
    public ArrayList<String> getNewVehicle() {
        return super.getNewVehicle();
    }
    

    public Integer numberOfDoors() {
        Integer numberOfDoors=0;
        System.out.println("Enter number of car doors");
        Scanner sc = new Scanner (System.in);

         try {
            numberOfDoors = Integer.parseInt(sc.nextLine ());
             if (numberOfDoors>5){
                 throw new Exception ("The number cannot be greater than 5");
             } else if (numberOfDoors<2) {
                 throw new Exception ("The number cannot be less than 2");
             } else if (numberOfDoors==4) {
                 throw new Exception ("The number cannot be equal to 4");
             }
        } catch (Exception excdia){
            System.out.println (excdia.getMessage());
        }   
        
        if (numberOfDoors==3){
            this.numberOfDoors =3;
            System.out.println("The car has 3 doors");
        } else if (numberOfDoors==5){
            this.numberOfDoors =5;
            System.out.println("The car has 5 doors");
        } else {
            this.numberOfDoors =numberOfDoors;
            System.out.println("The value is not adequate");
        }
        return(this.numberOfDoors);
    }  
        
}
