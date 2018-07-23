package cl.clase.test2;

public class Colaborador extends Trabajador {

	@Override
	public int calcularSueldo(int sueldoBase) {
		int colacion = 40000;
		return sueldoBase + colacion;
	}

}
