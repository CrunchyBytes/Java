/* Alexander D�az Ruiz
 * ID 160046
 * Ingenier�a en Sistemas Computacionales
 * UDLAP
 */

/* Importaci�n de clase "Scanner" del paquete "util"
 * Permite recibir informaci�n tecleada por el usuario
 */
import java.util.Scanner;

// Nueva clase Cuadril�teros
public class Cuadrilateros
{
	// Datos Miembro
	/* Todos necesitan ser "static"
	 * �Por qu�?
	 */
	static int alt;
	static int base;
	static int res;
	static int fig;
	static boolean val = false;

	// M�todos y Funciones
	// Constructor
	/*public Cuadrilateros(int a, int b)
	{
		alt = a;
		base = b;
	}*/
	
	// Sets
	public void setAlt(int a)
	{
		alt = a;
	}
	public void setBase(int b)
	{
		base = b;
	}
	
	// Gets
	public int getAlt()
	{
		return alt;
	}
	public int getBase()
	{
		return base;
	}
	
	// C�lculo del �rea
	public static int area(int a, int b)
	{
		res = a*b;
		return res;
	}
	
	// 3 clases derivadas: Cuadro, Rect�ngulo, Rombo
	/* Al final de cuentas nunca logr� ocupar los Constructores de las 3 figuras
  	 * Tuve problemas al momento de usarlos al final de Main
	 */
	public class Cuadro extends Cuadrilateros
	{
		// Constructores
		// Default
		public Cuadro()
		{
		}
		
		// Con par�metros	
		public Cuadro(int a, int b, int c)
		{
			/* Agregu� el "super." al inicio de cada variable, por si no fuera obvio para el programa, que esas variables pertenecen a la
			 * clase Base y no a la Derivada
			 */
			super.alt = a;
			super.base = b;
			super.res = c;

			System.out.println("El cuadrado tiene un �rea de " + a + " * "+ b + " = " + c);	
		}
	}
	
	public class Rectangulo extends Cuadrilateros
	{
		// Constructores
		// Default
		public Rectangulo()
		{
		}
		
		// Con par�metros
		public Rectangulo(int a, int b, int c)
		{
			super.alt = a;
			super.base = b;
			super.res = c;

			System.out.println("El rect�ngulo tiene un �rea de " + a + " * "+ b + " = " + c);
		}
	}

	public class Rombo extends Cuadrilateros
	{
		// Constructores
		// Default
		public Rombo()
		{
		}
		
		// Con par�metros
		public Rombo(int a, int b, int c)
		{
			super.alt = a;
			super.base = b;
			super.res = c;

			System.out.println("El rombo tiene un �rea de " + a + " * "+ b + " = " + c);
		}
	}

	// Main
	/* Lo curioso es que esta vez no le import� a la Consola que las clases Derivadas fueran declaradas como "public"
 	 * No me quejo
	 */
	public static void main (String[] args)
	{
		/* Nuevos objetos
		 * Uno para cada clase
		 */
		Cuadrilateros figura = new Cuadrilateros();
		/*Cuadro cuad = new Cuadro();
		Rectangulo rect = new Rectangulo();
		Rombo rom = new Rombo();*/

		// Esc�ner para guardar resultados del usuario
		Scanner scan = new Scanner(System.in);
		
		/* Ciclo while
		 * Hasta que el usuario no ingrese un n�mero v�lido entre 1-3, no podr� salirse del ciclo 
		 */
		while (val == false)
		{

			// Mensaje
			System.out.println("Bienvenido a la calculadora de �reas de cuadril�teros.\n�Qu� figura desea elegir?\n\n1.- Cuadro\n2.- Rect�ngulo\n3.- Rombo\n");
		
			// Recepci�n		
			fig = scan.nextInt();

			/* Casos
		 	 * Dependiendo del n�mero ingresado por el usuario, se "selecciona" la figura de la cual se calcular� el �rea.
		 	 */
			switch(fig)
			{
				case 1: System.out.println("\nHa seleccionado el Cuadro.\n");
					break;
				case 2: System.out.println("\nHa seleccionado el Rect�ngulo.\n");
					break;
				case 3: System.out.println("\nHa seleccionado el Rombo.\n");
					break;
				default: System.out.println("\nPor favor seleccione una figura v�lida.");	
			}
			
			// Si 'fig' no cumple la condici�n anterior, entonces 'val' se mantendr� como 'falso' y el ciclo se repite.
			if (fig>=1 && fig<=3)
				val = true;
			else
				val = false;
		}
		
		// Una vez seleccionado un valor v�lido para 'fig', falta preguntar por los valores del �rea y la base.
		// Altura
		System.out.print("\nAhora, por favor ingrese a continuaci�n los valores de la altura y la base:\nAltura: ");
		alt = scan.nextInt();
		figura.setAlt(alt);
		
		// Base
		System.out.print("Base: ");
		base = scan.nextInt();
		figura.setBase(base);
		
		res = area(figura.getAlt(), figura.getBase());
		
		/* Originalmente ten�a ganas de usar los Constructores de cada figura para ahorrar el espacio de todos los "System.out.println" de cada
		 * caso
		 * Pero hiciera lo que hiciera siempre me sal�a el error "non-static variable cannot be referenced from a static context"
		 * Algo ten�a que ver con que quer�a ocupar el Constructor de una clase Derivada
		 * Cre� que con crear objetos de aquellas clases (como se ve al principio del Main), y referenciarlas en el siguiente Switch bastar�a
		 * Algo as� como la Actividad pasada en el Laboratorio
		 * Pero no result� :/
		 * Despu�s, cuando no tenga que subir el trabajo a �ltima hora
		 * Por lo menos las funciones gets() y sets() funcionan adecuadamente
		 */
		switch(fig)
		{
			case 1: System.out.println("\nEl �rea del Cuadrado es " + figura.getAlt() + " * " + figura.getBase() + " = " + res + " unidades");//cuad.Cuadro(figura.getAlt(), figura.getBase(), res);
					//Cuadro cuad = new Cuadro();
				break;
			case 2: System.out.println("\nEl �rea del Rect�ngulo es " + figura.getAlt() + " * " + figura.getBase() + " = " + res + " unidades");//rect.Rectangulo(figura.getAlt(), figura.getBase(), res);
					//Rectangulo rect = new Rectangulo();
				break;
			case 3: System.out.println("\nEl �rea del Rombo es " + figura.getAlt() + " * " + figura.getBase() + " = " + res + " unidades");//rom.Rombo(figura.getAlt(), figura.getBase(), res);
					//Rombo rom = new Rombo();
				break;
			//default: System.out.println("\nPor favor seleccione una figura v�lida.");	
		}
			//System.out.println("El �rea de la figura es " + figura.getAlt() + " * " + figura.getBase() + " = " + res);
	}
}