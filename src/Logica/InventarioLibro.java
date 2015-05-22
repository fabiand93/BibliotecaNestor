package Logica;

import java.util.ArrayList;


public class InventarioLibro {

	private ArrayList<Libro> listaLibro;

	public InventarioLibro(){

		listaLibro = new ArrayList<Libro>();

	}

	//Agregar al LIBRO 1

	public  void agregarLibro(String isbn,String nombreAutor,String tituloLibro,String anio, int cantidadLibros) throws Exception{

		boolean existe = existeLibro(isbn);

		if (existe)
				throw new Exception ("El libro con isbn "+isbn);
		else {
			Libro libro = new Libro(isbn,nombreAutor, tituloLibro,anio,  cantidadLibros);
			listaLibro.add(libro);
		}
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
			System.out.println(listaLibro.get(i).getIsbn()+""+listaLibro.get(i).getNombreAutor() + " " + listaLibro.get(i).getTituloLibro() + " " + listaLibro.get(i).getAnio() + " "+listaLibro.get(i).getCantidadLibros() );
			if(isbn.equals(listaLibro.get(i).getIsbn()))	{
				encontro = true;

			}


		}

		return encontro;

	}



	//ELIMINAR LIBRO
	public void eliminarLibro (String isbn) throws Exception {
		System.out.println("1");
		boolean pos=existeLibro(isbn);


		for (int i = 0; i < listaLibro.size(); i++) {
			if(isbn.equals(listaLibro.get(i).getIsbn())){
				listaLibro.remove(i);

			}
			else
				throw new Exception("No se encontro ningun libro="+isbn+"no existe");



		}
	}

	//Consultar LIBRO

	public Libro consultarLibro(String isbn) throws Exception{
		Libro libro = listaLibro.get(this.calcularPosicionLibro(isbn));

		boolean encontro =false;
		for (int i = 0; (i < listaLibro.size() && !encontro); i++) {
			if(isbn.equals(listaLibro.get(i).getTituloLibro()))	{
				encontro = true;


			}
			else
				throw new Exception("No se encontro ningun libro="+isbn+"no existe");

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

	public void editarLibro(String nombreLibro , String isbn, int cantidadLibros ) {
		boolean encontro = false;
		for (int i = 0; (i < listaLibro.size() && !encontro); i++) {
			if(nombreLibro.equals(listaLibro.get(i).getIsbn()))    {
				encontro = true;

				listaLibro.get(i).setIsbn(isbn);
				listaLibro.get(i).setCantidadLibros(cantidadLibros);

			}
		}}


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
