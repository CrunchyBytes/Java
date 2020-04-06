/* Alexander Díaz Ruiz
 * ID 160046
 */

/* Importación de clase "Scanner" del paquete "util"
 * Permite recibir información tecleada por el usuario
 */
import java.util.Scanner;

// Clase Base
public class Cuadrilatero
{
	/* Datos Miembro
	 * Comando pidió volver estas variables "static"
	 * ¿Es porque no creé objetos para llamarlo?
	 * Pero sí así no debería ser, porque nada más son variables que se ocupan
	   para realizar una operación; no necesitamos crear objetos de ella
	 * De hecho ni siquiera sé si se pueda hacer eso.
	 * ¿En ese entonces será por eso que deben quedar como "static"?
	 */
	protected static int base;
	protected static int alt;
	protected String nomb;

	// Métodos Miembro
	// Constructor default
	public Cuadrilatero()
	{
		
	}
	
	// Constructor c/ parámetros
	public Cuadrilatero(int x, int y)
	{
		base = x;
		alt = y;
	}
	
	// Función Área
	public int area()
	{
		int x = Cuadrilatero.getBase();
		int y = Cuadrilatero.getAlt();

		return (x*y);
	}

	/* Gets y Sets
	 * Comando me pidió volver los métodos estáticos
	 */
	public static int getBase()
	{
		return base;
	}
	public static int getAlt()
	{
		return alt;
	}

	public void setBase(int x)
	{
		base = x;
	}
	public void setAlt(int x)
	{
		alt = x;
	}

	/* Clases Hijas
	 * Comando pidió que las clases fueran "static"
	 * Que se me hace muy raro, especialmente porque en este caso SÍ creé ob-
	   jetos de este tipo de clase, así que no entiendo porque me pide que
	   lo especifique como "static"
	 * Otro que eso, las 3 clases Hija son iguales en el sentido de que sólo
	   necesitan llamar a las funciones de la clase Base para establecer su
	   nombre y ejecutar el método area().
	 * Como los datos ingresados por el usuario ya fueron guardados en la clase
	   Base a través de los métods Sets, no hace falta incluir parámetros en la 
	   función area(); porque se pueden ocupar aquellos datos que fueron guardados
	   en primer lugar.
	 */
	public static class Cuadrado extends Cuadrilatero
	{
		// Constructor
		public Cuadrado()
		{
			super.area();
			super.nomb = "cuadrado";
		}
	}

	public static class Rectangulo extends Cuadrilatero
	{
		// Constructor
		public Rectangulo()
		{
			super.area();
			super.nomb = "rectángulo";
		}
	}	

	public static class Rombo extends Cuadrilatero
	{
		// Constructor
		public Rombo()
		{
			super.area();
			super.nomb = "rombo";
		}
	}

	// Main
	public static void main(String[] args)
	{
		// Datos Miembro
		int base;
		int altura;
		Scanner scan = new Scanner(System.in);

		/* Instancias (Objetos)
		 * Aunque la verdad es que no entiendo por qué crear estos objetos, si al final
		   de cuentas los que se ocupan son los del arreglo de Cuadrilatero más tarde.
		 * Quizás nada más fue una demostración en la clase y lo terminé implementando
		   en la actividad por error.
		 */
		Cuadrilatero cuadri;
		Cuadrado cuad = new Cuadrado();
		Rectangulo rect = new Rectangulo();
		Rombo rom = new Rombo();
		
		/* Asignación
		 * Objeto definido de tipo Cuadrilatero asignado a tipo Rectangulo 
		 * Aunque se me hace raro
		 * ¿Qué no se supone que bases no pueden convertir a clases hijas?,
		   porque las clases hijas tienen propiedades adicionales a la Base
		 */
		cuadri = rect;

		// Pedir datos
		// Base
		System.out.print("\nBienvenid@\n\nPor favor ingrese la base del cuadrilátero: ");
		base = scan.nextInt();
		cuadri.setBase(base);

		// Altura
		System.out.print("\nAhora,ingrese su altura: ");
		altura = scan.nextInt();
		cuadri.setAlt(altura);
		
		
		// Arreglo de 3 objetos tipo Cuadrilatero llamado "array"
		Cuadrilatero [] array = new Cuadrilatero[3];
		array[0] = new Cuadrado();
		array[1] = new Rectangulo();
		array[2] = new Rombo();

		
		// Soy un "nombre de figura" + área.
		for (int i=0; i<3; i++)
		{
			System.out.print("\nSoy un " + array[i].nomb + ", y tengo un área de " + array[i].area() + " unidades.");
		}
	}
}