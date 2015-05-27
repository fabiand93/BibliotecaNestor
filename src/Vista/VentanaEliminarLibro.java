package Vista;
import java.awt.*;

import javax.swing.*;


public class VentanaEliminarLibro extends JDialog {

	PanelEliminarLibro panel21;
	
	
	public VentanaEliminarLibro() {

		panel21 = new PanelEliminarLibro(this);
		this.add(panel21);
		this.setTitle("ELIMINARR LIBRO");
		this.setSize(660, 600);
		this.setModal(true);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo-simple.png")).getImage());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);


	}
	public void cerrar() {
		this.dispose();
	}
	
}