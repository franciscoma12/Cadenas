/**
 * 
 */
import java.util.Scanner;
/**
 * @author USUARIO
 *Pedir al usuario una frase y un carácter, y decir en qué posiciones está ese carácter, o 
	 indicar que no está si procede. No se puede usar indexOf o similar.
 */
public class ej3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un texto");
		String cadena = sc.nextLine();
		
		System.out.println("Introduce un caracter");
		char letra = sc.next().charAt(0);
		
		int posicion=-1;
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i)== letra) {
				posicion=i;
				System.out.printf("El caracter %c está en la poisición %d\n" , letra, posicion);
			}
		}
		if (posicion == -1) {
			System.out.println("No se ha encontrado ese caracter");
		}
	}

}
