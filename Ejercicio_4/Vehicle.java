
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Representa una clase de un vehiculo.
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */

public class Vehicle {
    
    /**
     * Owner, owner, brand or any name that identifies the vehicle
     */
    public String name;

    public Integer numberOfPassengers;

    public Integer numberOfWheels;

    public Date enrollmentDate;

    public String displacementMedium;

    public String crew;

    public ArrayList<String> newVehicle = new ArrayList<>();

    public String name() {
        System.out.println ("Enter owner, owner, brand or any name that identifies the vehicle: ");
        Scanner sc = new Scanner (System.in);
        name = sc.nextLine ();
        return (name);
    }

    public Integer numberOfPassengers() {
        System.out.println ("Enter the number of passengers that the vehicle carries: ");
        Scanner sc = new Scanner (System.in);
        numberOfPassengers = Integer.parseInt(sc.nextLine ());
        System.out.println ("The vehicle has " + numberOfPassengers + " passengers.");
        return (numberOfPassengers);
    }

    public Integer numberOfWheels() {
        System.out.println ("Enter the number of wheels of the vehicle: ");
        Scanner sc = new Scanner (System.in);
        numberOfWheels = Integer.parseInt(sc.nextLine ());
        System.out.println ("The vehicle has " + numberOfWheels + " wheels.");
        return(numberOfWheels);
    }

    public Date enrollmentDate() {
        int day = 0, month = 0, year;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the day of the vehicle registration date: ");
        try {
            day = Integer.parseInt(sc.nextLine ());
             if (day>31){
                 throw new Exception ("The number cannot be greater than 31");
             }
        } catch (Exception excdia){
            System.out.println (excdia.getMessage());
        }   
        System.out.println ("Enter the month of the vehicle registration date: ");
        try {
            month = Integer.parseInt(sc.nextLine ());
             if (month>12){
                 throw new Exception ("The number cannot be greater than 12");
             }
        } catch (Exception excmes){
            System.out.println (excmes.getMessage());
        }
        System.out.println ("Enter the year of the vehicle registration date: ");
        year = Integer.parseInt(sc.nextLine ());
        Date date = new Date(year-1900, month-1, day);
        enrollmentDate = date;
        System.out.println ("The registration date of the vehicle is: " + enrollmentDate + " ");
        return(enrollmentDate);
    }

    public String displacementMedium() {
        int mediumDis;
        System.out.println ("Enter 1 if the vehicle travels by terrestrial, "
                + "enter 2 if moving through water or enter any other number"
                + "if it is another type of media: ");
        Scanner sc = new Scanner (System.in);
        mediumDis = Integer.parseInt(sc.nextLine ());
        if (mediumDis==1){
            displacementMedium = "terrestrial";
        } else if (mediumDis==2){
            displacementMedium = "Aquatic";
        } else {
            System.out.println ("Enter different media type "
                    + "to terrestrial and aquatic: ");
            displacementMedium = sc.nextLine ();
        }   
        return(displacementMedium);
    }
    

    public String crew() {
        Integer nCrew;
        System.out.println ("Enter the number of crew members of the vehicle: ");
        Scanner sc = new Scanner (System.in);
        nCrew = Integer.parseInt(sc.nextLine ());
            if (nCrew>=1){
                crew = "crew presence";
            } else if (nCrew==0){
                crew = "no crew";
            }
        return(crew);
    }

    public ArrayList<String> getNewVehicle() {
        return newVehicle;
    }

    public void setNewVehicle(ArrayList<String> newVehicle) {
        this.newVehicle = newVehicle;
    }

}
