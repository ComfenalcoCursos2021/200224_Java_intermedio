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
		
		
		System.out.println("Long Min" + Long.MIN_VALUE );
		System.out.println("Long Max" + Long.MAX_VALUE );
		
		System.out.println("Float Min" + Float.MIN_VALUE );
		System.out.println("Float Max" + Float.MAX_VALUE );
		
		System.out.println("Double Min" + Double.MIN_VALUE );
		System.out.println("Double Max" + Double.MAX_VALUE );
		
		System.out.println(palabras);
		System.out.println("El cambio que quiero subir");
		
		
		int algo = 32763;
		for (int i = 0; i < 10; i++) {
			System.out.println(algo);
			algo = (int) (algo + 1);
		}
		
		System.out.println("Termino!!!");
	}
}
