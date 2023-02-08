
/**
 * Representa una clase Main llamada Main2 con un método main, la cual esta en 
 * un proyecto que contie otra clase Main con un método main. Tener un 
 * proyecto con dos clases Main con métodos main es POSIBLE de ejecutar, 
 * sin embargo se le tiene que especificar al IDE cual clase desea ejecutar.
 *  
 * 
 * En este proyecto la clase Main ejecuta el cálculo del área de un rectángulo. 
 * Si se le da ejecutar ahora mismo, calculara efectivamente el área del rectángulo.
 * Ahora, si se desea ejecutar Main2 para calcular el área de un circulo, lo que 
 * se debe de hacer es lo siguiente:
 * 
 * 1) Hacer click derecho en el proyecto (ejercicio_2 en este caso) y seleccionar 
 * properties.
 * 2) Seleccionar la pestaña RUN. En esta pestaña se puede notar que en el campo
 * MAIN CLASS esta seleccionada la clase Main.
 * 3. Hacer click en BROWSE y seleccionar la clase Main2. Ok para finalizar.
 * 
 * Ahora si ejecuta nuevamente el proyecto, en consola aparecerá el valor del 
 * área de un circulo. El paso a paso para cambiar de Main Class fue realizado
 * en el IDE de NetBeans. 
 * 
 * @author Fabio Betancourt - fabiobetancourt7@gmail.com
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * It represents the radius of the circle.
         */
        int radio = 5;
        /**
         * Represents the equation of the area of a circle.
         */
        double circleArea = Math.pow(radio, 2)*Math.PI;
        System.out.println ("The area of the circle is: " + circleArea);

    }
    
}
