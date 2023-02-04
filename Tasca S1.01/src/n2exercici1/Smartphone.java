package n2exercici1;

public class Smartphone extends Telefon implements Camara, Reloj{

	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
		
	}
	public void fotografiar() {
		System.out.println("Se esta tomando una foto");
	}
	public void alarma() {
		System.out.println("Esta sonando la alarma");
	}

}
