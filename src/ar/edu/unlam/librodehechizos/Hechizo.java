package ar.edu.unlam.librodehechizos;

public abstract class Hechizo {
	private String conjuro;

	public Hechizo(String conjuro) {
		super();
		this.conjuro = conjuro;
	}
	
	public abstract void aplicarHechizo(Hechizable hechizado);
	public String getConjuro(){
		return this.conjuro;
	}
}
