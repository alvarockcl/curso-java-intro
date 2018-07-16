package cl.fuentes.test1;

public class Persona {
	
	private int identificacion;
	private String nombre;
	private int edad;
	
	// Constructores
	public Persona() {
	}
	
	public Persona(int identificacion, String nombre) {
		this.identificacion = identificacion;
		this.nombre = nombre;
	}

	public Persona(int identificacion, String nombre, int edad) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// getter & setter
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}
