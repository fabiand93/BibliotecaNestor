package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Logica.Cliente;
import Logica.ClienteDAO;
import Logica.UsuariosSistema;
import Vista.VentanaPrincipal;

public class Main {
	public static void main(String[] args) {
		Main miPrincipal = new Main();
		UsuariosSistema s = new UsuariosSistema();
		miPrincipal.modoOperacion();
	}

	private void modoOperacion(){
		try{
			File f=new File("data/ManejoDatos.txt");
			if(f.exists()){
			}
				BufferedReader br = new BufferedReader(new FileReader(f));
				String linea = null;
				while ((linea=br.readLine())!=null){
					System.out.println(linea);
					if(linea.equals("1")){
						System.out.println("archivos");
						VentanaPrincipal ventPpal = new VentanaPrincipal();
						ventPpal.setVisible(true);
					}
					else
						if(linea.equals("2")){
							System.out.println("DB");
							this.verMenu();
						}
						else
							System.out.println("no entro nada");
				}
					
			}
		catch (Exception e){
			System.out.println(e);
		}
	}
	private void verMenu() {

		String textoMenu="Menú Principal\n\n";
		textoMenu+="Ingrese alguna de las opciones del Menú    \n";
		textoMenu+="1. Registrar Persona\n";
		textoMenu+="2. Consultar Persona\n";
		textoMenu+="3. Ver Lista Personas\n";
		textoMenu+="4. Salir.\n\n";

	try {
		int seleccion= Integer.parseInt(JOptionPane.showInputDialog(textoMenu));
		defineSeleccion(seleccion);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Error en el ingreso de Datos, " +
					"solo se permiten valores númericos","ERROR",JOptionPane.ERROR_MESSAGE);
			verMenu();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error en el ingreso de Datos, " +
					"solo se permiten valores númericos","ERROR",JOptionPane.ERROR_MESSAGE);
			verMenu();
			}
	}
	/**
	  * Permite determinar que accion ejecutar dependiendo del parametro de 
	  * ingreso correspondiente a las opciones del sistema
	  * @param seleccion
	  */
	private void defineSeleccion(int seleccion) {

		System.out.println("Selecciona "+seleccion);
		switch (seleccion) {
		case 1:
			registrarPersona();
			verMenu();
			break;
		case 2:
			int doc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero" +
					" de documento de la persona"));
			buscarPersona(doc);
			verMenu();
			break;
		case 3:
			obtenerRegistros();
			verMenu();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Ingrese un " +
					"numero valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
			verMenu();
			break;
			}
	}
	/**
	  * Permite solicitar los datos de la persona a registrar, se solicitan mediante
	  * una ventana de ingreso y se almacenan en un arreglo con toda la informacion usando
	  * para esto un ciclo for, posteriormente estos datos son almacenados en el
	  * atributo correspondiente del objeto persona para ser enviado al metodo de registro
	  * en la clase DAO
	  */
	private void registrarPersona() {
		ClienteDAO miClienteDAO = new ClienteDAO();
		Cliente miCliente=new Cliente(null,null,null,null,null);
		String mensajeIngreso="Ingrese\n\n";
		String datosSolicitados[] = {"Documento : ","Nombre : ",
				"Apellido: ","Usuario: ","Contraseña: "};
		String datosPersona[] = new String[5];
		for (int i = 0; i < datosSolicitados.length; i++) {
			//solicita el ingreso del dato y se almacena en el arreglo de datosPersona
			datosPersona[i]=JOptionPane.showInputDialog(null, mensajeIngreso+
					datosSolicitados[i],"Datos Persona",JOptionPane.INFORMATION_MESSAGE);
			System.out.println(datosSolicitados[i]+datosPersona[i]);
		}
		miCliente.setId(datosPersona[0]);
		miCliente.setNombre(datosPersona[1]);
		miCliente.setApellido(datosPersona[2]);
		miCliente.setUsuario(datosPersona[3]);
		miCliente.setContrasena(datosPersona[4]);
		miClienteDAO.registrarPersona(miCliente);
	}
	/**
	  * Permite obtener la lista de personas almacenada en la tabla persona
	  * si la lista se encuentra vacia quiere decir que no hay personas registradas
	  * acto seguido se presenta un mensaje en pantalla, sino se imprime la lista de 
	  * todas las personas registradas en la BD
	  */
	private void obtenerRegistros() {
		ClienteDAO miClienteDAO = new ClienteDAO();
		Cliente miPersona;

	//Se obtiene la lista de personas
		ArrayList< Cliente> listaPersonas = miClienteDAO.listaDePersonas();
	//se valida si se obtubo o no informacion
	if (listaPersonas.size()>0) {
		int numeroPersona=0;
		//se recorre la lista de personas asignandose cada posicion en un objeto persona
		for (int i = 0; i < listaPersonas.size(); i++) {
			numeroPersona++;
			miPersona=listaPersonas.get(i);
			System.out.println("****************Persona "+numeroPersona+"**********************");
			System.out.println("Id Persona: "+miPersona.getId());
			System.out.println("Nombre Persona: "+miPersona.getNombre());
			System.out.println("Edad Persona: "+miPersona.getApellido());
			System.out.println("Profesión Persona: "+miPersona.getUsuario());
			System.out.println("Telefono Persona: "+miPersona.getContrasena());
			System.out.println("*************************************************\n");
			}
		}else{
		JOptionPane.showMessageDialog(null,"Actualmente no " +
				"existen registros de personas","INFORMACIÓN",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	/**
	  * Permite la consulta de una persona en especifico mediante el envio de
	  * su documento de identidad como parametro, en caso de que no se retorne
	  * informacion se presenta un mensaje en pantalla, sino entonces se imprimen los
	  * datos de la persona encontrada
	  * @param documento
	  */
	private void buscarPersona(int documento) {
		ClienteDAO miClienteDAO = new ClienteDAO();
		Cliente miCliente;
		ArrayList<Cliente> personasEncontrada = miClienteDAO.consultarPersona(documento);
	//se valida que se encuentre la persona
		if (personasEncontrada.size()>0) {
			//se recorre la lista y se asignan los datos al objeto para imprimir los valores
			for (int i = 0; i < personasEncontrada.size(); i++) {
				miCliente=personasEncontrada.get(i);
				System.out.println("****************Persona*************************");
				System.out.println("Id Persona: "+miCliente.getId());
				System.out.println("Nombre Persona: "+miCliente.getNombre());
				System.out.println("Edad Persona: "+miCliente.getApellido());
				System.out.println("Profesión Persona: "+miCliente.getUsuario());
				System.out.println("Telefono Persona: "+miCliente.getContrasena());
				System.out.println("*************************************************\n");
				}
		}else{
		JOptionPane.showMessageDialog(null,"El documento ingresado " +
				"no corresponde a ninguna persona","INFORMACIÓN",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
