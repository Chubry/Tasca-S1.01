package n1exercici2;

public class N1exercici2 {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche(115);
		Coche.setModelo("SL");
		
		Coche.frenar();
		coche1.accelerar();

	}

}
