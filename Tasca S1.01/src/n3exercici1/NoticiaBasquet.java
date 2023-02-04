package n3exercici1;

public class NoticiaBasquet extends Noticia {
	private String refCompeticion;
	private String refClub;
	private int puntos = 4;
	private int precio = 250;

	public NoticiaBasquet(String titular) {
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


	@Override
	public void calcPuntos() {
		if(refCompeticion.equalsIgnoreCase("Euroliga")) {
			puntos += 3;
		}else if(refCompeticion.equalsIgnoreCase("ACB")) {
			puntos += 2;
		}
		if(refClub.equalsIgnoreCase("Barça") || refClub.equalsIgnoreCase("Madrid")) {
			puntos+= 1;
		}
		System.out.println("La puntuacion de la noticia es de "+puntos+" puntos");
	}

	@Override
	public void calcPrecio() {
		if(refCompeticion.equalsIgnoreCase("Euroliga")) {
			precio += 75;
		}
		if(refClub.equalsIgnoreCase("Barça") || refClub.equalsIgnoreCase("Madrid")) {
			precio += 75;
		}
		System.out.println("El precio de la noticia es de "+precio+" euros");
	}
	

}
