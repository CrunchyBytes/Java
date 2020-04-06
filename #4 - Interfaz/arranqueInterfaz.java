/* Alexander Díaz Ruiz
 * ID 160046
 */


/* Está muy raro esto.
 * Tenía mucho tiempo que Consola no me pedía separar clases públicas en diferentes archivos.
 */

public class arranqueInterfaz
{
	public static void main (String[] args)
	{
		Persona obj = new Persona();
		Animal pet = new Animal();

		hacerCantar(obj);
		hacerCantar(pet);
	}

	/* Según yo, esto no debería funcionar.
	 * Estamos usando un método en el Main (hacerCantar()) que aún no ha sido definido hasta más tarde.
	 * Si el programa se compila de arriba hacia abajo, debería presentar errores.
	 * Pero a ver...
	 * Mira eso. Sí funcionó.
	 */
	//Al método se le pasa dato de tipo clase Cantante.
	public static void hacerCantar(Cantante c)
	{
		// Dato de tipo Cantante llama a la función.
		c.cantar();
	}
}