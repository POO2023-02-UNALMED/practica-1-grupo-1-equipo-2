package uiMain;
import gestorAplicacion.paquete1.*;
import gestorAplicacion.paquete2.*;
import java.util.Scanner;
import java.util.*;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static BaseDatos baseDeDatos = new BaseDatos();
	static ArrayList<Libro> libros = new ArrayList<Libro>();	
	static ArrayList<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
	static ArrayList<Computador> computadores = new ArrayList<Computador>();
	static ArrayList<Autor> autores = new ArrayList<Autor>();
	static Usuario user = new Usuario("Usuario Prueba", "prueba@gmail.com", 1111, 0000);
	
	
	// Método para inicializar libros
    static void inicializarLibros() {
    	// Inicializar autores
        Autor autor1 = new Autor("Yuval Noah Harari", "Israel", "Historia");
        Autor autor2 = new Autor("J.K. Rowling", "Reino Unido", "Fantasía");
        Autor autor3 = new Autor("Harper Lee", "Estados Unidos", "Ficción");
        Autor autor4 = new Autor("José Saramago", "Portugal", "Realismo mágico");
        Autor autor5 = new Autor("Rebecca Solnit", "Estados Unidos", "Ensayo");
        Autor autor6 = new Autor("Miguel de Cervantes", "España", "Ficción");
        Autor autor7 = new Autor("Orson Scott Card", "Estados Unidos", "Ciencia ficción");
        Autor autor8 = new Autor("Julio Cortázar", "Argentina", "Ficción");
        Autor autor9 = new Autor("F. Scott Fitzgerald", "Estados Unidos", "Ficción");
        Autor autor10 = new Autor("Yuval Noah Harari", "Israel", "Ensayo");
        Autor autor11 = new Autor("Gabriel García Márquez", "Colombia", "Realismo mágico");
        Autor autor12 = new Autor("George Orwell", "Reino Unido", "Distopía");
        
        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);
        autores.add(autor4);
        autores.add(autor5);
        autores.add(autor6);
        autores.add(autor7);
        autores.add(autor8);
        autores.add(autor9);
        autores.add(autor10);
        autores.add(autor11);
        autores.add(autor12);
        		
        
        // Inicializar libros
        libros.add(new Libro("Sapiens: De animales a dioses", 1, "978-0-307-58973-2", autor1, 2014));
        libros.add(new Libro("Harry Potter y la piedra filosofal", 2, "978-0-7475-3269-6", autor2, 1997));
        libros.add(new Libro("Cien años de soledad", 1, "978-84-204-3471-6", autor11, 1967));
        libros.add(new Libro("1984", 2, "978-3-16-148410-0", autor12, 1949));
        libros.add(new Libro("Cien años de soledad", 1, "978-84-204-3471-6", autor11, 1967));
        libros.add(new Libro("1984", 2, "978-3-16-148410-0", autor12, 1949));
        libros.add(new Libro("Matar a un ruiseñor", 3, "978-0-553-21311-6", autor3, 1960));
        libros.add(new Libro("Ensayo sobre la ceguera", 4, "978-1-84749-593-7", autor4, 1995));
        libros.add(new Libro("Los hombres me explican cosas", 5, "978-1-933633-92-9", autor5, 2014));
        libros.add(new Libro("Don Quijote de la Mancha", 6, "978-84-204-9184-8", autor6, 1605));
        libros.add(new Libro("El juego de ender", 7, "978-0-06-112008-4", autor7, 1985));
        libros.add(new Libro("Crónica de una muerte anunciada", 8, "978-84-339-7049-4", autor11, 1981));
        libros.add(new Libro("Rayuela", 9, "978-84-3760494-7", autor8, 1963));
        libros.add(new Libro("El gran Gatsby", 10, "978-0-8129-7449-8", autor9, 1925));
        libros.add(new Libro("Sapiens: De animales a dioses", 11, "978-0-014-303995-9", autor10, 2011));
        libros.add(new Libro("El amor en los tiempos del cólera", 12, "978-84-204-5298-7", autor11, 1985));
        libros.add(new Libro("To Kill a Mockingbird", 13, "978-0-525-43396-9", autor3, 1960));
        
        //inicializar computadores
        computadores.add(new Computador("Samsung JX", 0, "Samsung", "Alta"));
        computadores.add(new Computador("HP Pavilion", 1, "HP", "Media"));
        computadores.add(new Computador("Dell Inspiron", 2, "Dell", "Baja"));
        computadores.add(new Computador("Lenovo ThinkPad", 3, "Lenovo", "Alta"));
        computadores.add(new Computador("Asus VivoBook", 4, "Asus", "Media"));
        computadores.add(new Computador("Acer Aspire", 5, "Acer", "Baja"));

    }

    
    // Método para inicializar bibliotecas, salas, PCs y copias
    static void inicializarBibliotecas() {
    	// Inicializar bibliotecas
        bibliotecas.add(new Biblioteca("Efe Gomez", "Medellin"));
        bibliotecas.add(new Biblioteca("Gabriel Garcia Marquez", "Bogota"));
        
        //Inicializar salas en seme Medellin
        bibliotecas.get(0).añadirSala(new Sala(bibliotecas.get(0), "Auditorio 1", 25));
        bibliotecas.get(0).añadirSala(new Sala(bibliotecas.get(0), "Auditorio 2", 10));
        bibliotecas.get(1).añadirSala(new Sala(bibliotecas.get(1), "Auditorio 1", 10));
        bibliotecas.get(1).añadirSala(new Sala(bibliotecas.get(1), "Auditorio 2", 30));

        // Inicializar copias y asignarlas a bibliotecas
        
        //Añadir copias a sede Medellin
        bibliotecas.get(0).getCopias().add(new Copia(0,libros.get(0), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(1,libros.get(1), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(2,libros.get(2), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(3,libros.get(3), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(4,libros.get(4), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(5,libros.get(5), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(6,libros.get(6), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(7,libros.get(7), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(8,libros.get(8), bibliotecas.get(0)));
        //Añadir copias a sede Bogota
        bibliotecas.get(1).getCopias().add(new Copia(0,libros.get(8), bibliotecas.get(1)));
        bibliotecas.get(1).getCopias().add(new Copia(1,libros.get(9), bibliotecas.get(1)));
        bibliotecas.get(1).getCopias().add(new Copia(2,libros.get(10), bibliotecas.get(1)));
        bibliotecas.get(1).getCopias().add(new Copia(3,libros.get(11), bibliotecas.get(1)));
        bibliotecas.get(1).getCopias().add(new Copia(4,libros.get(12), bibliotecas.get(1)));
        bibliotecas.get(1).getCopias().add(new Copia(5,libros.get(13), bibliotecas.get(1)));
        bibliotecas.get(1).getCopias().add(new Copia(6,libros.get(14), bibliotecas.get(1)));
        bibliotecas.get(1).getCopias().add(new Copia(7,libros.get(15), bibliotecas.get(1)));
        
        //Añadir PCs a sede Medellin
        bibliotecas.get(0).getPCS().add(new PC(computadores.get(0), true, bibliotecas.get(0)));
        bibliotecas.get(0).getPCS().add(new PC(computadores.get(0), true, bibliotecas.get(0)));
        bibliotecas.get(0).getPCS().add(new PC(computadores.get(4), true, bibliotecas.get(0)));
        bibliotecas.get(0).getPCS().add(new PC(computadores.get(5), true, bibliotecas.get(0)));
        bibliotecas.get(0).getPCS().add(new PC(computadores.get(1), true, bibliotecas.get(0)));
        bibliotecas.get(0).getPCS().add(new PC(computadores.get(2), true, bibliotecas.get(0)));
        bibliotecas.get(0).getPCS().add(new PC(computadores.get(1), true, bibliotecas.get(0)));
        bibliotecas.get(0).getPCS().add(new PC(computadores.get(2), true, bibliotecas.get(0)));

        
        //Añadir PCs a sede Bogota
        bibliotecas.get(1).getPCS().add(new PC(computadores.get(5), true, bibliotecas.get(1)));
        bibliotecas.get(1).getPCS().add(new PC(computadores.get(3), true, bibliotecas.get(1)));
        bibliotecas.get(1).getPCS().add(new PC(computadores.get(0), true, bibliotecas.get(1)));
        bibliotecas.get(1).getPCS().add(new PC(computadores.get(2), true, bibliotecas.get(1)));
        bibliotecas.get(1).getPCS().add(new PC(computadores.get(4), true, bibliotecas.get(1)));
        bibliotecas.get(1).getPCS().add(new PC(computadores.get(3), true, bibliotecas.get(1)));
        bibliotecas.get(1).getPCS().add(new PC(computadores.get(5), true, bibliotecas.get(1)));
        bibliotecas.get(1).getPCS().add(new PC(computadores.get(0), true, bibliotecas.get(1)));

        
    }
    
    
	public static void main(String[] args) {
		inicializarLibros();
        inicializarBibliotecas();
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
				enSesion = iniciarSesion();
				break;
			case 2:
				registrarUsuario();
				break;
			case 3:
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
			default:
				System.out.println("Opcion incorrecta, por favor, escoge otra opcion");
			}		
		}
		while (op != 5);
	}
	
	
	// ACÁ HAY QUE MODIFICAR LA LÓGICA, PARA HACER LO DE LOS TIPOS DE PRÉSTAMO
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
			for (Libro l : libros) {
				if (l.getNombre().equalsIgnoreCase(nombre)) {	
					System.out.println("Libro encontrado");
					System.out.println("El libro: " + "'" + l.getNombre() + "'" + " Se encuentra disponible en las siguientes sedes: ");
					ArrayList<Biblioteca> sedes = new ArrayList<Biblioteca>();
					for (Biblioteca b : bibliotecas) { 
						if (b.hayCopia(nombre, "Particular")) {
							System.out.println(bibliotecas.indexOf(b) + ". " + b.getSede());
							sedes.add(b);
						}
					}
				}
			}
			System.out.println("Seleccione la sede de su preferencia para realizar el prestamo: ");
			byte op = sc.nextByte();
			copia = bibliotecas.get(op).hallarcopiaPorNombre(nombre);
			bibliotecas.get(op).remover(copia);
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
			for (Computador c : computadores) {
				if (c.getNombre().equalsIgnoreCase(modelo)) {    
			          System.out.println("Computador encontrado");
			          System.out.println("El computador: " + "'" + c.getNombre() + "'" + " Se encuentra disponible en las siguientes sedes: ");
			          ArrayList<Biblioteca> sedes = new ArrayList<Biblioteca>();
				            for (Biblioteca b : bibliotecas) { 
				                if (b.hallarpcPorNombre(modelo) instanceof PC) {
				                    System.out.println(bibliotecas.indexOf(b) + ". " + b.getSede());
				                    sedes.add(b);
				                }
				            }
				        }
				    }
			System.out.println("Seleccione la sede de su preferencia para realizar el prestamo: ");
			byte op2 = sc.nextByte();
			pc = bibliotecas.get(op2).hallarpcPorNombre(modelo);
			bibliotecas.get(op2).remover(pc);
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
			for (Libro l : libros) {
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
			for (int i = 0; i < autores.size(); i++) {
				System.out.println((i+1) + ". " + autores.get(i));
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
				autor = autores.get(op);
			}
			
			Libro libroNuevo = new Libro(nombre, libros.size(), isbn, autor, año);
			libros.add(libroNuevo);
			System.out.println("¿A que sede deseas agregar las copias del libro?");
			for (Biblioteca b : bibliotecas) {
				System.out.println(bibliotecas.indexOf(b) + ". " + b.getNombre());
			}
			sede = bibliotecas.get(sc.nextInt());
			System.out.println("Cuantas copias de este libro deseas agregar");
			int num = sc.nextInt();
			for (int i = 0; i <= num; i++) {
				sede.añadirCopia(new Copia(sede.getCopias().size(), libroNuevo, sede));
			}
			System.out.println("¡Copias añadidas con exito!");

			break;
		case 1:
			System.out.println("Seleccione el libro que desea eliminar: ");
			for (Libro l : libros) {
				System.out.println(libros.indexOf(l) + ". " + l.getNombre());
			}
			Libro aEliminar = libros.get(sc.nextInt());
			for(Biblioteca s : bibliotecas) {
				for(Copia copia : s.getCopias()) {
					if (copia.getNombre().equalsIgnoreCase(aEliminar.getNombre()) && s.getCopias().contains(aEliminar)) {
						s.getCopias().remove(copia);
					}
					
				}
			}
			libros.remove(aEliminar);
			break;
		case 2:
			System.out.println("Para evitar añadir un modelo duplicado, por favor ingrese el nombre del computador: ");
			sc.nextLine();
			nombre = sc.nextLine();
			for (Computador c : computadores) {
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
			
			
			Computador computadorNuevo = new Computador(nombre, computadores.size(), marca, gama);
			computadores.add(computadorNuevo);
			System.out.println("¿A que sede deseas agregar los PCs de este modelo?");
			for (Biblioteca b : bibliotecas) {
				System.out.println(bibliotecas.indexOf(b) + ". " + b.getNombre());
			}
			sede = bibliotecas.get(sc.nextInt());
			System.out.println("Cuantas copias de este libro deseas agregar");
			int num1 = sc.nextInt();
			for (int i = 0; i <= num1; i++) {
				sede.añadirPC(new PC(computadorNuevo, true, sede));
			}
			System.out.println("¡PCs añadidos con exito!");

			break;
			
		case 3:
			System.out.println("Seleccione la referencia del computador que desea eliminar: ");
			for (Computador c : computadores) {
				System.out.println(computadores.indexOf(c) + ". " + c.getNombre());
			}
			Computador aEliminar1 = computadores.get(sc.nextInt());
			for(Biblioteca s : bibliotecas) {
				for(PC pc : s.getPCS()) {
					if (pc.getNombre().equalsIgnoreCase(aEliminar1.getNombre()) && s.getPCS().contains(aEliminar1)) {
						s.getPCS().remove(pc);
					}
					
				}
			}
			computadores.remove(aEliminar1);
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
		for (Biblioteca b : bibliotecas) {
			System.out.println(bibliotecas.indexOf(b) + ". " + b.getNombre());
		}
		Biblioteca sede = bibliotecas.get(sc.nextByte());
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
		
	
	private static boolean iniciarSesion() {
		System.out.println("Por favor ingrese su usuario: ");
		String nombre = sc.next();
		System.out.println("Por favor ingrese su correo: ");
		String correo = sc.next();
		int n = baseDeDatos.IniciarSesion(nombre, correo);
		if (n != -1) {
			System.out.println("Bienvenido " + baseDeDatos.usuarios.get(n).getNombre());
			while (true) {
			System.out.println("Ingresa tu contraseña:  \n");
			int contraseña = sc.nextInt();
			if (contraseña == baseDeDatos.usuarios.get(n).getContraseña()) {
				System.out.println("Contraseña correcta");
				return true;
			}
			else {
				System.out.println("Contraseña incorrecta, intentalo de nuevo");
				
			}
			}
			
		}
		else {
			System.out.println("Usuario no existe");
			System.out.println("Redirigiendo al menu de inicio...");
			return false;
		}
			
	}
	
	
	private static void registrarUsuario() {
		System.out.println("Por favor ingrese su nombre: ");
		String nombre = sc.next();
		System.out.println("Por favor ingrese su correo electronico: ");
		String correo = sc.next();
		System.out.println("Por favor ingrese su cedula: ");
		int cedula = sc.nextInt();
		int contra1 = 1;
		int contra2 = 2;
		while (contra1 != contra2) {
			System.out.println("Por favor ingrese una contraseña numerica");
			contra1 = sc.nextInt();
			System.out.println("Por favor confirme su contraseña");
			contra2 = sc.nextInt();
			if (contra1 != contra2) {
				System.out.println("Las contraseñas no son las mismas");
		}
		}
		int contraseña = contra1;
		System.out.println("¡Usuario registrado con exito!"); 
		Usuario us = new Usuario(nombre,correo,cedula,contraseña);
		baseDeDatos.agregarUsuario(us);
		
			}

	
	private static void sesionInvitado() {
		Usuario invitado = new Usuario("Invitado", "Sin correo", 0, 0);
		
		
	}
	
		
}