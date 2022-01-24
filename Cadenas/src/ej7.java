/**
 * 
 */
import java.util.Scanner;
/**
 * @author USUARIO
 *Contar el número de vocales de una frase.
 */
public class ej7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un texto");
		String cadena = sc.nextLine();
		int contador=0;
		for (int i=0; i<cadena.length(); i++) {
			if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u'))
			{ 
				contador++;
				} 
		}
		System.out.println("La palabra " + cadena + " contiene " + contador + " vocales");
	}

}
