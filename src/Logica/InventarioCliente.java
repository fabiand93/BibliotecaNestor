package Logica;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class InventarioCliente {

	private ArrayList<Cliente> listaCliente;
	private File archivoClientes;

	public InventarioCliente(){
		listaCliente = new ArrayList<Cliente>();
	}

	public  void agregarCliente(String id ,String nombre,String apellido,String usuario,String contrasena) throws Exception{
		if(!existeCliente(id)){
			Cliente cliente = new Cliente(id,nombre,apellido,usuario,contrasena);
			listaCliente.add(cliente);
			this.guardarDatos();

		}
		else
			throw new Exception ("El Cliente con documento: "+id+" Ya Existe");
	}

	//Mostrar lista Cliente que agrego.
	public  String mostrarLista() throws Exception{
		for(int i=0;i<listaCliente.size();i++)
			if (listaCliente.get(0) == null){
				System.out.println("La lista esta vacia");
			}
			else{
				for ( i = 0; i <listaCliente.size(); i++) {
					System.out.println("tamaño: " + listaCliente.size());
					System.out.println(listaCliente.get(i));
				} 
			}
		return listaCliente.toString();
	}

	//BUSCAR Cliente//
	public boolean existeCliente(String id)throws Exception{

		boolean encontro = false;
		for (int i = 0; (i <listaCliente.size() && !encontro); i++) {
			if(id.equals(listaCliente.get(i).getId()))    {
				encontro = true;
			}
		}
		return encontro;
	}
	
	public boolean existeContrasena(String contrasena)throws Exception{

		boolean encontro = false;
		for (int i = 0; (i <listaCliente.size() && !encontro); i++) {
			if(contrasena.equals(listaCliente.get(i).getContrasena()))    {
				encontro = true;
			}
		}
		return encontro;
	}
	
	
	//ELIMINAR Cliente
	public void eliminarCliente (String id)  throws Exception {
		for (int i = 0; i <listaCliente.size(); i++) {
			if(id.equals(listaCliente.get(i).getId())){
				listaCliente.remove(i);
			}
			
		}
		
	}
	
	//Consultar Cliente
	public Cliente consultarCliente(String id) throws Exception{
		Cliente cliente = null;
		boolean encontro =false;
		for (int i = 0; (i < listaCliente.size() && !encontro); i++) {
			if(id.equals(listaCliente.get(i).getId())){
				encontro = true;
				cliente= listaCliente.get(i);
			}
		}
		return cliente;
	}

//	CALCULAR POSICION
	public int calcularPosicion(String id) {
		boolean encontro = false;
		int pos = -1;
		for (int i = 0; (i < listaCliente.size() && !encontro); i++) {
			if(id.equals(listaCliente.get(i).getId()))    {
				encontro = true;
				pos = i;
			}
		}
		return pos;
	}

	public void editarCliente(String id,
			String nombre,
			String apellido,
			String usuario,
			String contrasena) throws Exception {
		boolean encontro = false;
		if(existeCliente(id)){
		for (int i = 0; (i < listaCliente.size() && !encontro); i++) {
			if(id.equals(listaCliente.get(i).getId()))    {
				encontro = true;
				listaCliente.get(i).setNombre(nombre);
				listaCliente.get(i).setApellido(apellido);
				listaCliente.get(i).setId(id);
				listaCliente.get(i).setUsuario(usuario);
				listaCliente.get(i).setContrasena(contrasena);
			}
		}
	}
		else
			throw new Exception ("El cliente con documento: "+id+" no existe");
	}

	public void setArchivoClientes(String nombreArchivo){
		this.archivoClientes=new File(nombreArchivo);
	}

	public void cargarDatos() throws Exception{
		Lector lector;
		String lineaLeida=null;
		String[] datos;
		lector = new Lector(archivoClientes);

		while((lineaLeida=lector.leerLinea())!=null){
			datos= lineaLeida.split(",");
			agregarCliente(datos[0],datos[1],datos[2],datos[3],datos[4]);
		}
	}

	public void guardarDatos() throws IOException{
		String linea=null;

		Escritor escritor=new Escritor(archivoClientes);
		for(int i=0;i<listaCliente.size();i++){
			linea=listaCliente.get(i).toString();
			escritor.escribir(linea);
		}
		escritor.cerrar();
	}

	//total clientes//
	public int totalClientes(){
		return listaCliente.size();
	}
	public String toString(){		
		return "" +listaCliente;
	}

	public ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(ArrayList<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public boolean existeUsuario(String usuario) {
		boolean encontro = false;
		for (int i = 0; (i <listaCliente.size() && !encontro); i++) {
			if(usuario.equals(listaCliente.get(i).getUsuario()))    {
				encontro = true;
			}
		}
		return encontro;
		
	}

}