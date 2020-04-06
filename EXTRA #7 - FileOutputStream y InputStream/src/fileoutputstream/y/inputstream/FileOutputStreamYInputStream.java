/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoutputstream.y.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Alexander
 */
public class FileOutputStreamYInputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File file = new File("Prueba.txt");
        
        /* Método para escribir en archivo.
         * De bajo nivel.
         * Byte por byte (8 bits).
         * => Dominio: [-((2^8)/2), ((2^8)/2)-1] = [-128, 127]
              Porque incluye al 0 también, en positivos llega hasta el 127 en lugar del 128.
         */
        FileOutputStream fileOut = new FileOutputStream(file);
        
        /* Convierte elementos a código ASCII
         * Mínimo: -128
         * Máximo: 127
         */
        byte [] arregloOut = {127/*, 20, 30, 40, 5*/};
        
        fileOut.write(arregloOut);
        fileOut.close();
        
        // Para bytes exclusivamente
        FileInputStream fileIn = new FileInputStream(file);
        // A diferencia del arreglo del OutputStream, se 
        int size = (int)file.length();
        byte [] arregloIn = new byte[size];
        
        // Nada más lee el último elemento...
        System.out.println(fileIn.read(arregloIn));
        fileIn.close();

    }
    
}
