package gestorAplicacion.paquete1;
import gestorAplicacion.paquete2.*;

import java.io.Serializable;
import java.util.*;
import java.util.ArrayList;

public class Biblioteca implements Serializable {
    private static final long serialVersionUID = 1L;
    // Atributos de la clase Biblioteca
    private String nombre;
    private String sede;
    private ArrayList<Sala> salas;
    private ArrayList<Libro> libros;
    private ArrayList<Copia> copias;
    private ArrayList<Computador> computadores;
    private ArrayList<PC> pcs;
    private ArrayList<Prestamo> prestamos;

    // Constructor de la clase Biblioteca
    public Biblioteca(String nombre, String sede) {
        this.nombre = nombre;
        this.sede = sede;
        this.salas = new ArrayList<>();
        this.libros = new ArrayList<>();
        this.computadores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.copias = new ArrayList<>();
        this.pcs = new ArrayList<PC>();
    }

    // Métodos para obtener y establecer el nombre de la biblioteca
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para obtener y establecer la sede de la biblioteca
    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    // Métodos para obtener y establecer la lista de libros de la biblioteca
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    // Métodos para obtener y establecer la lista de copias de la biblioteca
    public ArrayList<Copia> getCopias() {
        return copias;
    }

    public void setCopias(ArrayList<Copia> copias) {
        this.copias = copias;
    }

    // Métodos para obtener y establecer la lista de computadores de la biblioteca
    public ArrayList<Computador> getComputadores() {
        return computadores;
    }

    public void setComputadores(ArrayList<Computador> computadores) {
        this.computadores = computadores;
    }
    
    // Métodos para obtener y establecer la lista de pcs de la biblioteca
    public ArrayList<PC> getPCS() {
        return pcs;
    }

    public void setPCS(ArrayList<PC> pcs) {
        this.pcs = pcs;
    }

    // Métodos para obtener y establecer la lista de préstamos de la biblioteca
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    public void añadirSala(Sala sala) {
    	salas.add(sala);
    }
    public void añadirCopia(Copia copia) {
    	copias.add(copia);
    }
    public void añadirPC(PC pc) {
    	pcs.add(pc);
    }
    public ArrayList<Sala> getSalas() {
		return salas;
	}

    // Método para verificar si hay una copia disponible para un propósito específico
    public boolean hayCopia(String nombreLibro, String proposito) {
        for (Libro libro : libros) {
            if (libro.getNombre().equals(nombreLibro)) {
                for (Copia copia : libro.getCopias()) {
                    // Verificar la disponibilidad según el propósito
                    if (proposito.equals("Evento") && copia.isDisponibleEvento()) {
                        return true; // Hay una copia disponible para eventos
                    } else if (proposito.equals("Particular") && copia.isDisponibleParticular()) {
                        return true; // Hay una copia disponible para préstamos particulares
                    }
                }
            }
        }
        return false; // No se encontraron copias disponibles para el propósito específico
    }

	
	// Método para encontrar el estado de una copia por su ID
	//public String encontrar(int idCopia) {
        //for (Prestamo prestamo : prestamos) {
            // Verificar si la copia está en préstamo
            //for (Copia copia : prestamo.getCopiasPrestadas()) {
                //if (copia.getIdCopia() == idCopia) {
                    //return "A préstamo";
                //}
            //}
       //}

        // Si no se encontró en los préstamos, se asume que está en la biblioteca
        //return "En biblioteca";
    //}
	
	public Copia hallarcopiaPorNombre(String nombre) {
		for (Copia c : copias) {
			if (c.getNombre().equalsIgnoreCase(nombre)) {
				return c;
			}

			}

		return null;
		}
	public PC hallarpcPorNombre(String nombre) {
		for (PC p : pcs) {
			if (p.getNombre().equalsIgnoreCase(nombre)) {
				return p;
			}
			
		}
		return null;
	}
	
	
	public void remover(Copia copia) {
		copias.remove(copia);
	}
	
	public void remover(PC pc) {
		pcs.remove(pc);
	}
}