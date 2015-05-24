/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_palabras;

import Modelos.Jugador;
import Modelos.Palabras;
import java.util.Scanner;

/**
 *
 * @author Jhonny
 */
public class Juego_palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//         Scanner read = new Scanner(System.in);
//          int numP = 0;
//           String palabr = "";
//          
//        Palabras palabra = new Palabras();
//        Jugador jugador = new Jugador();
//        String[][] sopa = new String[15][15];
//        palabra.LlegarMatriz(sopa);
//        palabra.LlenarSopaHorizontal(sopa);
//        palabra.LlenarSopaVertical(sopa);
//        palabra.MostrarSopa(sopa);
//        
//         System.out.println("¿Cuantas palabras quiere que se busque?");
//        numP = read.nextInt();
//
//        for (int i = 0; i < numP; ++i) {
//            System.out.println("\nIngrese palabra a buscar: " + (i + 1));
//            palabr = read.next();
//
//            System.out.println(jugador.buscarPalabra(sopa, palabr));
//        }
       VentanaJuego juego = new VentanaJuego();
       juego.show();
        
       VentanaJuego juego2 = new VentanaJuego();
       juego2.show();
        
    }
    
}
