package gestorAplicacion.paquete2;

import java.io.Serializable;
import java.util.Date;

public class Multa implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idMulta; // Identificador único de la multa
    private String tipo; // Tipo de la multa (por ejemplo, "Retraso en la devolución")
    private Date fechaImpuesta; // Fecha en la que se impuso la multa
    private Usuario usuario; // Usuario al que se impuso la multa

    // Constructor de la clase Multa
    public Multa(int idMulta, String tipo, Date fechaImpuesta, Usuario usuario) {
        this.idMulta = idMulta;
        this.tipo = tipo;
        this.fechaImpuesta = fechaImpuesta;
        this.usuario = usuario;
    }

    // Método para obtener el identificador único de la multa
    public int getIdMulta() {
        return idMulta;
    }

    // Método para obtener el tipo de la multa
    public String getTipo() {
        return tipo;
    }

    // Método para establecer el tipo de la multa
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método para obtener la fecha en la que se impuso la multa
    public Date getFechaImpuesta() {
        return fechaImpuesta;
    }

    // Método para obtener el usuario al que se impuso la multa
    public Usuario getUsuario() {
        return usuario;
    }

    // Método para pagar la multa
    public void pagarMulta() {
        // Lógica para registrar el pago de la multa
        // Esto podría incluir la actualización de la base de datos de multas y la eliminación de la multa del registro del usuario

        // Notificar al usuario sobre el pago exitoso de la multa
        System.out.println("La multa de tipo '" + tipo + "' con ID " + idMulta + " ha sido pagada.");

        // Eliminar la multa del registro del usuario
        usuario.eliminarMulta(this);
    }

}