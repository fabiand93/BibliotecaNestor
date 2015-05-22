package Vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Logica.*;

/**
 * 
 * @author MicroSoftware
 *
 */
public class PanelEditarCliente extends JPanel implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblId;
    private JLabel lblUser;
    private JLabel lblPassword;

    private JButton btnBuscar;
    private JButton btnModificar;
   
    private JTextField txtBusqueda;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtId;
    private JTextField txtUser;
    private JTextField txtPassword;


    ///////////////////////////////////////////////////

    /**
     * Constructor de la Clase PanelEditarCliente, donde se modifica su contenido
     */
    public PanelEditarCliente() {

        //TIPOS DE LETRAS REUTILIZABLES
        Font osb = new Font("Open Sans", Font.BOLD, 15);
        Font os = new Font("Open Sans", Font.PLAIN, 14);

        //COLORES REUTILIZABLES
        Color marron = new Color(127, 52, 45);
        Color amarillo = new Color(255, 194, 92);

        //CREACION DE PANEL DATOS
        JPanel panelBusqueda = new JPanel();
        panelBusqueda.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //CREACION DE OBJETO JLABEL
        lblId = new JLabel("Buscar cliente por ID:");
        lblId.setForeground(marron);
        lblId.setFont(os);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(30, 3, 30, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelBusqueda.add(lblId, gbc);

        txtBusqueda = new JTextField(15);
        txtBusqueda.setFont(os);
       
        lblNombre = new JLabel("Nombre");
        lblNombre.setEnabled(false);
        lblNombre.setForeground(marron);
        lblNombre.setFont(os);

        txtNombre = new JTextField();
        txtNombre.setEnabled(false);
        txtNombre.setFont(os);

        lblApellido = new JLabel("Apellido:");
        lblApellido.setEnabled(false);
        lblApellido.setForeground(marron);
        lblApellido.setFont(os);

        txtApellido = new JTextField(15);
        txtApellido.setEnabled(false);
        txtApellido.setFont(os);

        lblId = new JLabel("ID:");
        lblId.setEnabled(false);
        lblId.setForeground(marron);
        lblId.setFont(os);

        txtId = new JTextField(15);
        txtId.setEnabled(false);
        txtId.setFont(os);

        lblUser = new JLabel("Nombre de Usuario:");
        lblUser.setEnabled(false);
        lblUser.setForeground(marron);
        lblUser.setFont(os);

        txtUser = new JTextField(15);
        txtUser.setEnabled(false);
        txtUser.setFont(os);

        lblPassword = new JLabel("Password:");
        lblPassword.setEnabled(false);
        lblPassword.setForeground(marron);
        lblPassword.setFont(os);

        txtPassword = new JTextField(15);
        txtPassword.setEnabled(false);
        txtPassword.setFont(os);
        
        btnBuscar = new JButton ("Buscar");
        btnBuscar.setEnabled(true);
        btnBuscar.addActionListener(this);
        btnBuscar.setForeground(amarillo);
        btnBuscar.setBackground(marron);
        btnBuscar.setFont(osb);
        
        btnModificar = new JButton("Modificar");
        btnModificar.setEnabled(true);
        btnModificar.addActionListener(this);
        btnModificar.setForeground(amarillo);
        btnModificar.setBackground(marron);
        btnModificar.setFont(osb);

        JLabel lblIngreseNA = new JLabel("Ingrese los datos a cambiar:");
        lblIngreseNA.setForeground(marron);
        lblIngreseNA.setFont(osb);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(30, 3, 30, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelBusqueda.add(txtBusqueda, gbc);

       
        //COLOR DE FONDO A PANEL DE BUSQUEDA
        panelBusqueda.setBackground(null);

        //CREACION PANEL DATOS
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();

        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(15, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblNombre, gbc1);

        gbc1.gridx = 1;
        gbc1.gridy = 0;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(15, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtNombre, gbc1);

        gbc1.gridx = 0;
        gbc1.gridy = 1;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblApellido, gbc1);

        gbc1.gridx = 1;
        gbc1.gridy = 1;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtApellido, gbc1);

        gbc1.gridx = 0;
        gbc1.gridy = 2;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblId, gbc1);

        gbc1.gridx = 1;
        gbc1.gridy = 2;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtId, gbc1);

        gbc1.gridx = 0;
        gbc1.gridy = 3;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblUser, gbc1);

        gbc1.gridx = 1;
        gbc1.gridy = 3;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtUser, gbc1);

        gbc1.gridx = 0;
        gbc1.gridy = 4;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblPassword, gbc1);

        gbc1.gridx = 1;
        gbc1.gridy = 4;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtPassword, gbc1);
        
        gbc1.gridx = 0;
        gbc1.gridy = 6;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 10, 1, 3);

        //COLOR DE FONDO DE OANEL DATOS
        panelDatos.setBackground(null);

        //PANEL QUE CONTIENE PANEL DATOS Y BOTONES
        JPanel panelDB = new JPanel();
        panelDB.setLayout(new GridBagLayout());
        GridBagConstraints gbc2 = new GridBagConstraints();

        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gbc2.gridwidth = 1;
        gbc2.gridheight = 1;
        gbc2.weightx = 0.0;
        gbc2.weighty = 1.0;
        gbc2.insets = new Insets(3, 3, 3, 3);
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.anchor = GridBagConstraints.WEST;
        panelDB.add(panelDatos, gbc2);

        gbc2.gridx = 0;
        gbc2.gridy = 1;
        gbc2.gridwidth = 1;
        gbc2.gridheight = 1;
        gbc2.weightx = 0.0;
        gbc2.weighty = 1.0;
        gbc2.insets = new Insets(3, 3, 3, 3);
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.anchor = GridBagConstraints.WEST;
        panelDB.add(btnModificar, gbc2);
        //Boton Buscar
        gbc2.gridx = 1;
        gbc2.gridy = 1;
        gbc2.gridwidth = 1;
        gbc2.gridheight = 1;
        gbc2.weightx = 0.0;
        gbc2.weighty = 1.0;
        gbc2.insets = new Insets(3, 3, 3, 3);
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.anchor = GridBagConstraints.NORTH;
        panelDB.add(btnBuscar, gbc2);
     
        panelDB.setBackground(null);
        
        this.add(panelBusqueda);
        this.add(lblIngreseNA);
        this.add(panelDB);
        this.setBackground(new Color(255, 194, 92));
        
      }

    
    
    /**
     * Metodo que retorna el nombre del Cliente
     * @return valor ingresado en el JTextField de nombre
     */
    public String getTxtnombre() {
        return txtNombre.getText();
    }

    /**
     * Metodo que sustituye el nombre del Cliente
     * @param txtnombre valor original del nombre del cliente
     */
    public void setTxtnombre(String txtnombre) {
        this.txtNombre.setText(txtnombre);
    }
    	
    /**
     * Metodo que retorna el apellido del cliente
     * @return valor ingresado en el JTextField de apellido
     */
    public String getTxtapellido() {
        return txtApellido.getText();
    }

    /**
     * Metodo que sustituye el apellido del Cliente
     * @param txtapellido valor original del apellido del cliente
     */
    public void setTxtapellido(String txtapellido) {
        this.txtApellido.setText(txtapellido);
    }

    /**
     * Metodo que retorna el ID del cliente
     * @return ID ingresado en el JTextField de ID
     */
    public String getTxtID() {
        return txtId.getText();
    }

    /**
     * Metodo que sustituye el ID del Cliente
     * @param txtId valor original del ID del cliente
     */
    public void setTxtId(String txtId) {
        this.txtId.setText(txtId);
    }

    /**
     * Metodo que retorna el Nombre de Usuario del Cliente
     * @return Nombre de Usuario ingresado en el JTextField Nombre de Usuario
     */
    public String getTxtUser() {
        return txtUser.getText();
    }
    
    /**
     * Metodo que sustituye el Nombre de Usuario del cliente
     * @param txtUser valor original del Nombre de Usuario del Cliente
     */
    public void setTxtUser(String txtUser) {
        this.txtUser.setText(txtUser);
    }
    
    /**
     * Metodo que retorna la Contrase�a del Cliente
     * @return Contrase�a ingresada en el JTextField Contrase�a
     */
    public String getTxtPassword() {
        return txtPassword.getText();
    }

    /**
     * Metodo que sustituye la Contrase�a del Cliente
     * @param txtPassword valor original de la Contrase�a del Cliente
     */
    public void setTxtPassword(String txtPassword) {
        this.txtPassword.setText(txtPassword);
    }
    
    /**
     * Metodo que retorna el ID del cliente ingresado para buscar
     * @return el ID ingresado en el JTextField
     */
    public String getTxtbusqueda() {
        return txtBusqueda.getText();
    }

    /**
     * Metodo que sustituye el valor del campo de busqueda
     * @param txtbusqueda valor original ingresado en el JTextField de Busqueda
     */
    public void setTxtbusqueda(String txtbusqueda) {
        this.txtBusqueda.setText(txtbusqueda);
    }


    //ACTION PERFORMED
    /**
     * Metodo que se encarga de capturar los eventos que ocurran en el JPanel
     */
    public void actionPerformed(ActionEvent evento) {
			if(evento.getSource()==btnBuscar){
				UsuarioCliente cliente;
				try {
					cliente = Biblioteca.getInstance().consultarCliente(txtBusqueda.getText());
					if(cliente!=null){//no busca si existe o no
						txtNombre.setText(cliente.getNombre());
						txtNombre.setEnabled(true);
						txtApellido.setText(cliente.getApellido());
						txtApellido.setEnabled(true);
						txtId.setText(cliente.getId()); 
						txtUser.setText(cliente.getUsuario());
						txtUser.setEnabled(true);
						txtPassword.setText(cliente.getContrasena());
						txtPassword.setEnabled(true);
					}
					else{
						JOptionPane.showMessageDialog(this, "No se encontro el Id");
					}
				}
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (evento.getSource()==btnModificar){
				
				UsuarioCliente clienteEditado;
				try {
					clienteEditado=Biblioteca.getInstance().consultarCliente(txtBusqueda.getText());
					clienteEditado.setNombre(txtNombre.getText());
					clienteEditado.setApellido(txtApellido.getText());
					clienteEditado.setUsuario(txtUser.getText());
					clienteEditado.setContrasena(txtPassword.getText());
					JOptionPane.showMessageDialog(this, "El cliente ha sido editado");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(this, e.getMessage());
					
				}
				
				}
			}		
}