package TP_5;

public class Generos {
	
	private String genero;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return genero;
	}

	public Generos(String genero) {
		super();
		this.genero = genero;
	}
	
	
	public Generos() {
		
	}
	
	
	

}
