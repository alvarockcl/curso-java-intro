package cl.clase.modelo;

public class Usuario {
	
	private int codigosuario;
	private String usuario;
	private String clave;
	private String nombre;
	
	public Usuario() {
	}
	
	public Usuario(int codigosuario, String usuario, String clave, String nombre) {
		//super();
		this.codigosuario = codigosuario;
		this.usuario = usuario;
		this.clave = clave;
		this.nombre = nombre;
	}

	public int getCodigosuario() {
		return codigosuario;
	}
	public void setCodigosuario(int codigosuario) {
		this.codigosuario = codigosuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
