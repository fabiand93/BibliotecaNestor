package Logica;
public class Cliente extends Persona {

	private String usuario;
	private String contrasena;
	

	public Cliente(String id,String nombre,String apellido,String usuario, String contrasena){
		super(id,nombre,apellido);
		this.usuario=usuario;
		this.contrasena=contrasena;
	}
	
	public String toString() {
		return super.toString()+","+this.usuario+","+this.contrasena;

}
	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}