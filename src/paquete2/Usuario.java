package paquete2;

public class Usuario {
	private String nombre;
	private String correo;
	private int cedula;
	private int contraseña;
	//private Prestamo prestamo;
	//private Multa multa;
	
	public Usuario(String nombre, String correo, int cedula, int contraseña) {
		this.nombre = nombre;
		this.correo = correo;
		this.cedula = cedula;
		this.contraseña = contraseña;
		
	}
	
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

    public int getClave() {
        return contraseña;
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

    public void setClave(int contraseña) {
        this.contraseña = contraseña;
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
