/* Alexander D�az Ruiz
 * ID 160046
 */


/* Est� muy raro esto.
 * Ten�a mucho tiempo que Consola no me ped�a separar clases p�blicas en diferentes archivos.
 */

/* Clase Animal es una clase Hija de Cantante.
 * Sin embargo, en vez de utilizar "extends" para demostrar herencia, se ocupa "implements" cuando se hereda de una interfaz.
 */
public class Animal implements Cantante
{
	public void cantar()
	{
		System.out.println("Guau guau");
	}
}