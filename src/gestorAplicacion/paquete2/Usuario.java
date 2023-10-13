package gestorAplicacion.paquete2;
import java.util.*;

public class Usuario {
	private String nombre;
	private String correo;
	private int cedula;
	private int contraseña;
	private ArrayList<Prestamo> prestamos;
	//private Multa multa;
	private static int contadorUsuarios;
	private int idUsuario;
	
	public Usuario(String nombre, String correo, int cedula, int contraseña) {
		this.nombre = nombre;
		this.correo = correo;
		this.cedula = cedula;
		this.contraseña = contraseña;
		contadorUsuarios++;
		idUsuario = contadorUsuarios;
		prestamos = new ArrayList<Prestamo>();
		
		
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

    public int getContraseña() {
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

    public void setContraseña(int contraseña) {
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
    
    public void añadirPrestamo(Prestamo prestamo) {
    	prestamos.add(prestamo);
    }
    
    public void mostrarPrestamos() {
    	if (prestamos.isEmpty()) {
    		System.out.println("No tienes libros prestados");
    	}
		for (Prestamo p : prestamos) {
			System.out.println("El libro " + p.getCopia().getTitulo() + " Debe devolverse el: " + p.getFechaFinal());
		}
	}
}
