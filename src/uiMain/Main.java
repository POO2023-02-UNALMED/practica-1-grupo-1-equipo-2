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
	static {
		libros.add(new Libro("978-0-307-58973-2", "Sapiens: De animales a dioses", "Yuval Noah Harari", 2014, 920));
		libros.add(new Libro("978-0-7475-3269-6", "Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, 1000));
		libros.add(new Libro("978-84-204-3471-6", "Cien años de soledad", "Gabriel García Márquez", 1967, 800));
		libros.add(new Libro("978-3-16-148410-0", "1984", "George Orwell", 1949, 900));
		libros.add(new Libro("978-0-553-21311-6", "Matar a un ruiseñor", "Harper Lee", 1960, 750));
		libros.add(new Libro("978-1-84749-593-7", "Ensayo sobre la ceguera", "José Saramago", 1995, 700));
		libros.add(new Libro("978-1-933633-92-9", "Los hombres me explican cosas", "Rebecca Solnit", 2014, 600));
		libros.add(new Libro("978-84-204-9184-8", "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, 950));
		libros.add(new Libro("978-0-06-112008-4", "El juego de ender", "Orson Scott Card", 1985, 720));
		libros.add(new Libro("978-84-339-7049-4", "Crónica de una muerte anunciada", "Gabriel García Márquez", 1981, 680));
		libros.add(new Libro("978-84-3760494-7", "Rayuela", "Julio Cortázar", 1963, 850));
		libros.add(new Libro("978-0-8129-7449-8", "El gran Gatsby", "F. Scott Fitzgerald", 1925, 500));
		libros.add(new Libro("978-0-014-303995-9", "Sapiens: De animales a dioses", "Yuval Noah Harari", 2011, 920));
		libros.add(new Libro("978-84-204-5298-7", "El amor en los tiempos del cólera", "Gabriel García Márquez", 1985, 720));
		libros.add(new Libro("978-0-525-43396-9", "To Kill a Mockingbird", "Harper Lee", 1960, 780));
		bibliotecas.add(new Biblioteca("Efe Gomez", "Medellin"));
		bibliotecas.add(new Biblioteca("Gabriel Garcia Marquez", "Bogota"));
		bibliotecas.get(0).agregarCopia(new Copia(libros.get(0), "Medellin"));
		bibliotecas.get(0).agregarCopia(new Copia(libros.get(1), "Medellin"));
		bibliotecas.get(0).agregarCopia(new Copia(libros.get(2), "Medellin"));
		bibliotecas.get(0).agregarCopia(new Copia(libros.get(3), "Medellin"));
		bibliotecas.get(0).agregarCopia(new Copia(libros.get(4), "Medellin"));
		bibliotecas.get(0).agregarCopia(new Copia(libros.get(5), "Medellin"));
		bibliotecas.get(0).agregarCopia(new Copia(libros.get(6), "Medellin"));
		bibliotecas.get(0).agregarCopia(new Copia(libros.get(7), "Medellin"));
		bibliotecas.get(1).agregarCopia(new Copia(libros.get(8), "Medellin"));
		bibliotecas.get(0).agregarCopia(new Copia(libros.get(8), "Bogota"));
		bibliotecas.get(1).agregarCopia(new Copia(libros.get(9), "Bogota"));
		bibliotecas.get(1).agregarCopia(new Copia(libros.get(10), "Bogota"));
		bibliotecas.get(1).agregarCopia(new Copia(libros.get(11), "Bogota"));
		bibliotecas.get(1).agregarCopia(new Copia(libros.get(12), "Bogota"));
		bibliotecas.get(1).agregarCopia(new Copia(libros.get(13), "Bogota"));
		bibliotecas.get(1).agregarCopia(new Copia(libros.get(14), "Bogota"));
	}
	
	
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
			user.mostrarPrestamos();
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
	
	
	private static void pedirLibro() {
		System.out.println("Ingrese el nombre del libro que desees consultar: ");
		sc.nextLine();
		String nombre = sc.nextLine();
		Copia copia = null;
		int cont = 0;
		for (Libro l : libros) {
			if (l.getTitulo().equalsIgnoreCase(nombre)) {	
				System.out.println("Libro encontrado");
				System.out.println("El libro: " + "'" + l.getTitulo() + "'" + " Se encuentra disponible en las siguientes sedes: ");
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