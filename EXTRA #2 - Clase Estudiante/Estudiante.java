// Nueva clase
public class Estudiante 
{
	
	/* Datos Miembro/Propiedades
	 * A ver si puede incluir espacios para los apellidos...
	 */
	public String nom;// = "Anon";
	/* public String apP;
	 * public String apM;
	 */
	public int iD;// = 0001;
	public int edad;// = 19;
	/* Escoge un número dependiendo de su Escuela
	 * Algo como una lista que imprima números y sus Escuelas correspondientes
	 * Dependiendo de qué número escoja, se verá reflejado su Escuela.
	 */
	public int escuela;// = 3;
	//public String carrera;

	// Métodos/Funciones
	/* Constructor
	 * Inicializa variables
	 */
	public Estudiante(String a, int b, int c, int d)
	{
		nom = a;
		iD = b;
		edad = c;
		escuela = d;
	}
	// Sets
	/*public void setNom(String nom);
	public void setID(int iD);
	public void setAge(int edad);
	public void setEsc(int escuela);*/
	
	// Gets
	/*public String getNom();
	public int getID();
	public int getAge();
	public int getEsc();*/

	// Acciones (Lo que hace)
	/*public void registro() 
	{
		System.out.println("Bienvenid@ al");
	}*/

	public void estudiar() 
	{
		System.out.println(nom + " está estudiando...\nNo parece estar captando lo que lee.\n");
	}

	public void dormir() 
	{
		System.out.println(nom + " por fin se fue a dormir...\nUna pena que sólo tenga 4 horas para descansar.\n");
	}

	/*public void desplegue()
	{
		System.out.println("Nombre del Estudiante: " + nom + "\nID: " + iD + "\nEdad: " + edad + "\nEscuela: " + escuela + "\n\n");
	}*/
	
	// Sus datos/ Nuevo alumno registrado:
	// Main
	public static void main (String[] args) 
	{
		System.out.println("Bienvenid@ al Sistema de alumnos.\nAquí podrá registrar nuevos cursantes de Programación OaO.\n\n");
		//System.out.println("Nombre del Estudiante: " + nom + "\nID: " + iD + "\nEdad: " + edad + "\nEscuela: " + escuela + "\n\n");
		//prueba.getNom();
		//prueba.setNom(prueba.getNom);
		
		Estudiante prueba = new Estudiante("Anon", 0001, 19, 3);
		
		//prueba.desplegue();
		prueba.estudiar();
		prueba.dormir();
	}

}