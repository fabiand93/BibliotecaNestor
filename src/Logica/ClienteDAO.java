package Logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import prueba.connection.DbConnection;
import Logica.Cliente;;

public class ClienteDAO {
	
	public void registrarPersona(Cliente cliente) 
	{
		DbConnection conex= new DbConnection();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO persona VALUES ('"+cliente.getId()+"', '"
					+cliente.getNombre()+"', '"+cliente.getApellido()+"', '"
					+cliente.getUsuario()+"', '"+cliente.getContrasena()+"')");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();

		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se registro la persona");
			}
	}
	
	public ArrayList< Cliente> consultarPersona(int documento) {
		ArrayList< Cliente> miCliente = new ArrayList< Cliente>();
			DbConnection conex= new DbConnection();

			try {
				PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona where id = ? ");
				consulta.setInt(1, documento);
				ResultSet res = consulta.executeQuery();

				if(res.next()){
					Cliente cliente= new Cliente(null, null, null, null, null);
					cliente.setId(res.getString("id"));
					cliente.setNombre(res.getString("nombre"));
					cliente.setApellido(res.getString("apellido"));
					cliente.setUsuario(res.getString("usuario"));
					cliente.setContrasena(res.getString("contrasena"));
					miCliente.add(cliente);
				}
				res.close();
				consulta.close();
				conex.desconectar();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
			}
			return miCliente;
			}
	public ArrayList< Cliente> listaDePersonas() {
		ArrayList< Cliente> miCliente = new ArrayList< Cliente>();
		DbConnection conex= new DbConnection();

		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona");
			ResultSet res = consulta.executeQuery();
			while(res.next()){
				Cliente cliente= new Cliente(null, null, null, null, null);
				cliente.setId(res.getString("id"));
				cliente.setNombre(res.getString("nombre"));
				cliente.setApellido(res.getString("apellido"));
				cliente.setUsuario(res.getString("usuario"));
				cliente.setContrasena(res.getString("contrasena"));
				miCliente.add(cliente);
			}
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
		}
		return miCliente;
		}

}
