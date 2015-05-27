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

public class PanelEditarLibro extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblIsbn;
    private JLabel lblNombreAutor;
    private JLabel lblTituloLibro;
    private JLabel lblAnio;
    private JLabel lblCantidadLibros;
    private JButton btnBuscar;
    private JButton btnModificar;
    private JButton btnAtras;
    private JTextField txtBusqueda;
    private JTextField txtIsbn;
    private JTextField txtNombreAutor;
    private JTextField txtTituloLibro;
    private JTextField txtAnio;
    private JTextField txtCantidadLibros;
	private VentanaEditarLibro ventana;

    public PanelEditarLibro(VentanaEditarLibro ventana) {
    	this.ventana=ventana;

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
        lblTituloLibro = new JLabel("Buscar Libro por ISBN:");
        lblTituloLibro.setForeground(marron);
        lblTituloLibro.setFont(os);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(30, 3, 30, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelBusqueda.add(lblTituloLibro, gbc);

        txtBusqueda = new JTextField(15);
        txtBusqueda.setFont(os);
       
        lblIsbn = new JLabel("Codigo Isbn");
        lblIsbn.setEnabled(false);
        lblIsbn.setForeground(marron);
        lblIsbn.setFont(os);

        txtIsbn = new JTextField();
        txtIsbn.setEnabled(false);
        txtIsbn.setFont(os);

        lblNombreAutor = new JLabel("Nombre Autor:");
        lblNombreAutor.setEnabled(false);
        lblNombreAutor.setForeground(marron);
        lblNombreAutor.setFont(os);

        txtNombreAutor = new JTextField(15);
        txtNombreAutor.setEnabled(false);
        txtNombreAutor.setFont(os);

        lblTituloLibro = new JLabel("Titulo Libro:");
        lblTituloLibro.setEnabled(false);
        lblTituloLibro.setForeground(marron);
        lblTituloLibro.setFont(os);

        txtTituloLibro = new JTextField(15);
        txtTituloLibro.setEnabled(false);
        txtTituloLibro.setFont(os);

        lblAnio = new JLabel("Año :");
        lblAnio.setEnabled(false);
        lblAnio.setForeground(marron);
        lblAnio.setFont(os);

        txtAnio = new JTextField(15);
        txtAnio.setEnabled(false);
        txtAnio.setFont(os);

        lblCantidadLibros = new JLabel("Cantidad Libros:");
        lblCantidadLibros.setEnabled(false);
        lblCantidadLibros.setForeground(marron);
        lblCantidadLibros.setFont(os);

        txtCantidadLibros = new JTextField(15);
        txtCantidadLibros.setEnabled(false);
        txtCantidadLibros.setFont(os);
        
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

        btnAtras=new JButton("Atras");
      		btnAtras.setEnabled(true);
      		btnAtras.addActionListener(this);
      		btnAtras.setForeground(amarillo);
      		btnAtras.setBackground(marron);
      		btnAtras.setFont(osb);

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
        panelDatos.add(lblIsbn, gbc1);

        gbc1.gridx = 1;
        gbc1.gridy = 0;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(15, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtIsbn, gbc1);

        gbc1.gridx = 0;
        gbc1.gridy = 1;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblNombreAutor, gbc1);

        gbc1.gridx = 1;
        gbc1.gridy = 1;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtNombreAutor, gbc1);

        gbc1.gridx = 0;
        gbc1.gridy = 2;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblTituloLibro, gbc1);

        gbc1.gridx = 1;
        gbc1.gridy = 2;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtTituloLibro, gbc1);

        gbc1.gridx = 0;
        gbc1.gridy = 3;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblAnio, gbc1);

        gbc1.gridx = 1;
        gbc1.gridy = 3;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtAnio, gbc1);

        gbc1.gridx = 0;
        gbc1.gridy = 4;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblCantidadLibros, gbc1);

        gbc1.gridx = 1;
        gbc1.gridy = 4;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(3, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtCantidadLibros, gbc1);
        
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
        
        
    	gbc2.gridx = 3;
		gbc2.gridy = 1;
		gbc2.gridwidth = 1;
		gbc2.gridheight = 1;
		gbc2.weightx = 0.0;
		gbc2.weighty = 1.0;
		gbc2.insets = new Insets(3, 3, 3, 3);
		gbc2.fill = GridBagConstraints.BOTH;
		gbc2.anchor = GridBagConstraints.NORTH;
		panelDB.add(btnAtras, gbc2);
     
     
     
        panelDB.setBackground(null);
        
        this.add(panelBusqueda);
        this.add(lblIngreseNA);
        this.add(panelDB);
        this.setBackground(new Color(255, 194, 92));
        
      }

    public String getIsbn() {
        return txtIsbn.getText();
    }
    public void setTxtIsbn(String txtisbn) {
        this.txtIsbn.setText(txtisbn);
    }

    public String getTxtNombreAutor() {
        return txtNombreAutor.getText();
    }
    public void setTxtnombreAutor(String txtnombreAutor) {
        this.txtNombreAutor.setText(txtnombreAutor);
    }
    	
    public String getTxtTituloLibro() {
        return txtTituloLibro.getText();
    }

       public void setTxtTituloLibro(String txtTituloLibro) {
        this.txtTituloLibro.setText(txtTituloLibro);
    }
    	
       public String getTxtAnio() {
           return txtAnio.getText();
       }

       public void setTxtnombre(String txtAnio) {
           this.txtAnio.setText(txtAnio);
       }
       public String getTxtCantidadLibros() {
           return txtCantidadLibros.getText();
       }
       public void setTxtCantidadLibros(String txtcantidadLibros) {
           this.txtCantidadLibros.setText(txtcantidadLibros);
       }
       public void actionPerformed(ActionEvent evento) {
    	
		if(evento.getSource()==btnBuscar){
			Libro libro;
			try {
				libro = Biblioteca.getInstance().consultarLibro(txtBusqueda.getText());
				if(libro!=null){//no busca si existe o no
					txtIsbn.setText(libro.getIsbn());
					txtNombreAutor.setText(libro.getNombreAutor());
					txtTituloLibro.setText(libro.getTituloLibro()); 
					txtAnio.setText(libro.getAnio());
					txtCantidadLibros.setText(libro.getCantidadLibros());
					txtCantidadLibros.setEnabled(true);
				}
				else{
					JOptionPane.showMessageDialog(this, "No se encontro el libro");
				}
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		   
			else if (evento.getSource()==btnModificar){
			
			Libro libroEditado;
			try {
				libroEditado=Biblioteca.getInstance().consultarLibro(txtBusqueda.getText());
				libroEditado.setCantidadLibros(txtCantidadLibros.getText());
				
					String isbn = txtIsbn.getText();
					String nombreAutor = txtNombreAutor.getText();
					String tituloLibro = txtTituloLibro.getText();
					String anio = txtAnio.getText();
					String cantidadLibros = txtCantidadLibros.getText();
					try {
					Biblioteca.getInstance().editarLibro(isbn,
							nombreAutor,
							tituloLibro,
							anio,
							cantidadLibros);;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(this, e.getMessage());
				}
				JOptionPane.showMessageDialog(this, "El Libro ha sido editado");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, e.getMessage());
				
			}
			
			}
			else 
		if (evento.getSource() ==  btnAtras) {
			this.setVisible(false);
			this.setLayout(null);
			ventana.cerrar();
		}
	
	
		}		
}