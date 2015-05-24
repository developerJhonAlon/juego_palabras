/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Observable;

/**
 *
 * @author Jhonny
 */
public class Jugador extends Observable{

    private String nombre;
    private int registro;
    private String tiempo = "0";
    private int puntaje = 0;

    public Jugador() {
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public Jugador(String nombre, int registro) {
        this.nombre = nombre;
        this.registro = registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    
    
    
    public boolean buscarPalabra(String[][] sopa, String palabra) {
        String palabraBus = "";
        char letra = ' ';
        int indicePal = 0;

        for (int i = 0; i < sopa.length; ++i) {
            for (int j = 0; j < sopa[0].length; ++j) {
                while (indicePal < palabra.length()) {
                    letra = palabra.charAt(indicePal);
                    String cadena = (new StringBuffer().append(letra)).toString();

                    if (sopa[i][j].equals(cadena)) {
                        palabraBus += cadena;
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
