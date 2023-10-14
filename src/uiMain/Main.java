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
	static Usuario user = new Usuario("Usuario Prueba", "prueba@gmail.com", 1111, 0000);
	
	// Método para inicializar libros
    static void inicializarLibros() {
    	// Inicializac autores
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
    }

    // Método para inicializar bibliotecas y copias
    static void inicializarBibliotecas() {
    	// Inicializar bibliotecas
        bibliotecas.add(new Biblioteca("Efe Gomez", "Medellin"));
        bibliotecas.add(new Biblioteca("Gabriel Garcia Marquez", "Bogota"));
        
        // Inicializar copias y asignarlas a bibliotecas
        bibliotecas.get(0).getCopias().add(new Copia(0,libros.get(0), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(1,libros.get(1), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(2,libros.get(2), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(3,libros.get(3), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(4,libros.get(4), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(5,libros.get(5), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(6,libros.get(6), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(7,libros.get(7), bibliotecas.get(0)));
        bibliotecas.get(0).getCopias().add(new Copia(8,libros.get(8), bibliotecas.get(0)));
	
        bibliotecas.get(0).getCopias().add(new Copia(9,libros.get(8), bibliotecas.get(1)));
        bibliotecas.get(0).getCopias().add(new Copia(10,libros.get(9), bibliotecas.get(1)));
        bibliotecas.get(0).getCopias().add(new Copia(11,libros.get(10), bibliotecas.get(1)));
        bibliotecas.get(0).getCopias().add(new Copia(12,libros.get(11), bibliotecas.get(1)));
        bibliotecas.get(0).getCopias().add(new Copia(13,libros.get(12), bibliotecas.get(1)));
        bibliotecas.get(0).getCopias().add(new Copia(14,libros.get(13), bibliotecas.get(1)));
        bibliotecas.get(0).getCopias().add(new Copia(15,libros.get(14), bibliotecas.get(1)));
        bibliotecas.get(0).getCopias().add(new Copia(16,libros.get(15), bibliotecas.get(1)));
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
			System.out.println("1. Consulta de disponibilidad y prestamo de libro");
			System.out.println("2. Consulta de disponibilidad y prestamo de computador");
			System.out.println("3. Consulta y pago de multas");
			System.out.println("4. Agregar o eliminar libro a la coleccion");
			System.out.println("5. Administrar perfil");
			System.out.println("----------------------------------------------------------");
			op = sc.nextByte();
			
			switch(op) {
			case 1:
				pedirLibro();
				user.obtenerPrestamosVigentesConDetalles();
				break;
			case 2:
				break;
			case 3:
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
	private static void pedirLibro() {
		System.out.println("Ingrese el nombre del libro que desees consultar: ");
		sc.nextLine();
		String nombre = sc.nextLine();
		Copia copia = null;
		int cont = 0;
		for (Libro l : libros) {
			if (l.getNombre().equalsIgnoreCase(nombre)) {	
				System.out.println("Libro encontrado");
				System.out.println("El libro: " + "'" + l.getNombre() + "'" + " Se encuentra disponible en las siguientes sedes: ");
				ArrayList<Biblioteca> sedes = new ArrayList<Biblioteca>();
				for (Biblioteca b : bibliotecas) { 
					if (b.hayCopia(nombre)) {
						System.out.println(bibliotecas.indexOf(b) + ". " + b.getSede());
						sedes.add(b);
					}
				}
				System.out.println("Seleccione la sede de su preferencia para realizar el prestamo ingresando el nombre: ");
				byte op = sc.nextByte();
				copia = bibliotecas.get(op).encontrar(nombre);
				bibliotecas.get(op).prestamo(copia);
				System.out.println("Ingrese el dia hasta el cual desea hacer el prestamo: ");
				int dia = sc.nextInt();
				System.out.println("Ingrese el mes hasta el cual desea hacer el prestamo: ");
				int mes = sc.nextInt();
				Date fecha = new Date(2023,mes,dia);
				Prestamo prestamo = new Prestamo("Prestamo de libro", user, fecha, copia);
				user.añadirPrestamo(prestamo);
				System.out.println("¡El prestamo se ha realizado con exito!");
				System.out.println("Por favor regresa tu libro ;)");

				
				
				

					
				}
				
			}
			

			
		}
		
	
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