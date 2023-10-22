package uiMain;
import gestorAplicacion.paquete1.*;
import gestorAplicacion.paquete2.*;
import java.util.Scanner;

import baseDatos.Deserializador;
import baseDatos.Serializador;

import java.util.*;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static Sistema sistema = new Sistema();
	static Usuario user = new Usuario("Usuario Prueba", "prueba@gmail.com", 1111, 0000);
	
	public static void main(String[] args) {
		byte opcion;
		byte op;
		boolean enSesion = false;	
		
		while (enSesion == false) {
			
			System.out.println("Bienvenido al sistema de biliotecas de nuestra institución");
			System.out.println("----------------------------------------------------------");
			System.out.println("Por favor, ingrese su usuario o si desea ingresar como invitado: ");
			System.out.println("1. Ingresar usuario");
			System.out.println("2. Crear usuario");
			System.out.println("3. Ingresar como invitado");
			System.out.println("----------------------------------------------------------");
			System.out.println("Elije la opcion que quieras realizar");
			opcion = sc.nextByte(); 
			switch(opcion) {
			case 1:
				sesionInvitado();
				enSesion = true;
				break;
			default: 
				System.out.println("Por favor, seleccione una opcion correcta");
			}
		}	
		
		do {
			System.out.println("Sesion iniciada correctamente \nPor favor seleccione la opcion que desee");
			System.out.println("----------------------------------------------------------");
			System.out.println("1. Consulta de disponibilidad de libro o computador");
			System.out.println("2. Agregar libro o computador a la base de datos");
			System.out.println("3. Consulta de disponibilidad y reserva de recursos para eventos");
			System.out.println("4. Regresar computadores y/o libros en préstamo");
			System.out.println("5. Gestión de Multas");
			System.out.println("6. Salir del sistema");
			System.out.println("----------------------------------------------------------");
			op = sc.nextByte();
			
			switch(op) {
			case 1:
				pedirComputadorOLibro();
				break;
			case 2:
				AgregarOEliminar();
				break;
			case 3:
				recursoEvento();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6: 
				salirDelSistema(sistema);
				break;
			default:
				System.out.println("Opcion incorrecta, por favor, escoge otra opcion");
			}		
		}
		while (op != 5);
	}
	
	
	private static void pedirComputadorOLibro() {
		int op1;
		System.out.println("Ingresa el recurso del cual deseas consultar disponibilidad");
		System.out.println("0. Libro \n1. Computador");
		op1 = sc.nextByte();
		switch (op1) {
		case 0: 
			System.out.println("Ingrese el nombre del libro que desees consultar: ");
			sc.nextLine();
			String nombre = sc.nextLine();
			Copia copia = null;
			for (Libro l : sistema.getLibros()) {
				if (l.getNombre().equalsIgnoreCase(nombre)) {	
					System.out.println("Libro encontrado");
					System.out.println("El libro: " + "'" + l.getNombre() + "'" + " Se encuentra disponible en las siguientes sedes: ");
					ArrayList<Biblioteca> sedes = new ArrayList<Biblioteca>();
					for (Biblioteca b : sistema.getBibliotecas()) { 
						if (b.hayCopia(nombre, "Particular")) {
							System.out.println(sistema.getBibliotecas().indexOf(b) + ". " + b.getSede());
							sedes.add(b);
						}
					}
				}
			}
			System.out.println("Seleccione la sede de su preferencia para realizar el prestamo: ");
			byte op = sc.nextByte();
			copia = sistema.getBibliotecas().get(op).hallarcopiaPorNombre(nombre);
			sistema.getBibliotecas().get(op).remover(copia);
			System.out.println("Ingrese el dia hasta el cual desea hacer el prestamo: ");
			int dia = sc.nextInt();
			System.out.println("Ingrese el mes hasta el cual desea hacer el prestamo: ");
			int mes = sc.nextInt();
			
			//Date fecha = new Date(2023,mes,dia);
			//Prestamo prestamo = new Prestamo(user,"Prestamo de libro", fecha, fecha, copia);
			//user.añadirPrestamo(prestamo);
			//System.out.println("¡El prestamo se ha realizado con exito!");
			//System.out.println("Por favor regresa tu libro ;)");
				
			case 1: 
			System.out.println("Ingrese el modelo del computador que desea consultar: ");
			sc.nextLine();
			String modelo = sc.nextLine();
			PC pc = null;
			for (Computador c : sistema.getComputadores()) {
				if (c.getNombre().equalsIgnoreCase(modelo)) {    
			          System.out.println("Computador encontrado");
			          System.out.println("El computador: " + "'" + c.getNombre() + "'" + " Se encuentra disponible en las siguientes sedes: ");
			          ArrayList<Biblioteca> sedes = new ArrayList<Biblioteca>();
				            for (Biblioteca b : sistema.getBibliotecas()) { 
				                if (b.hallarpcPorNombre(modelo) instanceof PC) {
				                    System.out.println(sistema.getBibliotecas().indexOf(b) + ". " + b.getSede());
				                    sedes.add(b);
				                }
				            }
				        }
				    }
			System.out.println("Seleccione la sede de su preferencia para realizar el prestamo: ");
			byte op2 = sc.nextByte();
			pc = sistema.getBibliotecas().get(op2).hallarpcPorNombre(modelo);
			sistema.getBibliotecas().get(op2).remover(pc);
			System.out.println("¡El prestamo se ha realizado con exito!");
			System.out.println("Por favor regresa tu computador ;)");
			break;
					
				default:
					System.out.println("Ingrese una opción correcta");
		}
					
		
				
			}
			
	
	private static void AgregarOEliminar() {
		String nombre;
		Biblioteca sede;
		Byte op;
		Autor autor;
		System.out.println("Seleccione la acción que desee realizar: \n0. Agregar libro\n1. Remover libro\n2. Agregar computador\n3. Remover computador");
		op = sc.nextByte();
		switch(op) {
		case 0:
			System.out.println("Para evitar temas de duplicados, por favor ingresa el codigo ISBN del libro que deseas agragar para comprobar que aun no se encuentra en nuestro sistema: ");
			sc.nextLine();
			String isbn = sc.nextLine();
			for (Libro l : sistema.getLibros()) {
				if (l.getIsbn().equalsIgnoreCase(isbn)) {
					System.out.println("El libro ya se encuentra en la base de datos de la biblioteca");
					return;
				}
			}
			System.out.println("El libro no se encuentra en la base de datos de la biblioteca");
			System.out.println("Ingrese el nombre del libro a registrar: ");
			sc.nextLine();
			nombre = sc.nextLine();
			System.out.println("Ingrese el año de publicacion: ");
			int año = sc.nextInt();
			System.out.println("Seleccione el autor del libro: ");
			for (int i = 0; i < sistema.getAutores().size(); i++) {
				System.out.println((i+1) + ". " + sistema.getAutores().get(i));
			}
			System.out.println("\n0. Crear autor");
			op = sc.nextByte();
			
			if (op == 0) {
				System.out.println("Ingrese el nombre del autor: ");
				sc.nextLine();
				String nombreAutor = sc.nextLine();
				System.out.println("Ingrese la nacionalidad del autor: ");
				sc.nextLine();
				String nacionalidad = sc.nextLine();
				System.out.println("Ingrese la corriente del autor: ");
				sc.nextLine();
				String corriente = sc.nextLine();
				
				autor = new Autor(nombreAutor, nacionalidad, corriente);
				
			}
			else {
				autor = sistema.getAutores().get(op);
			}
			
			Libro libroNuevo = new Libro(nombre, sistema.getLibros().size(), isbn, autor, año);
			sistema.getLibros().add(libroNuevo);
			System.out.println("¿A que sede deseas agregar las copias del libro?");
			for (Biblioteca b : sistema.getBibliotecas()) {
				System.out.println(sistema.getBibliotecas().indexOf(b) + ". " + b.getNombre());
			}
			sede = sistema.getBibliotecas().get(sc.nextInt());
			System.out.println("Cuantas copias de este libro deseas agregar");
			int num = sc.nextInt();
			for (int i = 0; i <= num; i++) {
				sede.añadirCopia(new Copia(sede.getCopias().size(), libroNuevo, sede));
			}
			System.out.println("¡Copias añadidas con exito!");

			break;
		case 1:
			System.out.println("Seleccione el libro que desea eliminar: ");
			for (Libro l : sistema.getLibros()) {
				System.out.println(sistema.getLibros().indexOf(l) + ". " + l.getNombre());
			}
			Libro aEliminar = sistema.getLibros().get(sc.nextInt());
			for(Biblioteca s : sistema.getBibliotecas()) {
				for(Copia copia : s.getCopias()) {
					if (copia.getNombre().equalsIgnoreCase(aEliminar.getNombre()) && s.getCopias().contains(aEliminar)) {
						s.getCopias().remove(copia);
					}
					
				}
			}
			sistema.getLibros().remove(aEliminar);
			break;
		case 2:
			System.out.println("Para evitar añadir un modelo duplicado, por favor ingrese el nombre del computador: ");
			sc.nextLine();
			nombre = sc.nextLine();
			for (Computador c : sistema.getComputadores()) {
				if (c.getNombre().equalsIgnoreCase(nombre)) {
					System.out.println("La biblioteca ya cuenta con este computador");
					return;
				}
			}
			System.out.println("Ingrese la marca del computador a registrar: ");
			sc.nextLine();
			String marca = sc.nextLine();
			System.out.println("Ingrese la gama del computador a registrar: ");
			sc.nextLine();
			String gama = sc.nextLine();
			System.out.println("Seleccione el autor del libro: ");
			
			
			Computador computadorNuevo = new Computador(nombre, sistema.getComputadores().size(), marca, gama);
			sistema.getComputadores().add(computadorNuevo);
			System.out.println("¿A que sede deseas agregar los PCs de este modelo?");
			for (Biblioteca b : sistema.getBibliotecas()) {
				System.out.println(sistema.getBibliotecas().indexOf(b) + ". " + b.getNombre());
			}
			sede = sistema.getBibliotecas().get(sc.nextInt());
			System.out.println("Cuantas copias de este libro deseas agregar");
			int num1 = sc.nextInt();
			for (int i = 0; i <= num1; i++) {
				sede.añadirPC(new PC(computadorNuevo, true, sede));
			}
			System.out.println("¡PCs añadidos con exito!");

			break;
			
		case 3:
			System.out.println("Seleccione la referencia del computador que desea eliminar: ");
			for (Computador c : sistema.getComputadores()) {
				System.out.println(sistema.getComputadores().indexOf(c) + ". " + c.getNombre());
			}
			Computador aEliminar1 = sistema.getComputadores().get(sc.nextInt());
			for(Biblioteca s : sistema.getBibliotecas()) {
				for(PC pc : s.getPCS()) {
					if (pc.getNombre().equalsIgnoreCase(aEliminar1.getNombre()) && s.getPCS().contains(aEliminar1)) {
						s.getPCS().remove(pc);
					}
					
				}
			}
			sistema.getComputadores().remove(aEliminar1);
			break;
			
		default :
			System.out.println("Opcion incorrecta");
			
		}
		
	}
	
	
	private static void recursoEvento() {
		Byte op;
		Byte op2 = 0;
		Date finicio;
		Date ffinal;
		Prestamo prestamo;
		System.out.println("Seleccione la sede en la cual se requiere hacer la reserva para evento: ");
		for (Biblioteca b : sistema.getBibliotecas()) {
			System.out.println(sistema.getBibliotecas().indexOf(b) + ". " + b.getNombre());
		}
		Biblioteca sede = sistema.getBibliotecas().get(sc.nextByte());
		System.out.println("Seleccione que tipo de evento desea reservar: ");
		System.out.println("0. Charla\n1. Presentacion\n2. Estudio");
		op = sc.nextByte();
		System.out.println("Seleccione la sala que desea reservar: ");
		for (int i = 0; i < sede.getSalas().size(); i++) {
			System.out.println(i + ". " + sede.getSalas().get(i).getNombre() + " / Con capacidad para: " + sede.getSalas().get(i).getCapacidad() + " personas" );
		}
		
		op2 = sc.nextByte();
		Evento evento = new Evento(op, sede, sede.getSalas().get(op2)); 
		System.out.println("¿Que recursos deseas reservar para el evento?");
		System.out.println("0. Libros\n1. Computadores");
		switch(sc.nextByte()) {
		
		case 0:
			System.out.println("Lista de libros disponibles para reserva de evento: ");
			for (int i = 0; i < sede.getCopias().size(); i++) {
				System.out.println(i + ". " + sede.getCopias().get(i).getNombre());
			}
			System.out.println("Por favor seleccione el libro a reservar para evento: ");
			op2 = sc.nextByte();
			finicio = new Date();
			ffinal = new Date(2023,12,12);
			prestamo = new Prestamo(user,"Evento",evento.getSala(),finicio,ffinal,sede.getCopias().get(op2), sede);
			sede.getPrestamos().add(prestamo);
			System.out.println("Reserva realizada con exito en sala: " + prestamo.getSala() + " con el siguiente material: ");
			prestamo.getCopiasPrestadas();
			
		case 1:
			System.out.println("Lista de computadores disponibles para evento: ");
			for (int i = 0; i < sede.getPCS().size(); i++) {
				System.out.println(i + ". " + sede.getPCS().get(i).getNombre());
			}
			System.out.println("Por favor seleccione el computador a reservar para evento: ");
			op2 = sc.nextByte();
			finicio = new Date();
			ffinal = new Date(2023,12,12);
			prestamo = new Prestamo(user,"Evento",evento.getSala(),finicio,ffinal,sede.getPCS().get(op2), sede);
			sede.getPrestamos().add(prestamo);
			System.out.println("Reserva realizada con exito en sala: " + prestamo.getSala() + " con el siguiente material: ");
			prestamo.getPcsPrestados();
		default:
			System.out.println("Material incorrecto");
		}
		
		
			
		}
		
	
	private static void regresarPrestamo() {}
	
	
	private static void gestionMultas() {}

	
	private static void sesionInvitado() {
		Usuario invitado = new Usuario("Invitado", "Sin correo", 0, 0);
			
	}
	
	
	static void salirDelSistema(Sistema sis) {
		System.out.println("Saliendo del sistema");
		Serializador.serializar(sis);
		System.exit(0);
	}
	
	
		
}