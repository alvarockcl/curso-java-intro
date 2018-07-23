package cl.clase.test1;

public class Afiliado extends Persona{

	private int codigoplan;
	private String plan;
	
	public Afiliado() {
		//super(10,"Alvaro");
		super.setIdentificacion(10);
		super.setNombre("Alvaro");
	}
	
	
	// gette & setter
	public int getCodigoplan() {
		return codigoplan;
	}
	public void setCodigoplan(int codigoplan) {
		this.codigoplan = codigoplan;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	
}
