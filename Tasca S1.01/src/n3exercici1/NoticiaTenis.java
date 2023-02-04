package n3exercici1;

public class NoticiaTenis extends Noticia{
	private String refTenisista;
	private String refCompeticion;
	private int puntos = 4;
	private int precio = 150;
	
	public NoticiaTenis(String titular) {
		super(titular);
	}
	public String getRefTenisista() {
		return refTenisista;
	}
	public void setRefTenisista(String refTenisista) {
		this.refTenisista = refTenisista;
	}
	public String getRefCompeticion() {
		return refCompeticion;
	}
	public void setRefCompeticion(String refCompeticion) {
		this.refCompeticion = refCompeticion;
	}
	@Override
	public void calcPuntos() {
		if(refTenisista.equalsIgnoreCase("Federer") || refTenisista.equalsIgnoreCase("Nadal") || refTenisista.equalsIgnoreCase("Djokovic")) {
			puntos +=3;
		}
		System.out.println("La puntuacion de la noticia es de "+puntos+" puntos");
	}
	@Override
	public void calcPrecio() {
		if(refTenisista.equalsIgnoreCase("Federer") || refTenisista.equalsIgnoreCase("Nadal") || refTenisista.equalsIgnoreCase("Djokovic")) {
			precio += 100;
		}
		System.out.println("El precio de la noticia es de "+precio+" euros");
	}
	
}
