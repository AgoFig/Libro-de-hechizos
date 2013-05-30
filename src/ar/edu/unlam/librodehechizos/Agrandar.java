package ar.edu.unlam.librodehechizos;

public class Agrandar extends Hechizo{

	public Agrandar(String conjuro) {
		super(conjuro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aplicarHechizo(Hechizable hechizado) {
		hechizado.serAgrandado();		
	}

}
