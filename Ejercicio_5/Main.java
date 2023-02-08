
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa una clase de un vehiculo.
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */

public class Main {

    public static void main(String[] args) {

        int vehicleCut=0;

        ArrayList[] garage = new ArrayList[10];


        for (int i=0; i<10;i++){

            System.out.println("Enter 1 for Car");
            System.out.println("Enter 2 for Motorcycle");
            System.out.println("Enter 3 for Truck");
            System.out.println("Enter 4 for Bike");
            System.out.println("Enter 5 for Boat");
            Integer vehicleType; 
            Scanner sc = new Scanner (System.in); 
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd hh:mm:ss"); 
            vehicleType = Integer.parseInt(sc.nextLine ());

            switch (vehicleType) {
                case 1 -> {
                    ArrayList<String> newCar = new ArrayList<>(); 
                    Car Car = new Car(); 
                    newCar.add("Car: " + Car.name());
                    newCar.add(Car.numberOfPassengers() + " crew");
                    newCar.add(Car.numberOfWheels() + " wheels");
                    String strDateC = dateFormat.format(Car.enrollmentDate()); 
                    newCar.add(strDateC);
                    newCar.add(Car.displacementMedium());
                    newCar.add(Car.crew());
                    newCar.add(Car.numberOfDoors() + " doors");
                    Car.setNewVehicle(newCar); 
                    System.out.println(Car.getNewVehicle());
                    garage[i] = newCar; 
                }
                case 2 -> {
                    ArrayList<String> newMotorcycle = new ArrayList<>();
                    Motorcycle Motorcycle = new Motorcycle(); 
                    newMotorcycle.add("Motorcycle: " + Motorcycle.name());
                    newMotorcycle.add(Motorcycle.numberOfPassengers() + " crew");
                    newMotorcycle.add(Motorcycle.numberOfWheels() + " wheels");
                    String strDateM = dateFormat.format(Motorcycle.enrollmentDate());
                    newMotorcycle.add(strDateM);
                    newMotorcycle.add(Motorcycle.displacementMedium());
                    newMotorcycle.add(Motorcycle.crew());
                    newMotorcycle.add(Motorcycle.cylinderCapacity());
                    Motorcycle.setNewVehicle(newMotorcycle);
                    System.out.println(Motorcycle.getNewVehicle());
                    garage[i] = newMotorcycle;
                }
                case 3 -> {
                    ArrayList<String> newTruck = new ArrayList<>(); /*Creation of list to save Truck data*/
                    Truck Truck = new Truck(); /*Creation of a Truck*/
                    newTruck.add("Truck: " + Truck.name());
                    newTruck.add(Truck.numberOfPassengers() + " crew");
                    newTruck.add(Truck.numberOfWheels() + " wheels");
                    String strDateCa = dateFormat.format(Truck.enrollmentDate()); /*Variable to pass the type registration Date to String.*/
                    newTruck.add(strDateCa);
                    newTruck.add(Truck.displacementMedium());
                    newTruck.add(Truck.crew());
                    newTruck.add("height: " + Truck.height() + " m");
                    Truck.setNewVehicle(newTruck); /*Method to establish the vehicle list already created. */
                    System.out.println(Truck.getNewVehicle());
                    garage[i] = newTruck; /*Array where each position is a list with a different vehicle. */
                }
                case 4 -> {
                    ArrayList<String> newBicycle = new ArrayList<>();
                    Bicycle bicycle = new Bicycle();
                    newBicycle.add("Truck: " + bicycle.name());
                    newBicycle.add(bicycle.numberOfPassengers() + " crew");
                    newBicycle.add(bicycle.numberOfWheels() + " wheels");
                    String strDateB = dateFormat.format(bicycle.enrollmentDate());
                    newBicycle.add(strDateB);
                    newBicycle.add(bicycle.displacementMedium());
                    newBicycle.add(bicycle.crew());
                    newBicycle.add(bicycle.typeBicycle());
                    bicycle.setNewVehicle(newBicycle);
                    System.out.println(bicycle.getNewVehicle());
                    garage[i] = newBicycle;
                }
                case 5 -> {
                    ArrayList<String> newBoat = new ArrayList<>();
                    Boat Boat = new Boat();
                    newBoat.add("Boat: " + Boat.name());
                    newBoat.add(Boat.numberOfPassengers() + " crew");
                    String strDateL = dateFormat.format(Boat.enrollmentDate());
                    newBoat.add(strDateL);
                    newBoat.add(Boat.displacementMedium());
                    newBoat.add(Boat.crew());
                    newBoat.add(Boat.typeBoat());
                    Boat.setNewVehicle(newBoat);
                    System.out.println(Boat.getNewVehicle());
                    garage[i] = newBoat;
                }
                default -> System.out.println("not set");
            }   

            System.out.println("Do you want to add another vehicle? Enter 1 for a new vehicle or 0 to end");
            Integer addVehicle;
            addVehicle = Integer.parseInt(sc.nextLine());
            vehicleCut = vehicleCut + 1;
                if (addVehicle==0){
                    i = i + 10;
                }
        }

            for (int j=0; j<vehicleCut;j++){
                System.out.println(garage[j]);
            }
    }
}