package n3exercici1;

public class NoticiaF1 extends Noticia {
	private String refEscuderia;
	private int puntos = 4;
	private int precio = 100;

	public NoticiaF1(String titular) {
		super(titular);
	}

	public String getRefEscuderia() {
		return refEscuderia;
	}

	public void setRefEscuderia(String refEscuderia) {
		this.refEscuderia = refEscuderia;
	}

	@Override
	public void calcPuntos() {
		if(refEscuderia.equalsIgnoreCase("Ferrari") || refEscuderia.equalsIgnoreCase("Mercedes")) {
			puntos += 2;
		}
		System.out.println("La puntuacion de la noticia es de "+puntos+" puntos");
	}

	@Override
	public void calcPrecio() {
		if(refEscuderia.equalsIgnoreCase("Ferrari") || refEscuderia.equalsIgnoreCase("Mercedes")) {
			precio += 50;
		}
		System.out.println("El precio de la noticia es de "+precio+" euros");
	}
	
	

}
