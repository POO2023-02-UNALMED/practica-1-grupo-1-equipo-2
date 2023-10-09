package app;
import paquete2.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	static Scanner sc = new Scanner(System.in);
	static BaseDatos baseDeDatos = new BaseDatos();
	
	public static void main(String[] args) {
		byte opcion;
		
		
		do {
			
			System.out.println("BIenvenido al sistema de biliotecas de nuestra institución");
			System.out.println("----------------------------------------------------------");
			System.out.println("Por favor, ingrese su usuario o si desea ingresar como invitado: ");
			System.out.println("1. Ingresar usuario");
			System.out.println("2. Crear usuario");
			System.out.println("3. Ingresar como invitado");
			System.out.println("----------------------------------------------------------");
			System.out.println("Elije la opcion que quieras realizar");
			opcion = sc.nextByte(); 
			System.out.println("1. Buscar libro");
			System.out.println("2. Prestar computador");
			System.out.println("3. ");
			switch(opcion) {
			case 1:
				iniciarSesion();
			
			case 2:
				baseDeDatos.agregarUsuario(registrarUsuario());
				break;
			case 3:
				//codigo
			default: 
				System.out.println("Por favor, seleccione una opcion correcta");
			
		}
			
		}
		while (opcion != 5);
		
		

}
	
	private static void buscarLibro(String nombre) {
		
		
	}
	
	private static void iniciarSesion() {
		System.out.println("Por favor ingrese su usuario: ");
		String nombre = sc.next();
		System.out.println("Por favor ingrese su contraseña: ");
		String contraseña = sc.next();
		
	}
	
	private static Usuario registrarUsuario() {
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
		return us;
		
		
			}



		
}