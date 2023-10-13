package gestorAplicacion.paquete1;
public class Copia extends Libro{
	private Libro copiaDe;
	private int copias;
	private boolean estado;
	private String sede;
	
	public Copia(Libro libro, String sede) {
		super(libro.getIsbn(),libro.getTitulo(), libro.getAutor(),libro.getAño(), 1);
		this.sede = sede;
	}
	

    public boolean isEstado() {
        return estado;
    }



    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void setSede(String sede) {
		this.sede = sede;
	}
    
    public String getSede() {
		return sede;
	}
    
}
