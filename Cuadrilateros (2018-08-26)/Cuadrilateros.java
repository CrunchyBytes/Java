/* Alexander Díaz Ruiz
 * ID 160046
 * Ingeniería en Sistemas Computacionales
 * UDLAP
 */

/* Importación de clase "Scanner" del paquete "util"
 * Permite recibir información tecleada por el usuario
 */
import java.util.Scanner;

// Nueva clase Cuadriláteros
public class Cuadrilateros
{
	// Datos Miembro
	/* Todos necesitan ser "static"
	 * ¿Por qué?
	 */
	static int alt;
	static int base;
	static int res;
	static int fig;
	static boolean val = false;

	// Métodos y Funciones
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
	
	// Cálculo del Área
	public static int area(int a, int b)
	{
		res = a*b;
		return res;
	}
	
	// 3 clases derivadas: Cuadro, Rectángulo, Rombo
	/* Al final de cuentas nunca logré ocupar los Constructores de las 3 figuras
  	 * Tuve problemas al momento de usarlos al final de Main
	 */
	public class Cuadro extends Cuadrilateros
	{
		// Constructores
		// Default
		public Cuadro()
		{
		}
		
		// Con parámetros	
		public Cuadro(int a, int b, int c)
		{
			/* Agregué el "super." al inicio de cada variable, por si no fuera obvio para el programa, que esas variables pertenecen a la
			 * clase Base y no a la Derivada
			 */
			super.alt = a;
			super.base = b;
			super.res = c;

			System.out.println("El cuadrado tiene un área de " + a + " * "+ b + " = " + c);	
		}
	}
	
	public class Rectangulo extends Cuadrilateros
	{
		// Constructores
		// Default
		public Rectangulo()
		{
		}
		
		// Con parámetros
		public Rectangulo(int a, int b, int c)
		{
			super.alt = a;
			super.base = b;
			super.res = c;

			System.out.println("El rectángulo tiene un área de " + a + " * "+ b + " = " + c);
		}
	}

	public class Rombo extends Cuadrilateros
	{
		// Constructores
		// Default
		public Rombo()
		{
		}
		
		// Con parámetros
		public Rombo(int a, int b, int c)
		{
			super.alt = a;
			super.base = b;
			super.res = c;

			System.out.println("El rombo tiene un área de " + a + " * "+ b + " = " + c);
		}
	}

	// Main
	/* Lo curioso es que esta vez no le importó a la Consola que las clases Derivadas fueran declaradas como "public"
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

		// Escáner para guardar resultados del usuario
		Scanner scan = new Scanner(System.in);
		
		/* Ciclo while
		 * Hasta que el usuario no ingrese un número válido entre 1-3, no podrá salirse del ciclo 
		 */
		while (val == false)
		{

			// Mensaje
			System.out.println("Bienvenido a la calculadora de áreas de cuadriláteros.\n¿Qué figura desea elegir?\n\n1.- Cuadro\n2.- Rectángulo\n3.- Rombo\n");
		
			// Recepción		
			fig = scan.nextInt();

			/* Casos
		 	 * Dependiendo del número ingresado por el usuario, se "selecciona" la figura de la cual se calculará el área.
		 	 */
			switch(fig)
			{
				case 1: System.out.println("\nHa seleccionado el Cuadro.\n");
					break;
				case 2: System.out.println("\nHa seleccionado el Rectángulo.\n");
					break;
				case 3: System.out.println("\nHa seleccionado el Rombo.\n");
					break;
				default: System.out.println("\nPor favor seleccione una figura válida.");	
			}
			
			// Si 'fig' no cumple la condición anterior, entonces 'val' se mantendrá como 'falso' y el ciclo se repite.
			if (fig>=1 && fig<=3)
				val = true;
			else
				val = false;
		}
		
		// Una vez seleccionado un valor válido para 'fig', falta preguntar por los valores del área y la base.
		// Altura
		System.out.print("\nAhora, por favor ingrese a continuación los valores de la altura y la base:\nAltura: ");
		alt = scan.nextInt();
		figura.setAlt(alt);
		
		// Base
		System.out.print("Base: ");
		base = scan.nextInt();
		figura.setBase(base);
		
		res = area(figura.getAlt(), figura.getBase());
		
		/* Originalmente tenía ganas de usar los Constructores de cada figura para ahorrar el espacio de todos los "System.out.println" de cada
		 * caso
		 * Pero hiciera lo que hiciera siempre me salía el error "non-static variable cannot be referenced from a static context"
		 * Algo tenía que ver con que quería ocupar el Constructor de una clase Derivada
		 * Creí que con crear objetos de aquellas clases (como se ve al principio del Main), y referenciarlas en el siguiente Switch bastaría
		 * Algo así como la Actividad pasada en el Laboratorio
		 * Pero no resultó :/
		 * Después, cuando no tenga que subir el trabajo a última hora
		 * Por lo menos las funciones gets() y sets() funcionan adecuadamente
		 */
		switch(fig)
		{
			case 1: System.out.println("\nEl área del Cuadrado es " + figura.getAlt() + " * " + figura.getBase() + " = " + res + " unidades");//cuad.Cuadro(figura.getAlt(), figura.getBase(), res);
					//Cuadro cuad = new Cuadro();
				break;
			case 2: System.out.println("\nEl área del Rectángulo es " + figura.getAlt() + " * " + figura.getBase() + " = " + res + " unidades");//rect.Rectangulo(figura.getAlt(), figura.getBase(), res);
					//Rectangulo rect = new Rectangulo();
				break;
			case 3: System.out.println("\nEl área del Rombo es " + figura.getAlt() + " * " + figura.getBase() + " = " + res + " unidades");//rom.Rombo(figura.getAlt(), figura.getBase(), res);
					//Rombo rom = new Rombo();
				break;
			//default: System.out.println("\nPor favor seleccione una figura válida.");	
		}
			//System.out.println("El área de la figura es " + figura.getAlt() + " * " + figura.getBase() + " = " + res);
	}
}