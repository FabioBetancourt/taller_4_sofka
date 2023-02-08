
import java.util.Scanner;

/**
 * Representa una clase para el cálculo de la atracción o fuerza gravitatoria. 
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */
public class GravitationalAttraction {
    
    /**
     * Declaring name of the first planet
     */
    public String planet1;
    /**
     * Name of the second planet for calculation of gravitational attraction
     */
    public String planet2;
    /**
     * Variable for calculating the gravitational force.
     */
    public Double gravitationalForce;
    /**
     * Distance between centers of the planets to calculate the gravitational attraction.
     */
    public Double distancePlanets;
    /**
     * Universal gravitational constant.
     */
    public final Double universalGravitation = 6.67430E-11;

    /**
     * Method to enter the name of the planet 1
     * @return planet name 1
     */
    public String planet1() {
        System.out.println ("Enter name of planet 1 to calculate gravitational pull: ");
        Scanner sc = new Scanner (System.in); /*Create a Scanner object*/
        planet1 = sc.nextLine (); /* We call a method on a Scanner object */
        return (planet1);
    }
    
    /**
     * Method to enter the name of the planet 2
     * @return planet name 2
     */
    public String planet2() {
        System.out.println ("Enter name of planet 2 to calculate gravitational pull: ");
        Scanner sc = new Scanner (System.in);
        planet2 = sc.nextLine ();
        return (planet2);
    }
    
    /**
     * Method to enter the distance between planets in km.
     * @return distance between centers of the planets in km
     */
    public Double distancePlanets() {
        System.out.println ("Enter distance between planets in km in to calculate gravitational pull: ");
        Scanner sc = new Scanner (System.in);
        distancePlanets = Double.valueOf(sc.nextLine());
        return (distancePlanets);
    }
    
    /**
     * Method to calculate the gravitational force.
     * @param massPlanet1 mass of planet 1
     * @param massPlanet2 mass of planet 2
     * @param distancePlanets distance between planets
     * @return force or gravitational attraction.
     */
    public Double gravitationalForce (Double massPlanet1, Double massPlanet2, Double distancePlanets) {
        Double distancePlanetsMeters = distancePlanets * 1000;
        gravitationalForce = ((massPlanet1 * massPlanet2)/Math.pow(distancePlanetsMeters, 2))*universalGravitation;
        return gravitationalForce;
    }

}
