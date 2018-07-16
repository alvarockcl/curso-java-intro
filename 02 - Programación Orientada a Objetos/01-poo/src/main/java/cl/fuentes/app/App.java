package cl.fuentes.app;

import cl.fuentes.test1.Afiliado;
import cl.fuentes.test2.*;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
	
		/*
		Afiliado afil = new Afiliado();
		//afil.setIdentificacion(50);
		//afil.setNombre("Pedro");
		afil.setEdad(30);
		afil.setCodigoplan(1000);
		afil.setPlan("Plan Santa Mar�a");
		
		System.out.println("Su ident : " + afil.getIdentificacion());
		System.out.println("Su nombre : " + afil.getNombre());
		*/
		/*
		int sueldo = 1000000;
		//Trabajador juan = new Colaborador();
		Trabajador juan = new Gerente();
		int liquidacion = juan.calcularSueldo(sueldo);
		System.out.println("El liquidacion de Juan es :" + liquidacion);
		*/
		
		// Arreglos
		
		int[] lista = {10, 20, 30,40};
		//int[][] lista1;
		
		String[] nombres = {"Alvaro","Eduardo","Carla","Pamela"};
		char[] codigos = {'a','b'};
		
		for(int i = 0; i < lista.length; i++) {
			System.out.println("Valor del array " + lista[i]);
		}
		int j = 0;
		while (j < nombres.length) {
			System.out.println("Valor del nombre " + nombres[j]);
			j++;
		}
		
		int k = 0;
		do {
			System.out.println("Valor del codigo " + codigos[k]);
			k++;
		} while (k < codigos.length);
		
		List mlista = new ArrayList();
		mlista.add("Maria");
		mlista.add("Kamila");
		mlista.add("Francisca");
		
		List<String> apellidos = new ArrayList(); 
		apellidos.add("Fuentes");
		apellidos.add("Gonzalez");
		apellidos.add("Tapia");
		
		List<Afiliado> empleados = new ArrayList();
		Afiliado afiliado = new Afiliado();
		afiliado.setIdentificacion(10);
		empleados.add(afiliado);
		
		
		empleados.get(0).setNombre("Ricardo");
		System.out.println("Identificacion : " + empleados.get(0).getIdentificacion()
				+ " - " + empleados.get(0).getNombre());
		
	}

}
