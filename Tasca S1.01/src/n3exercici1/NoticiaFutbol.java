package n3exercici1;

public class NoticiaFutbol extends Noticia{
	private String refCompeticion;
	private String refClub;
	private String refJugador;
	private int puntos = 5;
	private int precio = 300;
	
	public NoticiaFutbol(String titular) {
		super(titular);
	}

	public String getRefCompeticion() {
		return refCompeticion;
	}

	public void setRefCompeticion(String refCompeticion) {
		this.refCompeticion = refCompeticion;
	}

	public String getRefClub() {
		return refClub;
	}

	public void setRefClub(String refClub) {
		this.refClub = refClub;
	}

	public String getRefJugador() {
		return refJugador;
	}

	public void setRefJugador(String refJugador) {
		this.refJugador = refJugador;
	}

	@Override
	public void calcPuntos() {
		if (refCompeticion.equalsIgnoreCase("Liga de Campeones")) {
			puntos += 3;
		}else if(refCompeticion.equalsIgnoreCase("Liga")) {
			puntos += 2;
		}
		if(refClub.equalsIgnoreCase("Barça") || refClub.equalsIgnoreCase("Madrid")) {
			puntos += 1;
		}
		if(refJugador.equalsIgnoreCase("Ferran Torres") || refJugador.equalsIgnoreCase("Benzema")) {
			puntos += 1;
		}
		System.out.println("La puntuacion de la noticia es de "+puntos+" puntos");
	}

	@Override
	public void calcPrecio() {
		if (refCompeticion.equalsIgnoreCase("Liga de Campeones")) {
			precio += 100;
		}
		if(refClub.equalsIgnoreCase("Barça") || refClub.equalsIgnoreCase("Madrid")) {
			precio += 100;
		}
		if(refJugador.equalsIgnoreCase("Ferran Torres") || refJugador.equalsIgnoreCase("Benzema")) {
			precio += 100;
		}
		System.out.println("El precio de la noticia es de "+precio+" euros");
	}
	
	

}
