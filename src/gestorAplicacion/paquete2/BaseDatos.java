package gestorAplicacion.paquete2;
import gestorAplicacion.paquete1.*;

import java.io.Serializable;
import java.util.ArrayList;


public class BaseDatos implements Serializable {
    private static final long serialVersionUID = 1L;
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