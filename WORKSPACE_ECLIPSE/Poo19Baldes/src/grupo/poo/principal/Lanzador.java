package grupo.poo.principal;

import grupo.poo.baldes.Balde;
import grupo.poo.baldes.UtilidadesBaldes;

public class Lanzador {

	public static void main(String[] args) {
		UtilidadesBaldes utilidades = new UtilidadesBaldes();
		
		Balde A = new Balde(5);
		Balde B = new Balde(3);
		
		System.out.println(utilidades.formatear(A, B));
		A.llenar();
		System.out.println(utilidades.formatear(A, B));
		utilidades.traspasar(A, B);
		System.out.println(utilidades.formatear(A, B));
		B.vaciar();
		System.out.println(utilidades.formatear(A, B));
		utilidades.traspasar(A, B);
		System.out.println(utilidades.formatear(A, B));
		A.llenar();
		System.out.println(utilidades.formatear(A, B));
		utilidades.traspasar(A, B);
		System.out.println(utilidades.formatear(A, B));
		System.out.println("====================================================");
		A.vaciar();
		B.vaciar();
		
		System.out.println(utilidades.formatear(A, B));
		A.llenar();
		System.out.println(utilidades.formatear(A, B));		
		A.traspasarA(B);
		System.out.println(utilidades.formatear(A, B));
		B.vaciar();
		System.out.println(utilidades.formatear(A, B));		
		A.traspasarA(B);
		System.out.println(utilidades.formatear(A, B));
		A.llenar();
		System.out.println(utilidades.formatear(A, B));
		A.traspasarA(B);
		System.out.println(utilidades.formatear(A, B));
		
		System.out.println("====================================================");
		A.vaciar();//5Lts
		B.vaciar();//3Lts
		
		System.out.println(utilidades.formatear(A, B));
		B.llenar();
		System.out.println(utilidades.formatear(A, B));		
		B.traspasarA(A);
		System.out.println(utilidades.formatear(A, B));
		B.llenar();
		System.out.println(utilidades.formatear(A, B));		
		B.traspasarA(A);
		System.out.println(utilidades.formatear(A, B));
		A.vaciar();
		System.out.println(utilidades.formatear(A, B));
		B.traspasarA(A);
		System.out.println(utilidades.formatear(A, B));
		B.llenar();
		System.out.println(utilidades.formatear(A, B));
		B.traspasarA(A);
		System.out.println(utilidades.formatear(A, B));
		
		
		System.out.println("TERMINO !!!");

	}

}
