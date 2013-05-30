package ar.edu.unlam.librodehechizos;

import java.util.HashMap;
import java.util.Map;

public class LibroDeHechizos {
	private Map<String,Hechizo> lista = new HashMap<String,Hechizo>();

	public Hechizo buscar(String conjuro) {
		return lista.get(conjuro);
	}

	public Hechizo agregarHechizo(Hechizo hechizo) {
		return lista.put(hechizo.getConjuro(), hechizo);
	}
	
	
	
	
	
}
