/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Datos.Archivo;
import java.util.Random;

/**
 *
 * @author Jhonny
 */
public class Palabras {

    private String[][] sopaletras;
    private Archivo archivo = new Archivo();
    

    public void CargarPalabras() {
        String palabra, datos;
        archivo = new Archivo();
//        datos = archivo.LeerArchivo();
    }

    public void LlenarSopaHorizontal(String[][] sopa) {
        archivo.LeerArchivo();
        for (int n = 0; n < 10; n++) {
            String[] contenido = archivo.LeerRegistro();

            int con;
            int num;
            do {
                num = Posicion();

                con = num + contenido.length;

            } while (con > 15);

            int num1 = Posicion();
            for (int i = 0; i < contenido.length; ++i) {
                
                sopa[num1][num] = contenido[i];
               num++;

            }
        }

    }
    
    public void LlenarSopaVertical(String[][] sopa) {
        archivo.LeerArchivo();
        for (int n = 0; n < 10; n++) {
            String[] contenido = archivo.LeerRegistro();

            int con;
            int num;
            do {
                num = Posicion();

                con = num + contenido.length;

            } while (con > 15);

            int num1 = Posicion();
            for (int i = 0; i < contenido.length; ++i) {
                
                sopa[num][num1] = contenido[i];
               num++;

            }
        }

    }

    public int Posicion() {
        Random rnd = new Random();
        int num = (int) (rnd.nextDouble() * 14 + 0);
        return num;
    }

    public void LlegarMatriz(String[][] sopa) {

        char letra = ' ';
        for (int i = 0; i < sopa.length; ++i) {
            for (int j = 0; j < sopa[0].length; ++j) {

                letra = (char) (Math.random() * ((122 + 1) - 97) + 97);
                sopa[i][j] = (new StringBuffer().append(letra)).toString();

            }
        }

    }

    public void MostrarSopa(String[][] sopa) {
        for (String[] fila : sopa) {
            for (String dato : fila) {
                System.out.print(dato + "\t");
            }

            System.out.println("\n");
        }
    }

    private static boolean BuscarPalabra(char[][] sopa, String palabra) {
        String palabraBus = "";
        char letra = ' ';
        int indicePal = 0;

        for (int i = 0; i < sopa.length; ++i) {
            for (int j = 0; j < sopa[0].length; ++j) {
                while (indicePal < palabra.length()) {
                    letra = palabra.charAt(indicePal);

                    if (sopa[i][j] == letra) {
                        palabraBus += letra;
                        ++indicePal;
                    } else {
                        break;
                    }
                }
            }
        }

        if (palabraBus.equalsIgnoreCase(palabra)) {
            return true;
        }

//        System.out.println("\nPalabra buscada: " + palabraBus);
        return false;
    }

}
