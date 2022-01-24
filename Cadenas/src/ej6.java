/**
 * 
 */
import java.util.Scanner;
/**
 * @author USUARIO
 *Repite el ejercicio anterior pero esta vez usando indexOf
 */
public class ej6 {

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
		int contador=0;
		

for (int i=0; i<cadena.length(); i++) {

	if (cadena.charAt(i)== letra) {
		contador++;
		
	}
}

	System.out.printf("Se repite ese caracter %d\n", contador);
	}
}