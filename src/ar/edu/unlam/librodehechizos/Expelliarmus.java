package ar.edu.unlam.librodehechizos;

public class Expelliarmus extends Hechizo{

	public Expelliarmus() {
		super("expelliarmus");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aplicarHechizo(Hechizable hechizado) {
		hechizado.serDesarmado();		
	}
	
}
