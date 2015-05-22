package Vista;
import java.awt.*;

import javax.swing.*;


public class VentanaEditarCliente extends JDialog {

	PanelEditarCliente panel2;
	
	
	public VentanaEditarCliente() {

		panel2 = new PanelEditarCliente ();
		this.add(panel2);
		this.setTitle("Modificar Cliente");
		this.setSize(700, 600);
		this.setModal(true);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo-simple.png")).getImage());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		dispose();


	}
}
