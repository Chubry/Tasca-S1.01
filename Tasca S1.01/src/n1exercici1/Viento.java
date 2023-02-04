package n1exercici1;

public class Viento extends Instrumento {

	public Viento(String nombre, int precio) {
		super(nombre, precio);
	}
	public void tocar() {
		System.out.println("Esta sonando un instrumento de viento");
	}

}
