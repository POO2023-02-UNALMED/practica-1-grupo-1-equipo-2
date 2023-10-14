package gestorAplicacion.paquete2;

import java.util.ArrayList;
import gestorAplicacion.paquete1.*;

public class Admin extends Usuario {
    private String cargo; // Cargo del administrador
    private int idAdmin; // Identificador único del administrador
    private Biblioteca biblioteca; // Instancia de la biblioteca

    // Constructor de la clase Admin
    public Admin(String nombre, String correo, int cedula, int contraseña, String cargo, Biblioteca biblioteca) {
        super(nombre, correo, cedula, contraseña);
        this.cargo = cargo;
        this.biblioteca = biblioteca; // Inicializa la instancia de Biblioteca
    }


    // Método para obtener el cargo del administrador
    public String getCargo() {
        return cargo;
    }

    // Método para establecer el cargo del administrador
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método para obtener el identificador único del administrador
    public int getIdAdmin() {
        return idAdmin;
    }

 // Método para añadir un libro a la base de datos de la biblioteca
    public void añadirLibro(Libro libro) {
        // Verificar si el libro ya existe en la base de datos
        if (!biblioteca.getLibros().contains(libro)) {
            // El libro no existe, se puede agregar a la base de datos
            biblioteca.getLibros().add(libro);
            System.out.println("Libro añadido con éxito a la base de datos.");
        } else {
            System.out.println("El libro ya existe en la base de datos.");
        }
    }


    // Método para remover un libro de la base de datos de la biblioteca
    public void removerLibro(Libro libro) {
        // Lógica para remover un libro de la base de datos de la biblioteca
    }
    
    // Método para eliminar una multa de un usuario
    public void eliminarMulta(Usuario usuario, int idMulta) {
        // Obtener la lista de multas del usuario
        ArrayList<Multa> multasUsuario = usuario.getMultas();
        
        // Buscar la multa con el ID especificado
        Multa multaAEliminar = null;
        for (Multa multa : multasUsuario) {
            if (multa.getIdMulta() == idMulta) {
                multaAEliminar = multa;
                break;
            }
        }
        
        // Si se encontró la multa, eliminarla
        if (multaAEliminar != null) {
            multasUsuario.remove(multaAEliminar);
            System.out.println("Multa eliminada con éxito.");
        } else {
            System.out.println("No se encontró una multa con el ID especificado.");
        }
    }
}
