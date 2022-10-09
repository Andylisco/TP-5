package TP_5;

public class Categorias {
	private int id;
	private String nombre1;
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
		this.nombre1 = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre1;
	}
	public void setNombre(String nombre) {
		this.nombre1 = nombre;
	}


	private int ID;
	private String nombre;
	
	
	@Override
	public String toString() {
		return ID + " - " + nombre1;
	}

}
