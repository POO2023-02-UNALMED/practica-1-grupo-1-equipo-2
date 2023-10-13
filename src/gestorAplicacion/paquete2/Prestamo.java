package gestorAplicacion.paquete2;

import java.util.Date;
import java.time.LocalTime;
import gestorAplicacion.paquete1.Computador;
import gestorAplicacion.paquete1.Copia;

public class Prestamo {
	private String tipo;
    private String id;
    private Usuario usuario;
    private Copia libro;
    private Date fechaInicio;
    private Date fechaFinal;
    private Computador equipo;
    private LocalTime hora;
    private Copia copia;
    
    public Prestamo(String tipo, Usuario usuario, Date fechaFinal, Copia copia) {
    	this.tipo = tipo;
    	this.usuario = usuario;
    	this.fechaFinal = fechaFinal;
    	this.copia = copia;
    }
    
    // Metodos get
    public String getTipo() {
        return tipo;
    }

    public String getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Copia getCopia() {
        return copia;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public Computador getEquipo() {
        return equipo;
    }

    public LocalTime getHora() {
        return hora;
    }

    // Metodos set
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setLibro(Copia libro) {
        this.libro = libro;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public void setEquipo(Computador equipo) {
        this.equipo = equipo;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
