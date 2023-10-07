package paquete2;

public class Usuario {
	private String correo;
	private String nombre;
	private int cedula;
	private String clave;
	//private Prestamo prestamo;
	//private Multa multa;
	
	// Metodos get
    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getClave() {
        return clave;
    }

    /*
    public Prestamo getPrestamo() {
        return prestamo;
    }

    public Multa getMulta() {
        return multa;
    }
    */

    // Metodos set
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    /*
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }
    */
}
