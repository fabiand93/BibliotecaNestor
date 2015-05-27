package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Logica.Biblioteca;
import Logica.InventarioLibro;




public class PanelAgregarLibro extends JPanel implements ActionListener {



    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblInicial;
    private JLabel lblIsbn;
    private JLabel lblNombreAutor;
    private JLabel lblTituloLibro;
    private JLabel lblAnio;
    private JLabel lblCantidadLibros;
    private JTextField txtIsbn;
    private JTextField txtNombreAutor;
    private JTextField txtTituloLibro;
    private JTextField txtAnio;

    private JTextField txtCantidadLibros;


    private JButton btnAgregar,btnAtras;
    private InventarioLibro inventarioLibro = new InventarioLibro(); 
    private VentanaAgregarLibro ventana;

    public PanelAgregarLibro(VentanaAgregarLibro ventana) {

        this.ventana = ventana;

        lblInicial = new JLabel("Introduzca los datos del libro");

        lblIsbn = new JLabel("Codigo libro:");
        txtIsbn = new JTextField(10);
        lblNombreAutor = new JLabel("Autor Libro:");
        txtNombreAutor = new JTextField(10);
        lblTituloLibro = new JLabel("Titulo:");
        txtTituloLibro = new JTextField(10);

      

        lblAnio = new JLabel("anio:");
        txtAnio = new JTextField(10);
        lblCantidadLibros = new JLabel("Cantidad:");
        txtCantidadLibros = new JTextField(10);


        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        btnAtras = new JButton("Volver");
        btnAtras.addActionListener(this);

        //CREACION Y POSICIONAMIENTO DEL PANEL DE DATOS



        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(30, 10, 3, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblIsbn, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(30, 10, 3, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtIsbn, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 10, 3, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblNombreAutor, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 10, 3, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtNombreAutor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 10, 3, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblTituloLibro, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 10, 3, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtTituloLibro, gbc);




        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 10, 3, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblAnio, gbc);

        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 10, 3, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtAnio, gbc);


        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 10, 3, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelDatos.add(lblCantidadLibros, gbc);

        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 10, 3, 3);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        panelDatos.add(txtCantidadLibros, gbc);


        panelDatos.setBackground(null);

        //CREACION Y POSICIONAMIENTO DEL PANEL DE BOTONES
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();

        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(30, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelBotones.add(btnAgregar, gbc1);

        //boton agregar
        gbc1.gridx = 1;
        gbc1.gridy = 0;
        gbc1.gridwidth = 1;
        gbc1.gridheight = 1;
        gbc1.weightx = 0.0;
        gbc1.weighty = 1.0;
        gbc1.insets = new Insets(30, 3, 3, 3);
        gbc1.fill = GridBagConstraints.BOTH;
        gbc1.anchor = GridBagConstraints.WEST;
        panelBotones.add( btnAtras, gbc1);



        panelBotones.setBackground(null);

        this.add(lblInicial);
        this.add(panelDatos);
        this.add(panelBotones);
        this.setBackground(new Color(255, 194, 92));


        Color cTipografia = new Color(127, 52, 45);
        Font osb = new Font("Open Sans", Font.BOLD, 15);
        Font os = new Font("Open Sans", Font.PLAIN, 14);
        lblInicial.setFont(osb);
        lblInicial.setForeground(cTipografia);
        lblIsbn.setFont(os);
        lblIsbn.setForeground(cTipografia);
        txtIsbn.setFont(os);
        lblNombreAutor.setForeground(cTipografia);
        lblNombreAutor.setFont(os);
        txtNombreAutor.setFont(os);

        lblTituloLibro.setForeground(cTipografia);
        lblTituloLibro.setFont(os);
        txtTituloLibro.setFont(os);


        lblAnio.setForeground(cTipografia);
        lblAnio.setFont(os);
        txtAnio.setFont(os);





        lblCantidadLibros.setForeground(cTipografia);
        lblCantidadLibros.setFont(os);
        txtCantidadLibros.setFont(os);

        btnAgregar.setFont(osb);
        btnAgregar.setBackground(new Color(127, 52, 45));
        btnAgregar.setForeground(new Color(255, 194, 92));
        btnAgregar.setToolTipText("Confirma la informacion"); //Muestra informacion del elemento con el cursor

        btnAtras.setFont(osb);
        btnAtras.setBackground(new Color(127, 52, 45));
        btnAtras.setForeground(new Color(255, 194, 92));

    }



    //cogo el campom de texto
    public  String getTxtIsbn() {
        return txtIsbn.getText();
    }




    public void setTxtIsbn(String txtIsbn) {
        this.txtIsbn.setText(txtIsbn);
    }

    public  String getTxtNombreAutor() {
        return txtNombreAutor.getText();
    }




    public void setNombreAutor(String txtNombreAutor) {
        this.txtNombreAutor.setText(txtNombreAutor);
    }



    public  String getTxtTituloLibro() {
        return txtTituloLibro.getText();
    }




    public void setTxtTituloLibro(String txtTituloLibro) {
        this.txtTituloLibro.setText(txtTituloLibro);
    }



    public String getTxtAnio() {
        return txtAnio.getText();
    }



    public void setTxtAnio(String txtAnio) {
        this.txtAnio.setText(txtAnio);
    }
    
    public String getTxtCantidadLibros() {
        return txtCantidadLibros.getText();
    }



    public void setTxtCantidadLibros(String txtCantidadLibros) {
        this.txtCantidadLibros.setText(txtCantidadLibros);
    }


    public JButton getBtnAgregar() {
        return btnAgregar;
    }



    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public InventarioLibro getInventarioLibro() {
        return inventarioLibro;
    }



    public void setInventarioLibro(InventarioLibro inventarioLibro) {
        this.inventarioLibro = inventarioLibro;
    }



    public void actionPerformed(ActionEvent evento) {



        if (evento.getSource() ==  btnAtras) {
            this.setVisible(false);
            this.setLayout(null);
            ventana.cerrar();
        }


        else if (evento.getSource() == btnAgregar) {
            String isbn = txtIsbn.getText();
            String nombreAutor = txtNombreAutor.getText();
            String tituloLibro = txtTituloLibro.getText();
            String anio = txtAnio.getText(); 
            String cantidadLibros=txtCantidadLibros.getText();

            try {
                Biblioteca.getInstance().agregarLibro(isbn, nombreAutor, tituloLibro, anio, cantidadLibros);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            setTxtIsbn(null);
            setNombreAutor(null);
            setTxtTituloLibro(null);
            setTxtAnio(null);
            setTxtCantidadLibros(null);

        }
    }
}