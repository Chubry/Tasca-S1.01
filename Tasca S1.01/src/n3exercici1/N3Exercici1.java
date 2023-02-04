package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class N3Exercici1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Redactor> redactores = new ArrayList<Redactor>();

		int opcion = 0;

		do {
			opcion = menu();

			switch (opcion) {
			case 1:
				altaRedactor(redactores);
				break;
			case 2:
				bajaRedactor(redactores);
				break;
			case 3:
				crearNoticia(redactores);
				break;
			case 4:
				eliminarNoticia(redactores);
				break;
			case 5:
				mostrarNoticia(redactores);
				break;
			case 6:
				calcPunt(redactores);
				break;
			case 7:
				calcPrecio(redactores);
				break;
			case 0:
				System.out.println("Gracias por utilizar nuestros servicios");
				break;
			}

		} while (opcion != 0);

	}

	public static Redactor buscarRedactor(ArrayList<Redactor> redactores, String DNI, String nombre) {
		Redactor redactor = null;
		int i = 0;
		int size = redactores.size();

		while (redactor == null && i < size) {
			if (DNI.equalsIgnoreCase(redactores.get(i).getDNI())
					&& nombre.equalsIgnoreCase(redactores.get(i).getNombre())) {
				redactor = redactores.get(i);
			}
		}
		return redactor;
	}

	public static void altaRedactor(ArrayList<Redactor> redactores) {
		System.out.println("Introduce el nombre completo");
		String nombre = sc.nextLine();
		System.out.println("Introduce el DNI");
		String DNI = sc.nextLine();

		Redactor redactor = buscarRedactor(redactores, DNI, nombre);

		if (redactor != null) {
			System.out.println("El redactor existe en nuestro sistema");
		} else {
			Redactor redactor1 = new Redactor(nombre, DNI);
			redactores.add(redactor1);
			System.out.println("El redactor " + nombre + " ha sido dado de alta en nuestro systema");
		}

	}

	public static void bajaRedactor(ArrayList<Redactor> redactores) {
		System.out.println("Introduce el nombre completo");
		String nombre = sc.nextLine();
		System.out.println("Introduce el DNI");
		String DNI = sc.nextLine();

		Redactor redactor = buscarRedactor(redactores, DNI, nombre);

		if (redactor == null) {
			System.out.println("El redactor no existe en nuestro sistema");
		} else {
			System.out.println("El redactor " + nombre + " ha sido dado de baja de nuestro sistema");
			redactores.remove(redactor);
		}

	}

	public static void crearNoticia(ArrayList<Redactor> redactores) {
		System.out.println("Introduce su nombre completo");
		String nombre = sc.nextLine();
		System.out.println("Introduce su DNI");
		String DNI = sc.nextLine();

		Redactor redactor = buscarRedactor(redactores, DNI, nombre);

		if (redactor == null) {
			System.out.println("Introduce los datos correctos");
		} else {
			System.out.println("Introduce el titular:");
			String titular = sc.nextLine();

			System.out.println("Que tipo de noticia quiere crear:");
			System.out.println("Opcion 1: Futbol");
			System.out.println("Opcion 2: Basquet");
			System.out.println("Opcion 3: Tenis");
			System.out.println("Opcion 4: F1");
			System.out.println("Opcion 5: Motociclismo");
			byte seleccion = sc.nextByte();
			sc.nextLine();

			switch (seleccion) {
			case 1:
				NoticiaFutbol noticia1 = new NoticiaFutbol(titular);

				System.out.println("A que competicion hace referencia");
				String competicionF = sc.nextLine();
				noticia1.setRefCompeticion(competicionF);

				System.out.println("A que club hace referencia");
				String clubF = sc.nextLine();
				noticia1.setRefClub(clubF);

				System.out.println("A que jugador hace referencia");
				String jugador = sc.nextLine();
				noticia1.setRefJugador(jugador);

				System.out.println("Añade el texto de la noticia");
				String textoF = sc.nextLine(); 
				noticia1.setTexto(textoF);
				
				redactor.getNoticias().add(noticia1);
				break;
			case 2:
				NoticiaBasquet noticia2 = new NoticiaBasquet(titular);
				
				System.out.println("A que competicion hace referencia");
				String competicionB = sc.nextLine();
				noticia2.setRefCompeticion(competicionB);

				System.out.println("A que club hace referencia");
				String club = sc.nextLine();
				noticia2.setRefClub(club);
				
				System.out.println("Añade el texto de la noticia");
				String textoB = sc.nextLine(); 
				noticia2.setTexto(textoB);
				
				redactor.getNoticias().add(noticia2);
				break;
			case 3:
				NoticiaTenis noticia3 = new NoticiaTenis(titular);
				
				System.out.println("A que competicion hace referencia");
				String competicionT = sc.nextLine();
				noticia3.setRefCompeticion(competicionT);
				
				System.out.println("A que tenisista hace referencia");
				String tenisista = sc.nextLine();
				noticia3.setRefTenisista(tenisista);
				
				System.out.println("Añade el texto de la noticia");
				String textoT = sc.nextLine(); 
				noticia3.setTexto(textoT);
				
				redactor.getNoticias().add(noticia3);
				break;
			case 4:
				NoticiaF1 noticia4 = new NoticiaF1(titular);
				
				System.out.println("A que escuderia hace referencia");
				String escuderia = sc.nextLine();
				noticia4.setRefEscuderia(escuderia);
				
				System.out.println("Añade el texto de la noticia");
				String textoF1 = sc.nextLine(); 
				noticia4.setTexto(textoF1);
				
				redactor.getNoticias().add(noticia4);
				break;
			case 5:
				NoticiaMoto noticia5 = new NoticiaMoto(titular);
				
				System.out.println(" A que equipo hace referencia");
				String equipo = sc.nextLine();
				noticia5.setRefEquipo(equipo);
				
				System.out.println("Añade el texto de la noticia");
				String textoM = sc.nextLine(); 
				noticia5.setTexto(textoM);
				
				redactor.getNoticias().add(noticia5);
				break;
			default:
				System.out.println("Por favor selecciona una opcion valida");

			}

		}
	}
	public static Noticia buscarNoticia(String titular, ArrayList<Noticia>noticias) {
		Noticia noticiaBuscada = null;
		int i = 0;
		int size = noticias.size();
		
		while(noticiaBuscada == null && i<size) {
			if(noticias.get(i).getTitular().equalsIgnoreCase(titular)) {
				noticiaBuscada = noticias.get(i);
			}
		}
		return noticiaBuscada;
	}
	public static void eliminarNoticia(ArrayList<Redactor>redactores) {
		System.out.println("Introduce su nombre completo");
		String nombre = sc.nextLine();
		System.out.println("Introduce su DNI");
		String DNI = sc.nextLine();

		Redactor redactor = buscarRedactor(redactores, DNI, nombre);

		if (redactor == null) {
			System.out.println("Introduce los datos correctos");
		} else {
			System.out.println("Introduce el titular:");
			String titular = sc.nextLine();
			
			ArrayList<Noticia>noticias = redactor.getNoticias();
			Noticia noticiaBuscada = buscarNoticia(titular, noticias);
			
			if(noticiaBuscada == null) {
				System.out.println("La noticia buscada no existe");
			}else {
				noticias.remove(noticiaBuscada);
				System.out.println("La noticia "+titular+" ha sido eliminada");
			}
		}		
	}
	public static void mostrarNoticia(ArrayList<Redactor>redactores) {
		System.out.println("Introduce su nombre completo");
		String nombre = sc.nextLine();
		System.out.println("Introduce su DNI");
		String DNI = sc.nextLine();

		Redactor redactor = buscarRedactor(redactores, DNI, nombre);

		if (redactor == null) {
			System.out.println("Introduce los datos correctos");
		} else {
		    ArrayList<Noticia>noticias = redactor.getNoticias();
		    
		    for(Noticia noticia : noticias) {
		    	System.out.println(noticia.getTitular());
		    	System.out.println(noticia.getTexto());
		    }
		}
	}
	public static void calcPunt(ArrayList<Redactor>redactores) {
		System.out.println("Introduce su nombre completo");
		String nombre = sc.nextLine();
		System.out.println("Introduce su DNI");
		String DNI = sc.nextLine();

		Redactor redactor = buscarRedactor(redactores, DNI, nombre);

		if (redactor == null) {
			System.out.println("Introduce los datos correctos");
		} else {
			System.out.println("Introduce el titular:");
			String titular = sc.nextLine();
			
			ArrayList<Noticia>noticias = redactor.getNoticias();
			Noticia noticiaBuscada = buscarNoticia(titular, noticias);
			
			if(noticiaBuscada == null) {
				System.out.println("La noticia buscada no existe");
			}else {
				noticiaBuscada.calcPuntos();
			}
		}
	}
	public static void calcPrecio(ArrayList<Redactor>redactores) {
		System.out.println("Introduce su nombre completo");
		String nombre = sc.nextLine();
		System.out.println("Introduce su DNI");
		String DNI = sc.nextLine();

		Redactor redactor = buscarRedactor(redactores, DNI, nombre);

		if (redactor == null) {
			System.out.println("Introduce los datos correctos");
		} else {
			System.out.println("Introduce el titular:");
			String titular = sc.nextLine();
			
			ArrayList<Noticia>noticias = redactor.getNoticias();
			Noticia noticiaBuscada = buscarNoticia(titular, noticias);
			
			if(noticiaBuscada == null) {
				System.out.println("La noticia buscada no existe");
			}else {
				noticiaBuscada.calcPrecio();
			}
		}
	}
	public static int menu() {
		byte opcion;
		final byte MIN = 0, MAX = 7;

		do {
			System.out.println("---MENU APLICACION DE REDACCION DEPORTIVA---");
			System.out.println("Opcion 1 - Introducir redactor");
			System.out.println("Opcion 2 - Eliminar redactor");
			System.out.println("Opcion 3 - Introducir noticia de un redactor");
			System.out.println("opcion 4 - Eliminar Noticia");
			System.out.println("opcion 5 - Mostrar todas las noticias de un redacor");
			System.out.println("Opcion 6 - Calcular puntuacion de una noticia");
			System.out.println("Opcion 7 - Calcualr precio de una noticia");
			System.out.println("opcion 0 - SALIR DE APLICACION");
			System.out.println("Elige una opcion:");
			opcion = sc.nextByte();
			sc.nextLine();

			if (opcion < MIN || opcion > MAX) {
				System.out.println("Elige una opcion valida");
			}
		} while (opcion < MIN || opcion > MAX);

		return opcion;
	}

}
