package Vista;
import java.awt.*;

import javax.swing.*;


public class VentanaAgregarCliente extends JDialog {

	PanelAgregarCliente panel1;
	
	
	public VentanaAgregarCliente() {

		panel1 = new PanelAgregarCliente ();
		this.add(panel1);
		this.setTitle("Agregar Cliente");
		this.setSize(360, 600);
		this.setModal(true);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo-simple.png")).getImage());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		dispose();


	}
}
