/* Alexander D�az Ruiz
 * ID 160046
 */


/* Est� muy raro esto.
 * Ten�a mucho tiempo que Consola no me ped�a separar clases p�blicas en diferentes archivos.
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

	/* Seg�n yo, esto no deber�a funcionar.
	 * Estamos usando un m�todo en el Main (hacerCantar()) que a�n no ha sido definido hasta m�s tarde.
	 * Si el programa se compila de arriba hacia abajo, deber�a presentar errores.
	 * Pero a ver...
	 * Mira eso. S� funcion�.
	 */
	//Al m�todo se le pasa dato de tipo clase Cantante.
	public static void hacerCantar(Cantante c)
	{
		// Dato de tipo Cantante llama a la funci�n.
		c.cantar();
	}
}