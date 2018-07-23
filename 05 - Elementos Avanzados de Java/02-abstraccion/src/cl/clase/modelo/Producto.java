package cl.clase.modelo;

public class Producto {
	
	private int codigoproducto;
	private String nombre;
	private String tipo;
	private int precio;
	
	public Producto() {
		
	}
	
	public Producto(int codigoproducto, String nombre, String tipo, int precio) {
		super();
		this.codigoproducto = codigoproducto;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}


	public int getCodigoproducto() {
		return codigoproducto;
	}
	public void setCodigoproducto(int codigoproducto) {
		this.codigoproducto = codigoproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	
}
