	package Logica;
	import java.io.BufferedReader;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	
	public class Lector {

	    private BufferedReader br;
	    
	    public Lector(File archivo) throws FileNotFoundException {
	    	
	        br = new BufferedReader (new FileReader(archivo));
	    }
	    
	    public String leerLinea() throws IOException {
	        return br.readLine();
	    }
	    
	    public void cerrar() throws IOException {
	        br.close();
	    }
	}
