package n3exercici1;

public abstract class Noticia {
	private String titular;
	private String texto;
	private int puntuacion;
	private int precio;
	
	public Noticia(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public int getPrecio() {
		return precio;
	}
	
	public abstract void calcPuntos();
	
	public abstract void calcPrecio();
	

}
