package n1exercici2;

public class Coche {
	private static final String marca = "Mercedes";
	private static String modelo;
	private final int potencia;
	
	public Coche(int potencia) {
		this.potencia = potencia;
	}

	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public static void frenar() {
		System.out.println("El vehiculo esta frenando");
	}
	
	public void accelerar() {
		System.out.println("El vehiulo esta accelerando");
	}
	
}
