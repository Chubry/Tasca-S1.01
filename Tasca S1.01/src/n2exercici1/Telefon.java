package n2exercici1;

public class Telefon {
	private String marca;
	private String modelo;
	
	public Telefon(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void llamar(String numTel) {
		System.out.println("Se esta llamando al numero "+numTel);
	}

	@Override
	public String toString() {
		return "Telefon [marca=" + marca + ", modelo=" + modelo + "]";
	}
	

}
