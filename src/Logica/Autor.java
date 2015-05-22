package Logica;

public class Autor {
	
	private String generoEscribe;
	private String nacionalidad;
	
	
	public Autor(String generoEscribe,String nacionalidad){
		this.generoEscribe=generoEscribe;
		this.nacionalidad=nacionalidad;
	}


	public String getGeneroEscribe() {
		return generoEscribe;
	}


	public void setGeneroEscribe(String generoEscribe) {
		this.generoEscribe = generoEscribe;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String toString() {
		return generoEscribe + "/" + nacionalidad;
	}

}
