/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonny
 */
public class Archivo {
    private File archivo = new File("espaniol.txt");;
    private String cadena;
    private BufferedReader dato;
    private String palabra;
    private String[] letra;
    
    public void LeerArchivo(){
        
        try{
            FileReader reader = new FileReader(archivo);
            dato = new BufferedReader(reader);
           
           
        
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,e.getCause());
        }
        
        
    }
    
    public String[] LeerRegistro(){
        try {
            palabra = dato.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
            letra = palabra.split("-");
            return letra;
    }
    
}
