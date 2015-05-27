package Logica;

public class Libro {

	private String isbn;
	private String nombreAutor ;
	private String tituloLibro;
	private String anio;
	private String cantidadLibros;
	
		public Libro(String isbn,String nombreAutor,String tituloLibro,String anio, String cantidadLibros){
		this.isbn=isbn;
		this.nombreAutor=nombreAutor;
		this.tituloLibro=tituloLibro;
		this.anio=anio;
		this.cantidadLibros=cantidadLibros;
		
	}
		
		public String toString (){		
			return this.isbn+","+this.nombreAutor+","+this.tituloLibro+","+this.anio+","+this.cantidadLibros; 		
		
		}


	




	public String getNombreAutor() {
		return nombreAutor;
	}


	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}


	public String getTituloLibro() {
		return tituloLibro;
	}


	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}


	


	public String getAnio() {
		return anio;
	}







	public void setAnio(String anio) {
		this.anio = anio;
	}







	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public String getCantidadLibros() {
		return cantidadLibros;
	}







	public void setCantidadLibros(String cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}



}
