package gestorAplicacion.paquete1;
import java.util.Date;

public interface Prestable {
    boolean isPrestado();
    Date getFechaDePrestamo();
    Date getFechaDeDevolucion();
    boolean estaAtrasado();
}


