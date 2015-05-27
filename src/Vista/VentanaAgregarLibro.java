package Vista;
import java.awt.*;

import javax.swing.*;


public class VentanaAgregarLibro extends JDialog {

	PanelAgregarLibro panel2;
	
	
	public VentanaAgregarLibro() {

		panel2 = new PanelAgregarLibro (this);
		this.add(panel2);
		this.setTitle("Agregar Libro");
		this.setSize(630, 485);
		this.setModal(true);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/agregarlibro.png")).getImage());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		dispose();


	}


	public void cerrar() {
		this.dispose();
		
	}
}
