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

public class PanelEliminarCliente extends JPanel implements ActionListener {


	Biblioteca e = Biblioteca.getInstance();

	JPanel pn = new JPanel();
	private JLabel lblId;
	private JTextField txtId;
	private JButton btnEliminar;



	public PanelEliminarCliente(){
		
				JLabel Logo = new JLabel(new ImageIcon(getClass().getResource("../imagenes/buscarCliente.png")));

		
		Font osb = new Font( "Open Sans",Font.BOLD,15); 
		Font os = new Font( "Open Sans",Font.PLAIN,14);

		
		Color marron = new Color(127, 52, 45);
		Color amarillo = new Color(255, 194, 92);

		lblId = new JLabel("Id: ");
		lblId.setForeground(marron);
		lblId.setFont(os);

		txtId = new JTextField(20);
		txtId.setFont(os);

		btnEliminar = new JButton("Buscar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBackground(marron);
		btnEliminar.setForeground(amarillo);
		btnEliminar.setFont(osb);


		pn.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		pn.add(lblId, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		pn.add(txtId, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(10, 3, 3, 3);
		gbc.fill = GridBagConstraints.EAST;
		pn.add(btnEliminar, gbc);

		pn.setBackground(null);


		this.add(pn);
		this.setForeground(marron);
		this.setBackground(amarillo);
		
		
		
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		gbc1.weightx = 0.0;
		gbc1.weighty = 1.0;
		gbc1.insets = new Insets(3, 3, 3, 3);
		this.add(Logo, gbc1);

		gbc1.gridx = 0;
		gbc1.gridy = 1;
		gbc1.gridwidth = 1;
		gbc1.gridheight = 1;
		gbc1.weightx = 0.0;
		gbc1.weighty = 1.0;
		gbc1.insets = new Insets(3, 3, 3, 3);
		this.add(pn, gbc1);

		
		
	}

	
	public String getTxtId() {
		return txtId.getText();
	}

	
	public void setTxtId(String txtId) {
		this.txtId.setText(txtId);
	}	

	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==btnEliminar){
			String id = txtId.getText();
			try {
				Biblioteca.getInstance().eliminarCliente(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, "El usuario se elimino correctamente correctamente");
		}
	}
}

