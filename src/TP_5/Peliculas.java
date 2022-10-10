package TP_5;

public class Peliculas implements Comparable<Peliculas> {
	private static int contador= 1;
	private final int id=contador;
	private String nombre;
	private String Genero;
	
	public Peliculas()
	{
		contador++;
		
	}
	

	public Peliculas(String nombre, String genero) {
		super();
		
		
		this.nombre = nombre;
		this.Genero = genero;
		contador++;
	}
	
	public static int getContador() {
		return contador ;
	}

	public static void setContador(int contador) {
		Peliculas.contador = contador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getGenero() {
		return Genero;
	}


	public void setGenero(String string) {
		Genero = string;
	}


	public String getId() {
		return Integer.toString(id);
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Genero: " + Genero;
	}


	@Override
	public int compareTo(Peliculas arg0) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(arg0.getNombre());
	}
	
	
	
	
	
}
