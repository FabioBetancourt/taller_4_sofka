

/**
 * Representa una clase abstracta de un sistema planetario. 
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */
public abstract class PlanetarySystem {

    public String name;

    public Integer ID;

    public Double mass;

    public Double density;

    public Double diameter;

    public Double distanceToTheSun;

    public Double gravity;

    public final Double universalGravitation = 6.67430E-11;

    public abstract String name();

    public abstract Integer ID();

    public abstract Double density();

    public abstract Double diameter();

    public abstract Double distanceToTheSun();

    public abstract Double gravity();

    public abstract Double mass();
}
