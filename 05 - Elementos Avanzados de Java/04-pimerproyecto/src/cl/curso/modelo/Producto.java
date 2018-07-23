package cl.curso.modelo;

public class Producto {

	private int codigoProducto;
	private String marca;
	private String nombreProducto;
	private int precio;
	private int stock;
	
	public Producto(){
	}
	
	public Producto(int _codigoProducto, String _marca, String _nombreProducto, int _precio, int _stock){
		codigoProducto = _codigoProducto;
		marca = _marca;
		nombreProducto = _nombreProducto;
		precio = _precio;
		stock = _stock;
	}
	
	
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	} 
	
	
	
}
