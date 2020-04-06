/* Alexander Díaz Ruiz
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

	/* Métodos Miembro
	 * No incluí un constructor modificado, porque no veo que haga falta, y por lo tanto no se incluye el default por ser default.
	 * Alarma
	 * El propósito de todo este programa; imprimir una alarma por cada tipo de barco, con sus coordenadas
	 * Como también es abstract, no se puede implementar, sólo declarar.
	 * Por ende, está señalando que es esencial que las clases Hijas les den implementación.
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
	 * Consola pidió que las clases fuesen static
	 * "error: non-static variable this cannot be referenced from a static context" cuando llamando Constructores de Vapor y Velero para crear nuevos
	   objetos en Main
	 * No es la primera vez que esto me pasa... ¿por qué?
	 * Se supone que static anula la necesidad de crear objetos de ese tipo.
	 * Sin embargo, "flota[0], flota[1]" son objetos de tipo clases Hijas, así que no veo porque hacerle static si ya tiene objetos en Main.
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
		
		/* No se puede usar "super" porque ese método tan sólo es para ejecutar, no implementar
		 * Como el método tiene el mismo nombre y argumentos (nulo) que el declarado en la clase Base, ¿se sobreescribe?
		 * Si el método "alarma" no fuera declarada como abstract (por motivo de esta Práctica), me hubiera gustado definir el mismo
		   System.out.println desde la clase Base y así sólo usar "super" en las clases Hijas.
		 * No se puede implementar dentro del Constructor para hacer las cosas más fáciles ;(
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
		 * Lo mismo que haría un método Set().
		 */
		public Velero(int a, int b)
		{
			x = a;
			y = b;
		}

		/* No se puede usar "super" porque ese método tan sólo es para ejecutar, no implementar
		 * Como el método tiene el mismo nombre y argumentos (nulo) que el declarado en la clase Base, ¿se sobreescribe?
		 * Si el método "alarma" no fuera declarada como abstract (por motivo de esta Práctica), me hubiera gustado definir el mismo
		   System.out.println desde la clase Base y así sólo usar "super" en las clases Hijas.
		 * No se puede implementar dentro del Constructor para hacer las cosas más fáciles ;(
		   Necesita seguir la misma firma que la clase abstracta de la que hereda.
		 */
		public void alarma()
		{
			System.out.println("ALARMA: Este es el Barco Velero.\nUna de nuestras velas colapsó y requerimos asistencia.");
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
		 * ¿Pero al parecer arreglos sí?
		 * En fin, tan sólo mencionando la variable estática como si fuese un método (sin los paréntesis, claro) se ejecuta.
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