package gestorAplicacion.paquete2;
import java.util.*;
import gestorAplicacion.paquete1.*;

import java.util.ArrayList;
import java.io.Serializable;

public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	public static final int prestamosMaximos = 3;
    private String nombre; // Nombre del usuario
    private String correo; // Correo electrónico del usuario
    private int cedula; // Número de cédula del usuario
    private int contraseña; // Contraseña del usuario
    private int idUsuario; // Identificador único del usuario
    private ArrayList<Prestamo> prestamos; // Lista de préstamos realizados por el usuario
    private ArrayList<Multa> multas; // Lista de multas impuestas al usuario
    private static int contadorUsuarios = 0; // Contador para asignar identificadores únicos

    // Constructor de la clase Usuario
    public Usuario(String nombre, String correo, int cedula, int contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.idUsuario = ++contadorUsuarios;
        this.prestamos = new ArrayList<>();
        this.multas = new ArrayList<>();
    }

    // Método para obtener el nombre del usuario
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre del usuario
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el correo electrónico del usuario
    public String getCorreo() {
        return correo;
    }

    // Método para establecer el correo electrónico del usuario
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método para obtener el número de cédula del usuario
    public int getCedula() {
        return cedula;
    }

    // Método para establecer el número de cédula del usuario
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    // Método para obtener la contraseña del usuario
    public int getContraseña() {
        return contraseña;
    }

    // Método para establecer la contraseña del usuario
    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    // Método para obtener el identificador único del usuario
    public int getIdUsuario() {
        return idUsuario;
    }

    // Método para obtener la lista de préstamos realizados por el usuario
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    // Método para establecer la lista de préstamos realizados por el usuario
    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    // Método para obtener la lista de multas impuestas al usuario
    public ArrayList<Multa> getMultas() {
        return multas;
    }

    // Método para establecer la lista de multas impuestas al usuario
    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }

    // Método para devolver recursos prestados
    public void devolverRecursos(ArrayList<Copia> copias, ArrayList<PC> pcs) {
        // Lógica para devolver recursos prestados
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getUsuario() == this && prestamo.contieneRecursos(copias, pcs)) {
                prestamo.finalizarPrestamo();
                prestamos.remove(prestamo);
                break; // Se asume un único préstamo coincidente a la vez
            }
        }
    }

    // Método para pagar una multa
    public void pagarMulta(Multa multa) {
        // Lógica para pagar una multa
        multas.remove(multa);
    }

    // Método para eliminar una multa del registro del usuario
    public void eliminarMulta(Multa multa) {
        // Lógica para eliminar una multa del registro del usuario
        multas.remove(multa);
    }
    
 // Método para obtener los préstamos vigentes del usuario con detalles
    public ArrayList<String> obtenerPrestamosVigentesConDetalles() {
        ArrayList<String> prestamosDetallados = new ArrayList<>();

        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Recorrer la lista de préstamos
        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo prestamo = prestamos.get(i);

            if (prestamo.getFechaFin().after(fechaActual)) {
                // El préstamo todavía está vigente
                String detallesPrestamo = "Tipo: " + prestamo.getTipo() + 
                                          ", Fecha de Inicio: " + prestamo.getFechaInicio() + 
                                          ", Fecha de Fin: " + prestamo.getFechaFin() +
                                          ", Items Prestados: ";

                // Agregar detalles de copias prestadas
                for (int j = 0; j < prestamo.getCopiasPrestadas().size(); j++) {
                    Copia copia = prestamo.getCopiasPrestadas().get(j);
                    detallesPrestamo += "Copia de " + copia.getCopiaDe().getNombre() + ", ";
                }

                // Agregar detalles de PCs prestadas
                for (int j = 0; j < prestamo.getPcsPrestados().size(); j++) {
                    PC pc = prestamo.getPcsPrestados().get(j);
                    detallesPrestamo += "PC " + pc.getModelo().getMarca() + ", ";
                }

                prestamosDetallados.add(detallesPrestamo);
            }
        }

        return prestamosDetallados;
    }
}
