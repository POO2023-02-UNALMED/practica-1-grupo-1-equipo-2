package paquete2;
import paquete1.*;
import java.util.ArrayList;


public class BaseDatos {
	public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	public ArrayList<Libro> libros = new ArrayList<Libro>();
	
	
	

	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
		
	}
	
	public int IniciarSesion(String nombre, String correo) {
		int n = -1;
		for (Usuario s : usuarios) {
			if (s.getNombre().matches(nombre) && s.getCorreo().matches(correo)) {
				n = usuarios.indexOf(s);
				break;
			}
		}
		return n;
	}
	
	
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}
		
}
