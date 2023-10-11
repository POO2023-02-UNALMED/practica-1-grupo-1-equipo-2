package gestorAplicacion.paquete2;

import gestorAplicacion.paquete1.Libro;

public class Autor {
	private String nombre;
	private Libro[] obras;
	
	// Metodos get
    public String getNombre() {
        return nombre;
    }

    public Libro[] getObras() {
        return obras;
    }

    // Metodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObras(Libro[] obras) {
        this.obras = obras;
    }
}
