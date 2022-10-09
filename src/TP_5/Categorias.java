package TP_5;

public class Categorias {
	private int id;
	private String nombre;
	private String genero;
	static int IdIni = 0;
	
	public int devuelveProximoId() {
		return IdIni+1;
	}
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Categorias() {}
	
	public Categorias(int id, String nombre) {
		super();
		this.id = devuelveProximoId();
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		return id + " - " + nombre + " - " + genero;
	}

}
