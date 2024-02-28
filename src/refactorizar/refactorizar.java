/**
 * Clase que realiza operaciones de cálculo sobre una lista de números.
 * @author Laura
 * 
 */
package refactorizar;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta librería se importa para utilizar ArrayList.
 */
public class refactorizar {
	/**
	 * Método principal que demuestra el cálculo promedio de una lista de números.
	 * @param args Argumentos de la linea de comandos.
	 */
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(8);
        numeros.add(3);
        numeros.add(10);
        
        double promedio = calcularPromedio(numeros);
        if (promedio >= 7) {
            System.out.println("¡Felicidades! Has aprobado.");
        } else {
            System.out.println("Lo siento, has reprobado.");
        }
        System.out.println("El promedio final es: " + promedio);
    }
    
    /**
     * Calcula el promedio de una lista de números enteros.
     * @param Números Lista de numeros enteros.
     * @return El promedio de los números que están en la lista.
     */

	private static double calcularPromedio(List<Integer> numeros) {
		int sumar = 0;
        int cantidad = 0;
        
        /**
         * Pruebas de refactorizacion en Eclipse
         */
        
        for (Integer numero : numeros) {
            sumar = sumar + numero;
            cantidad++;
        }
        double promedio = (double) sumar / cantidad;
		return promedio;
	}
}
