package cl.fuentes.test2;

public class Gerente extends Trabajador {

	@Override
	public int calcularSueldo(int sueldoBase) {
		
		int bono = 100000;
		int gastosVarios = 200000;
		int sueldoTotal = sueldoBase + bono + gastosVarios;
		return sueldoTotal;
	}

	
	
}
