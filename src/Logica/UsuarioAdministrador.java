package Logica;

public class UsuarioAdministrador {
	private String usuario;
	private String contrasena;
	private String cargo;


	public UsuarioAdministrador (String cargo, String usuario,String contrasena){

		this.cargo=cargo;
		this.usuario = usuario;
		this.contrasena = contrasena;

	}


	public UsuarioAdministrador (){}


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	
	public String getcontrasena() {
		return contrasena;
	}

	public void setcontrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String toString (){

		return usuario +"\t"+ contrasena;

	}


		
	}

