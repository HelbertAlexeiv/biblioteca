package modelo;

import java.io.ObjectInputStream.GetField;
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
        ArrayList<String> colecciones = new ArrayList<>();
        for (int i = 0; i < misColecciones.size(); i++) {
            if (!colecciones.contains(misColecciones.get(i).getNombreColeccion())) {
                colecciones.add(misColecciones.get(i).getNombreColeccion());
            }
        }

        for(int i = 0; i < colecciones.size(); i++){
            coleccion += colecciones.get(i) + "\n";
            for (int j = 0; j < misColecciones.size(); j++) {
                if (colecciones.get(i).equals(misColecciones.get(j).getNombreColeccion())) {
                    coleccion += misColecciones.get(j).toString() + "\n";
                }
            }
        }

        return coleccion;
    }
        
        

    public String getMisLibros(){
        String libro = "";
        for (int i = 0; i < misLibros.size(); i++) {
            libro += misLibros.get(i).toString() + "\n";
        }
        return libro;
    }

}
