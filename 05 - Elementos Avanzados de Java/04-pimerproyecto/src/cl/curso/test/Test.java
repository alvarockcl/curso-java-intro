package cl.curso.test;

import cl.curso.modelo.Producto;

public class Test {

	public static void main(String[] args) {
	   
		// TIPOS PRIMITIVOS
		
		// numericos
		int valor; // 32 bit 
		valor = 10;
		System.out.println("El valor int : " + valor);
		
		long valor1 = 2000L; // 64 bit 
		System.out.println("El valor long : " + valor1);

		short valor2 = 32423;
		System.out.println("El valor short : " + valor2);

		// Boolean
		boolean presente = true; // false
		System.out.println("El valor boolean: " + presente);
		
		// punto floatante
		float valor3 = 23.345f;  // 32 bit
		System.out.println("El valor float: " + valor3);
		
		double valor4 = 0.000232d; // 64 bit
		System.out.println("El valor double: " + valor4);
		
		// catacteres
		
		char valor5 = 'A';
		System.out.println("El valor char: " + valor5);
		
		String valor6 = "Hola como estas";
		System.out.println("El valor string o cadena: " + valor6);
		
		// fin tipos de datos
		
		// constantes
		
		final int EDAD_USUARIO = 20;
		
		calcularSuma();
		
		//int solucion = obtenerSuma(30, 50);
		//System.out.println("La suma es : " + solucion);
		System.out.println("La suma es : " + obtenerSuma(30, 50));
		
		// Estructuras de control
		
		int dia = 20;
		if(dia == 30) {
			System.out.println("El fin de mes!!!");
		}else{
			System.out.println("No es fin de mes!!!");
		}
		
		int opcion = 3;
		
		switch (opcion) {
		case 1:
			System.out.println("Selecciono opcion 1");
			break;
		case 2:
			System.out.println("Selecciono opcion 2");
			break;
		default:
			System.out.println("Seleccion no valida");
			break;
		}
		
		String sexo = "m";
		
		switch (sexo) {
		case "M":
			System.out.println("Masculino");
			break;
		case "F":
			System.out.println("Femenino");
			break;
		default:
			System.out.println("Investigar");
			break;
		}
		
		//CICLOS
		
		// FOR
		
		for(int i=1 ; i <= 10; i++) {
			System.out.println("Contador : " + i);
		}
		
		// WHILE
		int j = 1;
		while(j <=10) {
			System.out.println("Contador : " + j);
			j++;
		}
		/*
		while(true) {
			System.out.println("Contador : " + j);
		}
		*/
		// DO WHILE
		int k = 1;
		do {
			System.out.println("Contador : " + k);
			k++;
		}while(k <= 10);
		
		// INSTANCIAR DE LA CLASE PRODUCTO
		
		Producto producto = new Producto(1, "CIC", "Escritorio", 1500000, 10);
		System.out.println("Antes : " + producto.getNombreProducto());
	    producto.setNombreProducto("Mesa");
	    System.out.println("Despues : " + producto.getNombreProducto());
	    
	    // matar objeto
	    producto = null;
	    
	    Producto prod = new Producto();
	    prod.setCodigoProducto(1);
	    prod.setMarca("MUEBLES");
	    prod.setNombreProducto("Silla");
	    prod.setPrecio(50000);
	    prod.setStock(40);
	    
	    System.out.println("Stock Actual : " + prod.getStock() );
	    System.out.println("Stock Rebajado : " + rebajaStock(prod).getStock());
	    
	    System.out.println("Stock Actual : " + prod.getPrecio() );
	    System.out.println("Stock Rebajado : " + rebajaVip(prod).getPrecio());
	    
	}
	
	public static Producto rebajaVip(Producto prod) {
		
		int precio;  
		precio = prod.getPrecio();
		precio = precio * 100/120;
		prod.setPrecio(precio);
		return prod;
	}
	
	public static Producto rebajaStock(Producto prod) {
		
		//restar una unidad del stock
		//int actual = prod.getStock();
		//int despues = actual -1;
		//prod.setStock(despues);
		prod.setStock(prod.getStock()-1);
		return prod;
	}
	
	public static void calcularSuma(){
		int a = 10;
		int b = 20;
		int res = a + b;
		System.out.println("Solucion es : " + res);
	}
	
	
	public static int obtenerSuma(int a, int b) {
		return a + b;
	}
	

}
