package grupo.poo.principal;

import java.util.Scanner;

import grupo.poo.baldes.Balde;
import grupo.poo.baldes.UtilidadesBaldes;

public class Lanzador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		UtilidadesBaldes util = new UtilidadesBaldes();
		Balde A = null;
		Balde B = null;
		System.out.println("Ingrese la capacidad maxima del primer balde ");
		int capacidad = teclado.nextInt();
		A = new Balde(capacidad);
		System.out.println("Ingrese la capacidad maxima del segundo balde ");
		capacidad = teclado.nextInt();
		B = new Balde(capacidad);
		
		System.out.println(util.formatear(A, B));
		int opcion = 0;
		while(opcion != 9) {
			System.out.println("Que quiere hacer?");
			System.out.println(" 1. para vaciar A");
			System.out.println(" 2. para llenar A");
			System.out.println(" 3. para vaciar B");
			System.out.println(" 4. para llenar B");
			System.out.println(" 5. Traspasar A a B");
			System.out.println(" 6. Traspasar B a A");
			System.out.println(" 9. Para salir");
			System.out.println("-----");
			opcion = teclado.nextInt();
			if(opcion==1) {
				A.vaciar();
			} else if(opcion == 2) {
				A.llenar();
			}else if(opcion == 3) {
				B.vaciar();
			}else if(opcion == 4) {
				B.llenar();
			}else if(opcion == 5) {
				A.traspasarA(B);
			}else if(opcion == 6) {
				B.traspasarA(A);
			}
			
			System.out.println(util.formatear(A, B));
			
			
			
		}
		
		
		System.out.println("TERMINO !!!");

	}

}
