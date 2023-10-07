package paquete1;

import paquete2.Autor;

public class Libro {
	private String isbn;
	private String titulo;
	private Autor autor;
	private int año;
	//private Copia[] copias;
	
	// Metodos get
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
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

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setAño(int año) {
        this.año = año;
    }

    /*
    public void setCopias(Copia[] copias) {
        this.copias = copias;
    }
    */
}
