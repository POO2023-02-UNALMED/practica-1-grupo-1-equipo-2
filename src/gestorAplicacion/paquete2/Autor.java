package gestorAplicacion.paquete2;

import gestorAplicacion.paquete1.Libro;

public class Autor {
    private String nombre; // Nombre del autor
    private String nacionalidad; // Nacionalidad del autor
    private String corriente; // Corriente literaria del autor
    private Libro[] obras; // Array de obras escritas por el autor

    // Constructor de la clase Autor
    public Autor(String nombre, String nacionalidad, String corriente) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.corriente = corriente;
        this.obras = new Libro[10]; // Se asume un máximo de 10 obras por autor
    }

    // Método para obtener el nombre del autor
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre del autor
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la nacionalidad del autor
    public String getNacionalidad() {
        return nacionalidad;
    }

    // Método para establecer la nacionalidad del autor
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // Método para obtener la corriente literaria del autor
    public String getCorriente() {
        return corriente;
    }

    // Método para establecer la corriente literaria del autor
    public void setCorriente(String corriente) {
        this.corriente = corriente;
    }

    // Método para obtener la lista de obras escritas por el autor
    public Libro[] getObras() {
        return obras;
    }

    // Método para establecer la lista de obras escritas por el autor
    public void setObras(Libro[] obras) {
        this.obras = obras;
    }
}
