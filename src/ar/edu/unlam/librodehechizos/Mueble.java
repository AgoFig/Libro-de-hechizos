package ar.edu.unlam.librodehechizos;

public class Mueble implements Hechizable{
	String estado;
	@Override
	public void serDesarmado() {
		this.estado = "No paso nada";
		
	}
	@Override
	public String getEstado() {
		return this.estado;
	}
	@Override
	public void serAgrandado() {
		this.estado = "Ahora soy mas grande";
		
	}

}
