package Vista;
import java.awt.*;

import javax.swing.*;


public class VentanaConsultarLibro extends JDialog {

	PanelConsultarLibro panel3;
	
	
	public  VentanaConsultarLibro() {

		panel3 = new PanelConsultarLibro();
		this.add(panel3);
		this.setTitle("Consultar Libro");
		this.setSize(360, 600);
		this.setModal(true);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/libro.png")).getImage());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		
	}
}
