package Logica;

import java.io.IOException;

public class Biblioteca {
	private InventarioCliente inventarioCliente;
	private InventarioLibro inventarioLibro;
	private UsuariosSistema usuariosSistema;

	private Biblioteca(){
		inventarioCliente=new InventarioCliente();
		usuariosSistema=new UsuariosSistema();
		inventarioLibro=new InventarioLibro();
	}


	private static Biblioteca instance;
	public static Biblioteca getInstance() {
		if (instance == null) {
			instance = new Biblioteca();
		}
		return instance;
	}
	  //Archivo Libro//
    public void cargarDatosLibros() throws Exception{
        inventarioLibro.cargarDatosLibros();
    }
    public void guarDatosLibros() throws IOException{
        inventarioLibro.guardarDatosLibros();
    }
    public void setArchivoLibros(String nombreArchivoLibro){
        inventarioLibro.setArchivoLibros(nombreArchivoLibro);
    }
	public void cargarDatos() throws Exception{
		inventarioCliente.cargarDatos();
	}

	public void guardarDatos() throws IOException{
		inventarioCliente.guardarDatos();
	}

	public void setArchivoClientes(String nombreArchivo){
		inventarioCliente.setArchivoClientes(nombreArchivo);
	}
	//Hacer la contrasena

	//LOGIN
	public boolean login (String usuario, String contrasena){		
		return UsuariosSistema.login(usuario, contrasena);
	}

	public void agregarCliente(String id,String nombre, String apellido, String usuario, String contrasena) throws Exception{
		inventarioCliente.agregarCliente(id,nombre, apellido, usuario, contrasena);
	}

	//editar  cliente
	public void editarCliente(String nombre, String apellido,String id,String usuario, String contrasena) throws Exception {
		inventarioCliente.editarCliente(nombre,apellido,id,usuario,contrasena);
	}

	//mostrar lista cliente
	public void  mostrarLista() throws Exception{
		inventarioCliente.mostrarLista();
	}
	//mostrar lista libro
	public void  mostrarListaLibro() throws Exception{
		inventarioLibro.mostrarListaLibro();
	}
	//Buscar cliente
	public boolean buscarCliente(String id) throws Exception {
		return inventarioCliente.existeCliente(id);
	}
	
	public boolean existeContrasena(String contrasena)throws Exception{
		return inventarioCliente.existeContrasena(contrasena);
	}
	//Calcular posicion
	public int calcularPosicion(String id) {
		return inventarioCliente.calcularPosicion(id);
	}

	//total clientes//
	public int totalCliente(){
		return inventarioCliente.totalClientes();
	}

	//total libros//
	public int totalLibro(){
		return inventarioLibro.totalLibros();
	}
	public Cliente tomarCliente(String id) throws Exception{
		return inventarioCliente.consultarCliente(id);
	}

	//metodo agregar libro//
	public void agregarLibro(String isbn,String nombreAutor,String tituloLibro,String anio, String cantidadLibros) throws Exception{

		inventarioLibro.agregarLibro(isbn, nombreAutor, tituloLibro, anio, cantidadLibros);
	}
	//Buscar libro
	public boolean buscarLibro(String isbn) throws Exception {
		return inventarioLibro.existeLibro(isbn);
	}
	//Calcular posicion libro
	public int calcularPosicionLibro(String isbn) {
		return inventarioLibro.calcularPosicionLibro(isbn);
	}

	public void eliminarLibro(String isbn) throws Exception{
		inventarioLibro.eliminarLibro(isbn);
	}
	public void eliminarCliente(String id1) throws Exception{
		inventarioCliente.eliminarCliente(id1);
	}
	public Libro consultarLibro(String isbn) throws Exception{
		return inventarioLibro.consultarLibro(isbn);
	}

	public Cliente consultarCliente(String id) throws Exception{
		return inventarioCliente.consultarCliente(id);
	}
	//				editar  libro
	public void editarLibro(String isbn,String nombreAutor,String tituloLibro,String anio, String cantidadLibros) throws Exception {
		inventarioLibro.editarLibro( isbn,nombreAutor,tituloLibro,anio ,cantidadLibros);
	}
	//------------------------------SET Y GET-------------------------------------------------------------------------------------------------
	public InventarioCliente getInventarioCliente() {
		return inventarioCliente;
	}

	public void setInventarioCliente(InventarioCliente inventarioCliente) {
		this.inventarioCliente = inventarioCliente;
	}

	public InventarioLibro getInventarioLibro() {
		return inventarioLibro;
	}

	public void setInventarioLibro(InventarioLibro inventarioLibro) {
		this.inventarioLibro = inventarioLibro;
	}

	public UsuariosSistema getUsuariosSistema() {
		return usuariosSistema;
	}

	public void setUsuariosSistema(UsuariosSistema usuariosSistema) {
		this.usuariosSistema = usuariosSistema;
	}

	public static void setInstance(Biblioteca instance) {
		Biblioteca.instance = instance;
	}
	public boolean existeUsuario(String usuario) {
		return inventarioCliente.existeUsuario(usuario);
	}

}