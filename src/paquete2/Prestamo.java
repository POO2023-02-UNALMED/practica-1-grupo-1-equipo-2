package paquete2;

import java.util.Date;
import java.time.LocalTime;
import paquete1.Computador;
import paquete1.Copia;

public class Prestamo {
	private String tipo;
    private String id;
    private Usuario usuario;
    private Copia libro;
    private Date fechaInicio;
    private Date fechaFinal;
    private Computador equipo;
    private LocalTime hora;
}
