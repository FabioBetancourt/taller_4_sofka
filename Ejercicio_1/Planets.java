
import java.util.Scanner;

/**
 * Representa una clase de un planeta, esta clase se extiende de la clase 
 * abstracta del sistema planetario. 
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */

public class Planets extends PlanetarySystem {

    /**
     * Método para ingresar el nombre del planeta
     * @return nombre del planeta
     */
    @Override
    public String name() {
        System.out.println ("Enter planet name");
        Scanner sc = new Scanner (System.in);
        name = sc.nextLine ();
        System.out.println ("The planet is called " + name);
        return (name);
    }

    /**
     * Method to enter planet identifier.
     * @return planet identifier.
     */
    @Override
    public Integer ID() {
        System.out.println ("Enter planet identifier number: ");
        Scanner sc = new Scanner (System.in);
        ID = Integer.parseInt(sc.nextLine());
        System.out.println ("The planet identifier " + name + " is " + ID);
        return (ID);
    }
    
    /**
     * Method for entering density.
     * @return planet density
     */
    @Override
    public Double density() {
        System.out.println ("Enter density of the planet in g/cm3");
        Scanner sc = new Scanner (System.in);
        density = Double.valueOf(sc.nextLine());
        System.out.println ("The density of the planet " + name + " is " + density + "g/cm3.");
        return (density);
    }

    /**
     * Method to enter the diameter of the planet.
     * @return diameter of the planet
     */
    @Override
    public Double diameter() {
        System.out.println ("Enter diameter of the planet in km: ");
        Scanner sc = new Scanner (System.in);
        diameter = Double.valueOf(sc.nextLine());
        System.out.println ("the diameter of the planet " + name + " is " + diameter + "km.");
        return (diameter);
    }

    /**
     * Method to enter the distance at which it orbits from the sun.
     * @return Distance to the sun.
     */
    @Override
    public Double distanceToTheSun() {
        System.out.println ("Enter distance from the sun of the planet in km: ");
        Scanner sc = new Scanner (System.in);
        distanceToTheSun = Double.valueOf(sc.nextLine());
        System.out.println ("The distance from the sun of the planet " + name + " is " + distanceToTheSun + "km.");
        return (distanceToTheSun);
    }
    
    /**
     * Method to enter the gravity of the planet
     * @return planet gravity.
     */
    @Override
    public Double gravity() {
        System.out.println ("Enter planet gravity in m/s2");
        Scanner sc = new Scanner (System.in);
        gravity = Double.valueOf(sc.nextLine());
        System.out.println ("The gravity of the planet " + name + " is " + gravity + "m/s2.");
        return (gravity);
    }
 
    /**
     * Method that calculates the mass of the planet.
     * @return planet mass.
     */
    @Override
    public Double mass() {
        Double radio = (diameter / 2) * 1000;
        mass = (gravity * radio * radio) / universalGravitation ;
        System.out.println ("the mass of the planet " + name + " is " + mass + "kg.");
        return (mass);
    }

}
