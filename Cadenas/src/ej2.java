/**
 * 
 */
import java.util.Scanner ;
/**
 * @author USUARIO
 *
 */
public class ej2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un texto ");
		String cadena =sc.nextLine();
		
		//if (cadena.charAt(0)== 'H' || cadena.charAt(0)== 'h') {
		if (cadena.toUpperCase().charAt(0)== 'H') {
			System.out.println ("La cadena empieza en H");
		} else {
			System.out.println ("La cadena no empieza en H");
		}

	}

}
