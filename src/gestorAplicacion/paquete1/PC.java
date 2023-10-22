package gestorAplicacion.paquete1;
import java.io.Serializable;

public class PC extends Computador implements Serializable{
    private Computador modelo; // El modelo de computador al que pertenece esta PC
    private boolean estado; // Indica si la PC está disponible o no
    private Biblioteca sede; // La sede a la que está asignada esta PC

    // Constructor de la clase PC
    public PC(Computador modelo, boolean estado, Biblioteca sede) {
    	super(modelo.getNombre(),modelo.getIdRecurso(),modelo.getMarca(),modelo.getGama());
        this.modelo = modelo;
        this.estado = estado;
        this.sede = sede;
    }

    // Método para obtener el modelo de computador al que pertenece esta PC
    public Computador getModelo() {
        return modelo;
    }

    // Método para establecer el modelo de computador al que pertenece esta PC
    public void setModelo(Computador modelo) {
        this.modelo = modelo;
    }

    // Método para verificar si la PC está disponible o no
    public boolean isEstado() {
        return estado;
    }

    // Método para establecer el estado de la PC
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Método para obtener la sede a la que está asignada esta PC
    public Biblioteca getSede() {
        return sede;
    }

    // Método para establecer la sede a la que está asignada esta PC
    public void setSede(Biblioteca sede) {
        this.sede = sede;
    }
}
