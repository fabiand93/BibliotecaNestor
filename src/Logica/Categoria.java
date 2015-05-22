package Logica;

public class Categoria {

	
	private String tipoCategoria;
	private String idioma;
	
	public Categoria(String tipoCategoria ,String idioma){
		this.tipoCategoria=tipoCategoria;
		this.idioma=idioma;
	}

	public String getTipoCategoria() {
		return tipoCategoria;
	}

	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String toString() {
		return tipoCategoria + "/" + idioma;
	}
}
