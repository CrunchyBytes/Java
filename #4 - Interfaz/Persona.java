/* Alexander D�az Ruiz
 * ID 160046
 */

/* Est� muy raro esto.
 * Ten�a mucho tiempo que Consola no me ped�a separar clases p�blicas en diferentes archivos.
 */

/* Clase Persona es una clase Hija de Cantante.
 * Sin embargo, en vez de utilizar "extends" para demostrar herencia, se ocupa "implements" cuando se hereda de una interfaz.
 */
public class Persona implements Cantante
{
	public void cantar()
	{
		System.out.println("�Ahh cig�e�a! �Bababichi bab�!");
	}
}