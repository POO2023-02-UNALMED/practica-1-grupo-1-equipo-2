package gestorAplicacion.paquete2;
import gestorAplicacion.paquete1.*;
import java.util.Date;
import java.util.ArrayList;

public class Prestamo {
    private int idPrestamo; // Identificador único del préstamo
    private String tipo; // Tipo de préstamo (por ejemplo, "Evento" o "Particular")
    private Usuario usuario; // Usuario que realiza el préstamo
    private Sala sala; //sala que se presta (en caso de prestamo para evento)
    private Date fechaInicio; // Fecha de inicio del préstamo
    private Date fechaFin; // Fecha de finalización del préstamo
    private ArrayList<Copia> copiasPrestadas; // Copias prestadas en el préstamo
    private ArrayList<PC> pcsPrestados; // Computadoras prestadas en el préstamo

    // Constructor de prestamo de evento con libro
    public Prestamo(Usuario usuario, String tipo, Sala sala, Date fechaInicio, Date fechaFin, Copia copia, Biblioteca sede) {
        this.tipo = tipo;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.sala = sala;
        // Generar un identificador único para el préstamo (puedes implementar esta lógica)
        this.idPrestamo = generarIdentificadorUnico();
        copiasPrestadas = new ArrayList<Copia>();
        copiasPrestadas.add(copia);
        sede.getCopias().remove(copia);
        sede.getSalas().remove(sala);
    }
    public Prestamo(Usuario usuario, String tipo, Sala sala, Date fechaInicio, Date fechaFin, PC pc, Biblioteca sede) {
        this.tipo = tipo;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.sala = sala;
        // Generar un identificador único para el préstamo (puedes implementar esta lógica)
        this.idPrestamo = generarIdentificadorUnico();
        pcsPrestados = new ArrayList<PC>();
        pcsPrestados.add(pc);
        sede.getPCS().remove(pc);
        sede.getSalas().remove(sala);
    }
    
    //constructor de prestamo particular
    public Prestamo(Usuario usuario, String tipo, Date fechaInicio, Date fechaFin, Copia copia, Biblioteca sede) {
        this.tipo = tipo;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        // Generar un identificador único para el préstamo (puedes implementar esta lógica)
        this.idPrestamo = generarIdentificadorUnico();
        sede.getCopias().remove(copia);
    }

    // Método para obtener el identificador único del préstamo
    public int getIdPrestamo() {
        return idPrestamo;
    }
    
    public void setSala(Sala sala) {
		this.sala = sala;
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
    
    public Sala getSala() {
		return sala;
	}

    // Método para obtener las copias prestadas en el préstamo
    public void getCopiasPrestadas() {
        for (Copia c: copiasPrestadas) {
        	System.out.println("- " + c.getNombre());
        }
    }

    // Método para obtener las computadoras prestadas en el préstamo
    public void getPcsPrestados() {
    	for (PC p: pcsPrestados) {
        	System.out.println("- " + p.getNombre());
        }
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
