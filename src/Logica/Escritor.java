package Logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

 
public class Escritor {
	
	private PrintWriter pw;
	
	public Escritor(File Archivo) throws FileNotFoundException {
		pw = new PrintWriter(Archivo);
	}
	
	public void escribir (String linea) {
		pw.println(linea);
	}
	
	public void cerrar () {
		pw.close();
	}
}
