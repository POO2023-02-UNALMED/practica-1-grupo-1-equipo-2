package gestorAplicacion.paquete2;

import java.util.Date;

public class Multa {
	private String id;
    private Usuario usuario;
    private Date fechaInicio;
    private Date fechaFinal;
    
 // Metodos get
    public String getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    // Metodos set
    public void setId(String id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
}
