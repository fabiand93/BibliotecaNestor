package Logica;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class InventarioLibro {

	private ArrayList<Libro> listaLibro;
	private File archivoLibros;

	public InventarioLibro(){

		listaLibro = new ArrayList<Libro>();

	}

	//Agregar al LIBRO 1

	public  void agregarLibro(String isbn,String nombreAutor,String tituloLibro,String anio, String cantidadLibros) throws Exception{
		if(!existeLibro(isbn)){
			Libro libro=new Libro(isbn,nombreAutor,tituloLibro,anio,cantidadLibros);
			listaLibro.add(libro);
			guardarDatosLibros();
		}
		else
			throw new Exception ("El libro con ISBN: "+isbn+" Ya Existe");
	}


	//Mostrar lista LIBROS que agrego.
	public  String mostrarListaLibro()throws Exception{
		for(int i=0;i<listaLibro.size();i++)
			if (listaLibro.get(0) == null){
				System.out.println("La lista esta vacia"+listaLibro.get(0).getTituloLibro());
			}else{
				for ( i = 0; i < listaLibro.size(); i++) {
					System.out.println(listaLibro.get(i).getIsbn()+""+listaLibro.get(i).getNombreAutor() + " " + listaLibro.get(i).getTituloLibro() + " " + listaLibro.get(i).getAnio() + " "+listaLibro.get(i).getCantidadLibros() );
				}
			}
		return listaLibro.toString();

	}

	//BUSCAR LIBRO//
	public boolean existeLibro(String isbn )throws Exception{

		boolean encontro = false;
		for (int i = 0; (i < listaLibro.size() && !encontro); i++) {
			if(isbn.equals(listaLibro.get(i).getIsbn()))	{
				encontro = true;

			}


		}

		return encontro;

	}



	//ELIMINAR LIBRO
	@SuppressWarnings("unused")
	public void eliminarLibro (String isbn) throws Exception {
		System.out.println("1");
		boolean pos=existeLibro(isbn);


		for (int i = 0; i < listaLibro.size(); i++) {
			if(isbn.equals(listaLibro.get(i).getIsbn())){
				listaLibro.remove(i);

			}
			else
				throw new Exception("No se encontro ningun libro con ISBN="+isbn);



		}
	}

	//Consultar LIBRO

	public Libro consultarLibro(String isbn) throws Exception{
		Libro libro = null;
		boolean encontro =false;
		for (int i = 0; (i < listaLibro.size() && !encontro); i++) {
			if(isbn.equals(listaLibro.get(i).getIsbn()))	{
				encontro = true;
				libro=listaLibro.get(i);


			}

		}
		return libro;

	}



	//	//CALCULAR POSICION
	public int calcularPosicionLibro(String isbn) {
		boolean encontro = false;
		int pos = -1;
		for (int i = 0; (i < listaLibro.size() && !encontro); i++) {
			if(isbn.equals(listaLibro.get(i).getTituloLibro()))	{
				encontro = true;
				pos = i;
			}
		}
		return pos;
	}

	public void editarLibro(String isbn,
			String nombreAutor,
			String tituloLibro,
			String anio,
			String cantidadLibros ) throws Exception {
		boolean encontro = false;
		if(existeLibro(isbn)){
			for (int i = 0; (i < listaLibro.size() && !encontro); i++) {
				if(isbn.equals(listaLibro.get(i).getIsbn()))    {
					encontro = true;
					listaLibro.get(i).setIsbn(isbn);
					listaLibro.get(i).setNombreAutor(nombreAutor);
					listaLibro.get(i).setIsbn(tituloLibro);
					listaLibro.get(i).setAnio(anio);
					listaLibro.get(i).setCantidadLibros(cantidadLibros);

				}
			}
		}
		else
			throw new Exception ("No existe el libro con ISBN= "+isbn);
	}

	public void setArchivoLibros(String nombreArchivoLibro){
		this.archivoLibros=new File(nombreArchivoLibro);
	}
	public void cargarDatosLibros() throws Exception{
		Lector lector;
		String lineaLeida=null;
		String[] datos;
		lector = new Lector(archivoLibros);


		while((lineaLeida=lector.leerLinea())!=null){
			datos= lineaLeida.split(",");
			agregarLibro(datos[0],datos[1],datos[2],datos[3],datos[4]);
		}
	}
	public void guardarDatosLibros() throws IOException{
		String linea=null;

		Escritor escritorLibros=new Escritor(archivoLibros);
		for(int i=0;i<listaLibro.size();i++){
			linea=listaLibro.get(i).toString();
			escritorLibros.escribir(linea);
		}
		escritorLibros.cerrar();
	}
	//total clientes//
	public int totalLibros(){
		return listaLibro.size();
	}


	public String toString(){

		return "" +listaLibro;
	}


	public ArrayList<Libro> getListaLibro() {
		return listaLibro;
	}

	public void setListaLibro(ArrayList<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}

}
