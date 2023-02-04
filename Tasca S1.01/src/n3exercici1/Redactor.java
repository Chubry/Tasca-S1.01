package n3exercici1;

import java.util.ArrayList;

public class Redactor {
	private String nombre;
	private final String DNI;
	private int sueldo = 1500;
	private ArrayList<Noticia> noticias;
	
	public Redactor(String nombre, String DNI) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.noticias = new ArrayList<Noticia>();
	}

	public ArrayList<Noticia> getNoticias() {
		return noticias;
	}

	public void setNoticias(ArrayList<Noticia> noticias) {
		this.noticias = noticias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}
	
	public void incrementarSueldo(int incremento) {
		this.sueldo += incremento;
	}
	
}
