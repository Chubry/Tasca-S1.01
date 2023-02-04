package n3exercici1;

public class NoticiaMoto extends Noticia{
	private String refEquipo;
	private int puntos = 3;
	private int precio = 100;
	
	public NoticiaMoto(String titular) {
		super(titular);
	}

	public String getRefEquipo() {
		return refEquipo;
	}

	public void setRefEquipo(String refEquipo) {
		this.refEquipo = refEquipo;
	}

	@Override
	public void calcPuntos() {
		if(refEquipo.equalsIgnoreCase("Honda") || refEquipo.equalsIgnoreCase("Yamaha")) {
			puntos += 3;
		}
		System.out.println("La puntuacion de la noticia es de "+puntos+" puntos");	
	}

	@Override
	public void calcPrecio() {
		if(refEquipo.equalsIgnoreCase("Honda") || refEquipo.equalsIgnoreCase("Yamaha")) {
			precio += 50;
		}
		System.out.println("La puntuacion de la noticia es de "+puntos+" puntos");	
	}
	
	

}
