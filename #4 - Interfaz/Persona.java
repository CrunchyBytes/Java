/* Alexander Díaz Ruiz
 * ID 160046
 */

/* Está muy raro esto.
 * Tenía mucho tiempo que Consola no me pedía separar clases públicas en diferentes archivos.
 */

/* Clase Persona es una clase Hija de Cantante.
 * Sin embargo, en vez de utilizar "extends" para demostrar herencia, se ocupa "implements" cuando se hereda de una interfaz.
 */
public class Persona implements Cantante
{
	public void cantar()
	{
		System.out.println("¡Ahh cigüeña! ¡Bababichi babá!");
	}
}