/* Alexander D�az Ruiz
 * ID 160046
 */

/* Importaci�n de clase "Scanner" del paquete "util"
 * Permite recibir informaci�n tecleada por el usuario
 */
import java.util.Scanner;

// Clase Base
public class Cuadrilatero
{
	/* Datos Miembro
	 * Comando pidi� volver estas variables "static"
	 * �Es porque no cre� objetos para llamarlo?
	 * Pero s� as� no deber�a ser, porque nada m�s son variables que se ocupan
	   para realizar una operaci�n; no necesitamos crear objetos de ella
	 * De hecho ni siquiera s� si se pueda hacer eso.
	 * �En ese entonces ser� por eso que deben quedar como "static"?
	 */
	protected static int base;
	protected static int alt;
	protected String nomb;

	// M�todos Miembro
	// Constructor default
	public Cuadrilatero()
	{
		
	}
	
	// Constructor c/ par�metros
	public Cuadrilatero(int x, int y)
	{
		base = x;
		alt = y;
	}
	
	// Funci�n �rea
	public int area()
	{
		int x = Cuadrilatero.getBase();
		int y = Cuadrilatero.getAlt();

		return (x*y);
	}

	/* Gets y Sets
	 * Comando me pidi� volver los m�todos est�ticos
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
	 * Comando pidi� que las clases fueran "static"
	 * Que se me hace muy raro, especialmente porque en este caso S� cre� ob-
	   jetos de este tipo de clase, as� que no entiendo porque me pide que
	   lo especifique como "static"
	 * Otro que eso, las 3 clases Hija son iguales en el sentido de que s�lo
	   necesitan llamar a las funciones de la clase Base para establecer su
	   nombre y ejecutar el m�todo area().
	 * Como los datos ingresados por el usuario ya fueron guardados en la clase
	   Base a trav�s de los m�tods Sets, no hace falta incluir par�metros en la 
	   funci�n area(); porque se pueden ocupar aquellos datos que fueron guardados
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
			super.nomb = "rect�ngulo";
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
		 * Aunque la verdad es que no entiendo por qu� crear estos objetos, si al final
		   de cuentas los que se ocupan son los del arreglo de Cuadrilatero m�s tarde.
		 * Quiz�s nada m�s fue una demostraci�n en la clase y lo termin� implementando
		   en la actividad por error.
		 */
		Cuadrilatero cuadri;
		Cuadrado cuad = new Cuadrado();
		Rectangulo rect = new Rectangulo();
		Rombo rom = new Rombo();
		
		/* Asignaci�n
		 * Objeto definido de tipo Cuadrilatero asignado a tipo Rectangulo 
		 * Aunque se me hace raro
		 * �Qu� no se supone que bases no pueden convertir a clases hijas?,
		   porque las clases hijas tienen propiedades adicionales a la Base
		 */
		cuadri = rect;

		// Pedir datos
		// Base
		System.out.print("\nBienvenid@\n\nPor favor ingrese la base del cuadril�tero: ");
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

		
		// Soy un "nombre de figura" + �rea.
		for (int i=0; i<3; i++)
		{
			System.out.print("\nSoy un " + array[i].nomb + ", y tengo un �rea de " + array[i].area() + " unidades.");
		}
	}
}