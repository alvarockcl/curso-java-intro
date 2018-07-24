package cl.fuentes.gui;

import javax.swing.JFrame;

public class Principal extends JFrame {

	public Principal() {
		super("Principal");
		iniciaPrincipal();
	}
	
	public void iniciaPrincipal() {
		this.setLayout(null);
		this.setSize(800, 500);
		this.setLocationRelativeTo(null); // centra la ventana
	}
	
}
