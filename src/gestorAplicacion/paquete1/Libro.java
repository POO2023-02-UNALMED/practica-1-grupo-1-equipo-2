package gestorAplicacion.paquete1;
import gestorAplicacion.paquete2.Autor;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int año;
	private int copias;
	
	public Libro() {
		
	}
	
	public Libro(String isbn, String titulo, String autor, int año, int copias) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
		this.copias = copias;
		
	}
	
	// Metodos get
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAño() {
        return año;
    }

    /*
    public Copia[] getCopias() {
        return copias;
    }
    */

    // Metodos set
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setAño(int año) {
        this.año = año;
    }

    /*
    public void setCopias(Copia[] copias) {
        this.copias = copias;
    }
    */
    
    public void setAutor(String autor) {
		this.autor = autor;
	}
    
}
