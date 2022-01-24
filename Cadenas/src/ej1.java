/**
 * 
 */
import java.util.Scanner ;
/**
 * @author USUARIO
 *Pedir al usuario una cadena y decir si empieza por el carácter ‘H
 */
public class ej1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un texto ");
		String cadena =sc.nextLine();
		
		if (cadena.charAt(0)== 'H') {
			System.out.println ("La cadena empieza en H");
		} else {
			System.out.println ("La cadena no empieza en H");
		}

	}

}
