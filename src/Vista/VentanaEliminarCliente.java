package Vista;
import java.awt.*;

import javax.swing.*;


public class VentanaEliminarCliente extends JDialog {

	PanelEliminarCliente panel5;
	
	
	public VentanaEliminarCliente() {

		panel5 = new PanelEliminarCliente ();
		this.add(panel5);
		this.setTitle("Cliente");
		this.setSize(360, 600);
		this.setModal(true);
	
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo-simple.png")).getImage());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		dispose();


	}
}
