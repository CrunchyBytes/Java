// Nueva clase
public class Vehiculos {

	// Datos Miembro/Propiedades
	//public boolean encend = true;
	public String tipo;
	public int llantas;
	public String color;
	public double velocMax;
	public String distancia;
	public int kilometraje = 0;	

	// Métodos (Funciones)
	public void arranque() {
		System.out.println("Encendido");
	}	
	
	public void distR() {
		System.out.println("Lleva " + kilometraje + " km recorridos");
	}
	
	// Main
	public static void main (String[] args) {

		// Nuevos objetos
		Vehiculos coche = new Vehiculos();
		
		//Acción
		coche.arranque();
		coche.distR();
		
	}
}