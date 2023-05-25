package modelo;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> misLibros = new ArrayList<>();
    private ArrayList<Coleccion> misColecciones = new ArrayList<>();

    public Libro getMisLibros(int i) {
        return misLibros.get(i);
    }

    public void addMisLibros(Libro libro){
        misLibros.add(libro);
    }

    public Coleccion getMisColecciones(int i) {
        return misColecciones.get(i);
    }

    public void addMisColecciones(Coleccion coleccion){
        misColecciones.add(coleccion);
    }

    public String getColecciones(){
        String coleccion = "";
        for (int i = 0; i < misColecciones.size(); i++) {
            coleccion += misColecciones.get(i).toString() + "\n";
        }
        return coleccion;
    }
}
