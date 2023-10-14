package gestorAplicacion.paquete1;
import gestorAplicacion.paquete2.*;
import java.util.*;

import java.util.ArrayList;

public class Biblioteca {
    // Atributos de la clase Biblioteca
    private String nombre;
    private String sede;
    private ArrayList<Libro> libros;
    private ArrayList<Computador> computadores;
    private ArrayList<Prestamo> prestamos;

    // Constructor de la clase Biblioteca
    public Biblioteca(String nombre, String sede) {
        this.nombre = nombre;
        this.sede = sede;
        this.libros = new ArrayList<>();
        this.computadores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
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

    // Métodos para obtener y establecer la lista de computadores de la biblioteca
    public ArrayList<Computador> getComputadores() {
        return computadores;
    }

    public void setComputadores(ArrayList<Computador> computadores) {
        this.computadores = computadores;
    }

    // Métodos para obtener y establecer la lista de préstamos de la biblioteca
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
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
	public String encontrar(int idCopia) {
        for (Prestamo prestamo : prestamos) {
            // Verificar si la copia está en préstamo
            for (Copia copia : prestamo.getCopiasPrestadas()) {
                if (copia.getIdCopia() == idCopia) {
                    return "A préstamo";
                }
            }
        }

        // Si no se encontró en los préstamos, se asume que está en la biblioteca
        return "En biblioteca";
    }
}
