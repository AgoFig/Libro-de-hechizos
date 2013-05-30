package ar.edu.unlam.librodehechizos;

public class Animal implements Hechizable {
	String estado = "Soy un animal entero";
	
	@Override
	public void serDesarmado() {
		this.estado = "Me desarmaron";		
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
