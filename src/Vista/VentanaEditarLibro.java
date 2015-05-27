package Vista;
import java.awt.*;

import javax.swing.*;


public class VentanaEditarLibro extends JDialog {

	PanelEditarLibro panel20;
	
	
	public VentanaEditarLibro(
			) {

		panel20 = new PanelEditarLibro (this);
		this.add(panel20);
		this.setTitle("Modificar Libro");
		this.setSize(700, 1000);
		this.setModal(true);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo-simple.png")).getImage());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);


	}
	
	public void cerrar(){
		this.dispose();
	}
	
	
}