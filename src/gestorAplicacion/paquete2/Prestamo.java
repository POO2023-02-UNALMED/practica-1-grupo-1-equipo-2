package gestorAplicacion.paquete2;
import gestorAplicacion.paquete1.*;

import java.util.Date;
import java.time.LocalTime;
import gestorAplicacion.paquete1.Computador;
import gestorAplicacion.paquete1.Copia;

import java.util.ArrayList;
import java.util.Date;

public class Prestamo {
    private int idPrestamo; // Identificador único del préstamo
    private String tipo; // Tipo de préstamo (por ejemplo, "Evento" o "Particular")
    private Usuario usuario; // Usuario que realiza el préstamo
    private Date fechaInicio; // Fecha de inicio del préstamo
    private Date fechaFin; // Fecha de finalización del préstamo
    private ArrayList<Copia> copiasPrestadas; // Copias prestadas en el préstamo
    private ArrayList<PC> pcsPrestados; // Computadoras prestadas en el préstamo

    // Constructor de la clase Prestamo
    public Prestamo(Usuario usuario, String tipo, Date fechaInicio, Date fechaFin, ArrayList<Copia> copias, ArrayList<PC> pcs) {
        this.tipo = tipo;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.copiasPrestadas = copias;
        this.pcsPrestados = pcs;
        // Generar un identificador único para el préstamo (puedes implementar esta lógica)
        this.idPrestamo = generarIdentificadorUnico();
    }

    // Método para obtener el identificador único del préstamo
    public int getIdPrestamo() {
        return idPrestamo;
    }

    // Método para obtener el tipo de préstamo
    public String getTipo() {
        return tipo;
    }

    // Método para obtener el usuario que realiza el préstamo
    public Usuario getUsuario() {
        return usuario;
    }

    // Método para obtener la fecha de inicio del préstamo
    public Date getFechaInicio() {
        return fechaInicio;
    }

    // Método para obtener la fecha de finalización del préstamo
    public Date getFechaFin() {
        return fechaFin;
    }

    // Método para obtener las copias prestadas en el préstamo
    public ArrayList<Copia> getCopiasPrestadas() {
        return copiasPrestadas;
    }

    // Método para obtener las computadoras prestadas en el préstamo
    public ArrayList<PC> getPcsPrestados() {
        return pcsPrestados;
    }

    // Método para verificar si el préstamo contiene ciertos recursos
    public boolean contieneRecursos(ArrayList<Copia> copias, ArrayList<PC> pcs) {
        return copiasPrestadas.containsAll(copias) && pcsPrestados.containsAll(pcs);
    }

    // Método para finalizar el préstamo
    public void finalizarPrestamo() {
        // Lógica para finalizar el préstamo (puedes implementar esta lógica)
        // Esto podría incluir la actualización de la disponibilidad de las copias y las PCs prestadas
    }

    // Método para generar un identificador único para el préstamo (puedes implementar esta lógica)
    private int generarIdentificadorUnico() {
        // Implementa la lógica para generar identificadores únicos de préstamo
        return 0; // Debes ajustar esto según tu implementación
    }
}
