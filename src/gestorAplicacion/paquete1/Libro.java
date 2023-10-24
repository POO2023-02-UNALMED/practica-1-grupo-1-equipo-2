package gestorAplicacion.paquete1;
import gestorAplicacion.paquete2.Autor;

import java.util.ArrayList;
import java.io.Serializable;

public class Libro extends Recurso implements Serializable {
	private static final long serialVersionUID = 1L;
	static private int totalLibros;
    private String isbn;
    private Autor autor;
    private int año;
    private ArrayList<Copia> copias;

    // Constructor de la clase Libro
    public Libro(String nombre, int idRecurso, String isbn, Autor autor, int año) {
        super(nombre, idRecurso); // Llama al constructor de la clase base (Recurso)
        this.isbn = isbn;
        this.autor = autor;
        this.año = año;
        this.copias = new ArrayList<>();
        autor.getObras().add(this);
        totalLibros++;
    }
    
    public Libro() {
    	this("Libro sin nombre", 0, "",new Autor(),0);
    }
    

    // Métodos para obtener el ISBN del libro
    public String getIsbn() {
        return isbn;
    }

    // Métodos para establecer el ISBN del libro
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Métodos para obtener el autor del libro
    public Autor getAutor() {
        return autor;
    }

    // Métodos para establecer el autor del libro
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Métodos para obtener el año de publicación del libro
    public int getAño() {
        return año;
    }
    
    public static int getTotalLibros() {
		return totalLibros;
	}

    // Métodos para establecer el año de publicación del libro
    public void setAño(int año) {
        this.año = año;
    }

    // Métodos para obtener la lista de copias del libro
    public ArrayList<Copia> getCopias() {
        return copias;
    }

    // Métodos para establecer la lista de copias del libro
    public void setCopias(ArrayList<Copia> copias) {
        this.copias = copias;
    }
}

