package modelo;

public class Libro {
    private String nombreLibro;
    private String autor;
    private int anioEdicion;
    private boolean lujo;


    public Libro(String nombreLibro, String autor, int anioEdicion, boolean lujo) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.anioEdicion = anioEdicion;
        this.lujo = lujo;
    }


    public String getNombreLibro() {
        return nombreLibro;
    }


    public String getAutor() {
        return autor;
    }


    public int getAnioEdicion() {
        return anioEdicion;
    }


    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

}
