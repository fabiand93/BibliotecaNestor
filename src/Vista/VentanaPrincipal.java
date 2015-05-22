package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;








import Logica.Biblioteca;
import Logica.UsuarioAdministrador;
import Logica.UsuariosSistema;

public class VentanaPrincipal extends JFrame implements ActionListener {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelPrincipal panel;
	private JButton btnIngresar;
	private JButton btnSalir;
	private JPanel panelBotones;

	public VentanaPrincipal (){


		try {
			crearBiblioteca();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this,e.getMessage());

		}

		setTitle("BIBLIOTECA YAMANTAKA");
		setSize(1000, 210);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("../imagenes/libro.png")).getImage());
		setLocationRelativeTo(null);

		panel = new PanelPrincipal ();
		panel.setBackground(null);
		panelBotones = new JPanel() ;
		panelBotones.setBackground(null);

		Font osb = new Font("Open Sans", Font.BOLD, 15);

		btnIngresar =  new JButton("Aceptar");
		btnIngresar.addActionListener(this);
		btnIngresar.setFont(osb);
		btnIngresar.setBackground(new Color(127, 52, 45));
		btnIngresar.setForeground(new Color(255, 194, 92));

		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setFont(osb);
		btnSalir.setBackground(new Color(127, 52, 45));
		btnSalir.setForeground(new Color(255, 194, 92));

		panelBotones.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.insets = new Insets(20, 3, 3, 3);
		panelBotones.add(btnIngresar, gbc);
		panelBotones.add(btnSalir, gbc);

		JPanel panelcompleto = new JPanel();
		panelcompleto.setBackground(new Color(255, 194, 92));
		panelcompleto.add(panel);		
		panelcompleto.add(panelBotones);	
		add(panelcompleto);
	}

	public void crearBiblioteca() throws Exception  {
		Biblioteca.getInstance().setArchivoClientes("data/archivoClientes.txt");
		Biblioteca.getInstance().cargarDatos();
	}

	//ACTION PERFORMED
	public void actionPerformed(ActionEvent evento){


		UsuarioAdministrador u = new UsuarioAdministrador();


		if(evento.getSource()==btnIngresar && panel.getRol().getSelectedItem().equals("ADMINISTRADOR") && panel.getTxtUsuario().equals("Daniel") && panel.getTxtContrasena().equals("Daniel")){
			VentanaAdministrador ventanaAdmin = new VentanaAdministrador (this, true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
			// remueve la ventana anterior
			dispose();

		}

		else if(evento.getSource()==btnIngresar &&panel.getRol().getSelectedItem().equals("CLIENTE") && panel.getTxtUsuario().equals("Roa") && panel.getTxtContrasena().equals("Roa")){
			VentanaCliente ventanaCliente = new VentanaCliente (this,true);
			ventanaCliente.setVisible(true);
			dispose();
		}

		else if (evento.getSource() == btnSalir) {

			JOptionPane.showMessageDialog(null, "GRACIAS POR SU VISITA",
					"WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);


			System.exit(0);			
		}
		else if   (evento.getSource() == btnIngresar && Biblioteca.getInstance().login( panel.getTxtUsuario(), panel.getTxtContrasena()) == false){
			JOptionPane.showMessageDialog(null, "Usuario invalido o contrase�a invalida",
					"WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);}
	}

	public PanelPrincipal getPanel() {
		return panel;
	}

	public void setPanel(PanelPrincipal panel) {
		this.panel = panel;
	}





	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	public void setBtnIngresar(JButton btnIngresar) {
		this.btnIngresar = btnIngresar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JPanel getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}
	public boolean Login( String usuario, String Contrasena) {
		Biblioteca biblioteca = Biblioteca.getInstance();
		return biblioteca.login( usuario, Contrasena);
	}


	//MAIN
	public static void main(String[] args) {
		UsuariosSistema s = new UsuariosSistema();
		VentanaPrincipal ventPpal = new VentanaPrincipal();
		ventPpal.setVisible(true);
	}
}