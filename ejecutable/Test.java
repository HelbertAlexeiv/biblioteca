package ejecutable;

import controlador.Controlador;
import modelo.Circulo;
import vista.VentanaPrincipal;

public class Test {
   public static void main(String[] args) {
    VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
    Circulo miCirculo = new Circulo();
    Controlador miControlador = new Controlador(miVentanaPrincipal, miCirculo);
    
   } 
}
