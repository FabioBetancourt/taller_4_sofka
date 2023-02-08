
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa un algoritmo para la creación de planetas 
 * y calculo de fuerza gravitatoria.
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */
public class Main {
    
    /**
     * main method for creating objects (planets).
     * @param args 
     */
    public static void main(String[] args) {

        /**
         * Switch to finish creating planets.
         */
        Integer countCut = 0;
        /**
         * Planet creation counter.
         */
        Integer countPlanets = 0;
        /**
         * List where created planets are stored.
         */
        ArrayList<String> listPlanets = new ArrayList<>();
        
        /**
         * Do-while loop for planet creation. planets will be created
         * as long as the countCut switch is still set to 0.
         */
        do{
            countPlanets = countPlanets + 1; /* counter, add +1
                                                         since a new one is going to be created */
            
            Planets planet = new Planets(); /* Creation of a new planet*/
            listPlanets.add(planet.name());
            listPlanets.add(Integer.toString(planet.ID()));
            listPlanets.add(Double.toString(planet.diameter()));
            listPlanets.add(Double.toString(planet.density()));
            listPlanets.add(Double.toString(planet.distanceToTheSun()));
            listPlanets.add(Double.toString(planet.gravity()));
            listPlanets.add(Double.toString(planet.mass()));
            
            
            System.out.println("Do you want to add another planet? Enter any number to continue\"\n" +
                    "                     + \"adding planets or 0 to finish adding");
            Scanner sc = new Scanner (System.in);

            Integer addPlanet = Integer.parseInt(sc.nextLine());

                if (addPlanet==0){
                    countCut = countCut + 1;
                    System.out.println("He has finished creating the planetary system");
                    }
            }
        while (countCut<1);

        GravitationalAttraction GForce = new GravitationalAttraction();
        int posMass1=listPlanets.indexOf(GForce.planet1())+6;
        Double mass1=Double.parseDouble(listPlanets.get(posMass1));
        int posMass2=listPlanets.indexOf(GForce.planet2())+6;
        Double mass2=Double.parseDouble(listPlanets.get(posMass2));
        /**
         * It requests distance value between planets.
         */
        Double distancePlanets = GForce.distancePlanets();
        /**
         * Calculation of the gravitational attraction.
         */
        GForce.gravitationalForce(mass1, mass2,distancePlanets);
        System.out.println("The gravitational force is: " + GForce.gravitationalForce + " N.");
    }
}
