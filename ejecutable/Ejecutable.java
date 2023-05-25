package ejecutable;

import java.io.Console;

import modelo.Biblioteca;
import modelo.Coleccion;
import modelo.Libro;

public class Ejecutable {
    public static void main(String[] args) {
        System.out.println("------Biblioteca------");
        
        Console console = System.console();
        
        Biblioteca biblioteca = new modelo.Biblioteca();
        Libro libro;
        
        do{
            String nombreLibro = console.readLine("Ingrese el nombre del libro: ");
            String autor = console.readLine("Ingrese el autor del libro: ");
            int anioEdicion = Integer.parseInt(console.readLine("Ingrese el año de edición del libro: "));
            boolean lujo;
        
            System.out.println("¿El libro es de lujo? (si/no)");
        
            if (console.readLine().equals("si")) {
            
                lujo = true;
                libro = new Libro(nombreLibro, autor, anioEdicion, lujo);
                biblioteca.addMisLibros(libro);
            } else {
            
                lujo = false;
                libro = new Libro(nombreLibro, autor, anioEdicion, lujo);
                biblioteca.addMisLibros(libro);
            }

            System.out.println("¿El libro es parte de una colección? (si/no)");
            if(console.readLine().equals("si")){
            
                String nombreColeccion = console.readLine("Ingrese el nombre de la colección: ");
            
                int numeroColeccion = Integer.parseInt(console.readLine("Ingrese el número de la colección: "));
            
                Coleccion coleccion = new modelo.Coleccion(nombreLibro, autor, anioEdicion, lujo, nombreColeccion, numeroColeccion);
            
                biblioteca.addMisColecciones(coleccion);
            }
            System.out.println("\n\n");
        }while(console.readLine("¿Desea agregar otro libro? (si/no)").equals("si"));

        System.out.println("------Libros------");
        System.out.println(biblioteca.getMisLibros());

        System.out.println("------Colecciones------");
        System.out.println(biblioteca.getColecciones());


    }
}
