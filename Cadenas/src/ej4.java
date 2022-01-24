/**
 * 
 */
import java.util.Scanner;
/**
 * @author USUARIO
 *Repite el ejercicio anterior pero usando indexOf.

 */
public class ej4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un texto");
		String cadena = sc.nextLine();
		
		System.out.println("Introduce un caracter");
		char letra = sc.next().charAt(0);
		
		int posicion= cadena.indexOf(letra);
		if (posicion == -1) {
			System.out.println("No se ha encontrado");
		}
		while (posicion != -1) {
			System.out.printf("La letra %c está en la posición %d\n", letra, posicion);
			posicion=cadena.indexOf(letra,posicion+1);
		}
		
	}

}
