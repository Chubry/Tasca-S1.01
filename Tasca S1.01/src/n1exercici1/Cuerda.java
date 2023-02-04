package n1exercici1;

public class Cuerda extends Instrumento{

	public Cuerda(String nombre, int precio) {
		super(nombre, precio);
	}
	
	public void tocar() {
		System.out.println("Esta sonando un instrumento de cuerda");
	}
	

}
