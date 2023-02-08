
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa una clase abstracta de un vehiculo
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        
        /**
         * It represents a switch to limit the creation of vehicles to 10.
         */
        int vehiclesCount=0;
        /**
         * Matrix garage to save the created vehicles.
         */
        ArrayList garage[]= new ArrayList[10];

        /**
         * For cycle to create vehicles, maximum 10 vehicles.
         */
        for (int i=0; i<10;i++){
            /**
             * Creation of list to save vehicle data.
             */
            ArrayList<String> newVehicle = new ArrayList<>();
            /**
             * Creation of a new vehicle.
             */
            Vehicle Vehicle = new Vehicle();

            /**
             * Implementation of methods of the vehicle class that are added to the list created previously.
             */
            newVehicle.add(Vehicle.name());
            newVehicle.add(Integer.toString(Vehicle.numberOfPassengers()));
            newVehicle.add(Integer.toString(Vehicle.numberOfWheels()));
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd hh:mm:ss");
            /**
             * Variable to pass the registration date of type Date to String.
             */
            String strDate = dateFormat.format(Vehicle.enrollmentDate());
            newVehicle.add(strDate);
            newVehicle.add(Vehicle.displacementMedium());
            newVehicle.add(Vehicle.crew());
            Vehicle.setNewVehicle(newVehicle);
            System.out.println(Vehicle.getNewVehicle());
            
            /**
             * Conditional to establish if the user wants to create less than 10 vehicles.
             */
            System.out.println("Do you want to add another vehicle? Enter 1 for a new vehicle or 0 to end: ");
            Integer addVehicle;
            Scanner sc = new Scanner (System.in);
            addVehicle = Integer.parseInt(sc.nextLine());
            garage [i] = newVehicle;
            vehiclesCount = vehiclesCount + 1;
                if (addVehicle==0){
                    i = i + 10;
                }
        }
        /**
         * Cycle for to print the vehicles created on the console.
         */
        for (int j=0; j<vehiclesCount;j++){
            System.out.println(garage[j]);
        }
    }
}