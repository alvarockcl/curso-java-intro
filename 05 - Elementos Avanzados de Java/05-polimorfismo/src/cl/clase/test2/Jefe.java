package cl.clase.test2;

public class Jefe extends Trabajador {

	@Override
	public int calcularSueldo(int sueldoBase) {
		int movilizacion = 50000;
		int cargasfamiliares = 100000;
		return sueldoBase + movilizacion + cargasfamiliares;
	}

	
}
