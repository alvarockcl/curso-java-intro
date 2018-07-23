package cl.clase.ed;

public class Pila {
	
	private int[] lista;
	private int posicion = 0;

	public Pila() {
		lista = new int[10];
	}
	
	public int[] getLista() {
		return lista;
	}

	public void setLista(int[] lista) {
		this.lista = lista;
	}
	
	// Metodo agregar 
	public void agregar(int valor) {
		if(posicion < 10) {
			lista[posicion] = valor;
			posicion++;
		}else {
			System.out.println("Pila llena");
		}
	}
	
	public void mostrapila() {
	   if(posicion != 0) {	
			for(int i = 0 ; i < posicion; i++) {
				System.out.println("Indice : " + i +" valor : " + lista[i]);
			}
	   }else {
		   System.out.println("Pila vacía");
	   }
	}
	
	public void quitar() {
		posicion = posicion-1;
	}
	
	
	

}
