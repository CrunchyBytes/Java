/* Alexander D�az Ruiz
 * ID 160046
 */

/* Clase Base
 * A este tipo de clases (abstractas) no se les declara el tipo de acceso.
 * 
 */
abstract class Barco
{
	/* Datos Miembro
	 * En este caso, queremos 2 enteros para formar las coordenadas de Plano Cartesiano de cada barco.
	 */
	protected int x;
	protected int y;
	// Como "productor" es de tipo static, es varible global para esta clase y no necesita ser instanciada.
	static String productor = "Soy Bavaria, el productor de todos estos barcos.";

	/* M�todos Miembro
	 * No inclu� un constructor modificado, porque no veo que haga falta, y por lo tanto no se incluye el default por ser default.
	 * Alarma
	 * El prop�sito de todo este programa; imprimir una alarma por cada tipo de barco, con sus coordenadas
	 * Como tambi�n es abstract, no se puede implementar, s�lo declarar.
	 * Por ende, est� se�alando que es esencial que las clases Hijas les den implementaci�n.
	 */
	public abstract void alarma();

	// Gets
	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}
	
	/* Clases Hijas
	 * Consola pidi� que las clases fuesen static
	 * "error: non-static variable this cannot be referenced from a static context" cuando llamando Constructores de Vapor y Velero para crear nuevos
	   objetos en Main
	 * No es la primera vez que esto me pasa... �por qu�?
	 * Se supone que static anula la necesidad de crear objetos de ese tipo.
	 * Sin embargo, "flota[0], flota[1]" son objetos de tipo clases Hijas, as� que no veo porque hacerle static si ya tiene objetos en Main.
	 */
	public static class Vapor extends Barco
	{
		// Constructor default
		public Vapor()
		{
		}
		
		/* Constructor modificado
		 * Los 2 enteros que se le den al Constructor terminan inicializando los Datos Miembro.
		 */
		public Vapor(int a, int b)
		{
			x = a;
			y = b;
		}
		
		/* No se puede usar "super" porque ese m�todo tan s�lo es para ejecutar, no implementar
		 * Como el m�todo tiene el mismo nombre y argumentos (nulo) que el declarado en la clase Base, �se sobreescribe?
		 * Si el m�todo "alarma" no fuera declarada como abstract (por motivo de esta Pr�ctica), me hubiera gustado definir el mismo
		   System.out.println desde la clase Base y as� s�lo usar "super" en las clases Hijas.
		 * No se puede implementar dentro del Constructor para hacer las cosas m�s f�ciles ;(
		   Necesita seguir la misma firma que la clase abstracta de la que hereda.
		 */
		public void alarma()
		{
			System.out.println("\nALARMA: Este es el Barco de Vapor.\nHubo una brecha y requerimos asistencia.");
		}	
	}

	public static class Velero extends Barco
	{
		// Constructor default
		public Velero()
		{
		}
		
		/* Constructor modificado
		 * Los 2 enteros que se le den al Constructor terminan asignando los Datos Miembro.
		 * Lo mismo que har�a un m�todo Set().
		 */
		public Velero(int a, int b)
		{
			x = a;
			y = b;
		}

		/* No se puede usar "super" porque ese m�todo tan s�lo es para ejecutar, no implementar
		 * Como el m�todo tiene el mismo nombre y argumentos (nulo) que el declarado en la clase Base, �se sobreescribe?
		 * Si el m�todo "alarma" no fuera declarada como abstract (por motivo de esta Pr�ctica), me hubiera gustado definir el mismo
		   System.out.println desde la clase Base y as� s�lo usar "super" en las clases Hijas.
		 * No se puede implementar dentro del Constructor para hacer las cosas m�s f�ciles ;(
		   Necesita seguir la misma firma que la clase abstracta de la que hereda.
		 */
		public void alarma()
		{
			System.out.println("ALARMA: Este es el Barco Velero.\nUna de nuestras velas colaps� y requerimos asistencia.");
		}
	 }

	public static void main(String[] args)
	{
		/* Instancias (Objetos)
		 * Creamos un arreglo de clase Barco llamada "flota".
		 * Cada elemento de "flota" es un tipo diferente de Barco.
		 */
		Barco[] flota = new Barco[2];
		/* Barco bar = new Barco();
		 * Como clase Base Barco es abstracta, no se puede crear objetos de su tipo.
		 * �Pero al parecer arreglos s�?
		 * En fin, tan s�lo mencionando la variable est�tica como si fuese un m�todo (sin los par�ntesis, claro) se ejecuta.
		 */
		System.out.println(Barco.productor);

		flota[0] = new Vapor(7,5);
		flota[0].alarma();
		System.out.println("Nos encontramos en las coordenadas (" + flota[0].getX() + "," + flota[0].getY() + ").\n");

		flota[1] = new Velero(8,4);
		flota[1].alarma();
		System.out.println("Nos encontramos en las coordenadas (" + flota[1].getX() + "," + flota[1].getY() + ").\n");

		System.out.println("FIN DE LAS TRANSMISIONES");
	}
}