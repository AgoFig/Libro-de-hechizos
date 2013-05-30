package ar.edu.unlam.librodehechizos;

import org.junit.Assert;
import org.junit.Test;

public class HechizoTest {
	@Test
	public void queSePuedaAgregarUnHechizo(){
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus();
		
		libro.agregarHechizo(desarme);
		0
		Assert.assertEquals(desarme, libro.buscar("expelliarmus"));
	}
	
	@Test
	public void verSiUnHechizableEsHechizado(){
		LibroDeHechizos libro = new LibroDeHechizos();
		Expelliarmus desarme = new Expelliarmus();
		Hechizable perro = new Animal();
		
		libro.agregarHechizo(desarme);
		desarme.aplicarHechizo(perro);
		
		Assert.assertEquals("Me desarmaron", perro.getEstado());
		
		
	}
	
	@Test
	public void verSiUnHechizableCrece() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Agrandar("enormuvus");
		Hechizable mesa = new Mueble();
		
		libro.agregarHechizo(crecer);
		crecer.aplicarHechizo(mesa);
		
		Assert.assertEquals("Ahora soy mas grande", mesa.getEstado());
		
	}
}
