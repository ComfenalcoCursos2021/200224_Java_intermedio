package tipodato;

public class NuevaNuevaPrincipal {

	public static void main (String[] args) {
		System.out.println("Punto inicial");
		
		int edad = 18;		
		long numeroGrande = 10000000;
		float decimalPromedio = 1.5f;
		double decimalGrande = 1.5d; 
		
		String palabras = "las pabras que voy a guardar";
		
		char caracter = '&';
		
		boolean condiciones = false;
		condiciones = true;
		short cuantoEs = 8;
		
		
		System.out.println("Short Min " + Short.MIN_VALUE );
		System.out.println("Short Max " + Short.MAX_VALUE );
		
		System.out.println("Integer Min " + Integer.MIN_VALUE );
		System.out.println("Integer Max " + Integer.MAX_VALUE );
		
		
		System.out.println("Integer Long " + Long.MIN_VALUE );
		System.out.println("Integer Long " + Long.MAX_VALUE );
		
		System.out.println("Integer Float " + Float.MIN_VALUE );
		System.out.println("Integer Float " + Float.MAX_VALUE );
		
		System.out.println("Integer Double " + Double.MIN_VALUE );
		System.out.println("Integer Double " + Double.MAX_VALUE );
		
		System.out.println(palabras);
		
		System.out.println("Termino!!!");
	}
}
