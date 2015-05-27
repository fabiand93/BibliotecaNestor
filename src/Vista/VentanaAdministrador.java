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
import Logica.Cliente;
import Logica.Biblioteca;
import Logica.Escritor;


public class VentanaAdministrador extends JFrame implements ActionListener {

		JButton btnSalir;
		File archivo;
		private VentanaPrincipal ventanaAdmin;
		
	public VentanaAdministrador(VentanaPrincipal ventanaAdministrador,boolean modal) {
		
		this.ventanaAdmin=ventanaAdministrador;
		this.setModal(modal);
	
		//COLORES REUTILIZABLES
		Color marron = new Color(27, 25, 45);
		Color amarillo = new Color(255, 194, 92);
		
		JPanel salir = new JPanel();
		
		ImageIcon iconSalir = new ImageIcon(getClass().getResource("../Imagenes/Salir.png"));
		btnSalir = new JButton(iconSalir);
		btnSalir.addActionListener(this);
		btnSalir.setBackground(null);
		btnSalir.setBorderPainted(false);
		
		this.setTitle("Administrador");
		this.setSize(630, 485);
		this.setResizable(false);
		this.setVisible(true);
		this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/logo-simple.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);		
		PanelAdministrador panel2 = new PanelAdministrador ();
		this.add(panel2);
		salir.add(btnSalir);
		salir.setBackground(amarillo);
		this.add(salir, BorderLayout.PAGE_END);
		
	}
	
   
	private void setModal(boolean modal) {
		// TODO Auto-generated method stub
		
	}


	public void actionPerformed(ActionEvent evento){
		if (evento.getSource() == btnSalir) {
			Biblioteca e = Biblioteca.getInstance();
			
			}
			System.exit(0);			
		}
		
	}


