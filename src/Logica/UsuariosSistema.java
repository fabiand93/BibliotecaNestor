package Logica;

import java.util.ArrayList;

import Logica.UsuarioAdministrador;
import Logica.UsuarioCliente;

public class UsuariosSistema {

	
	private ArrayList<UsuarioCliente> listaCliente = new ArrayList<UsuarioCliente>();
	private ArrayList<UsuarioAdministrador> listaAdministrador = new ArrayList<UsuarioAdministrador>();


	public UsuariosSistema (){

		//--------------------ASESORES COMERCIALES POR DEFECTO--------------------------//

		UsuarioAdministrador usuario = new UsuarioAdministrador();
	}
	

	//LOGIN
	public static boolean login (String usuario, String contrasena){
		boolean correcto = false;
			if (usuario.equals("Daniel")&& contrasena.equals("123")){
			correcto=true;	
				}
			else if (usuario.equals("Carlos")&& contrasena.equals("19")){
				correcto=true;	
					}
			else if (usuario.equals("Juan")&& contrasena.equals("18")){
				correcto=true;	
					}
			else if (usuario.equals("Nestor")&& contrasena.equals("22")){
				correcto=true;	
					}
	return correcto;
				
	}


	public ArrayList<UsuarioCliente> getListaCliente() {
		return listaCliente;
	}


	public void setListaCliente(ArrayList<UsuarioCliente> listaCliente) {
		this.listaCliente = listaCliente;
	}


	public ArrayList<UsuarioAdministrador> getListaAdministrador() {
		return listaAdministrador;
	}


	public void setListaAdministrador(
			ArrayList<UsuarioAdministrador> listaAdministrador) {
		this.listaAdministrador = listaAdministrador;
	}
		}

