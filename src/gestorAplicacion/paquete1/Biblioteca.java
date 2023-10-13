package gestorAplicacion.paquete1;
import gestorAplicacion.paquete2.*;
import java.util.*;

public class Biblioteca {
	String nombre;
	String sede;
	public ArrayList<Copia> copias = new ArrayList<Copia>();
	ArrayList<Computador> computadores = new ArrayList<Computador>();
	ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

	public Biblioteca(String nombre, String sede) {
		this.nombre = nombre;
		this.sede = sede;
	}
	
	public void agregarCopia(Copia copia) {
		copias.add(copia);
			
		
	}
	
	
	public void setComputadores(ArrayList<Computador> computadores) {
		this.computadores = computadores;
	}
	public void setCopias(ArrayList<Copia> copias) {
		this.copias = copias;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getSede() {
		return sede;
	}
	public ArrayList<Computador> getComputadores() {
		return computadores;
	}
	public ArrayList<Copia> getCopias() {
		return copias;
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public boolean hayCopia(String nombre) {
		for (Copia c : copias) {
			if (c.getTitulo().equalsIgnoreCase(nombre)) {
				return true;
			}
		
			}
		
		return false;
		}
	
	public Copia encontrar(String nombre) {
		for (Copia c : copias) {
			if (c.getTitulo().equalsIgnoreCase(nombre)) {
				return c;
			}
		
			}
		
		return null;
		}
	
	public void prestamo(Copia copia) {
		copias.remove(copia);
	}
	}
	
