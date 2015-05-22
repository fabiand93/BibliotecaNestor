package Vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Logica.UsuarioCliente;
import Logica.Biblioteca;
import Logica.Escritor;

public class VentanaCliente extends JFrame implements ActionListener {

		JButton btnSalir;
		File archivo;
		private VentanaPrincipal ventanaCliente;
		
	public VentanaCliente(VentanaPrincipal ventanaPrincipal,boolean modal) {

		this.ventanaCliente=ventanaPrincipal;
		this.setModal(modal);
		
		//COLORES REUTILIZABLES
		Color marron = new Color(127, 52, 45);
		Color amarillo = new Color(255, 194, 92);
		
		JPanel salir = new JPanel();
		
		ImageIcon iconSalir = new ImageIcon(getClass().getResource("../Imagenes/Salir.png"));
		btnSalir = new JButton(iconSalir);
		btnSalir.addActionListener(this);
		btnSalir.setBackground(null);
		btnSalir.setBorderPainted(false);
		
		this.setTitle("Cliente");
		this.setSize(440, 500);
		this.setResizable(false);
		this.setVisible(true);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo-simple.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);		
		PanelConsultarLibro panel3 = new PanelConsultarLibro ();
		this.add(panel3);
		salir.add(btnSalir);
		salir.setBackground(amarillo);
		this.add(salir, BorderLayout.PAGE_END);
		
		

	}
	
    private void setModal(boolean modal) {
			// TODO Auto-generated method stub
			
		}

	/**
     * Metodo que se encarga de capturar los eventos que ocurran en el JFrame
     */
	public void actionPerformed(ActionEvent evento){
		if (evento.getSource() == btnSalir) {
			Biblioteca e = Biblioteca.getInstance();
			}
			System.exit(0);			
		}
		
	}


