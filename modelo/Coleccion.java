package modelo;

public class Coleccion extends Libro{

    private String nombreColeccion;
    private int numeroColeccion;

    public Coleccion(String nombreLibro, String autor, int anioEdicion, boolean lujo, String nombreColeccion, int numeroColeccion) {
        super(nombreLibro, autor, anioEdicion, lujo);
        this.nombreColeccion = nombreColeccion;
        this.numeroColeccion = numeroColeccion;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public int getNumeroColeccion() {
        return numeroColeccion;
    }
}
