/**
 * 
 */
import java.util.Scanner;
/**
 * @author USUARIO
 *Programa que reciba como entrada una cadena y un carácter y escriba cuántas veces 
		aparece ese carácter en la cadena. No se puede usar indexOf.
 */
public class ej5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un texto");
		String cadena = sc.nextLine();
		
		System.out.println("Introduce un caracter");
		char letra = sc.next().charAt(0);
		
		int contador=0;
		for (int i=0; i<cadena.length(); i++) {

			if (cadena.charAt(i)== letra) {
				contador++;
				
			}
		}
	
			System.out.printf("Se repite ese caracter %d\n", contador);
		}
}


