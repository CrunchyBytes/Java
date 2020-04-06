/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataoutputstreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Alexander
 */
public class DataOutputStreams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File file = new File("Prueba.txt");
        FileOutputStream fileOut = new FileOutputStream(file);
        /* A diferencia de FileOutputStream, DataOutputStream maneja tipos de datos más grandes.
         * Su función es la misma: escribir en un archivo, pero DataOutputStream maneja lo que son en-
           teros, doubles, flotantes, chars, Strings, etc., mientras que FileOutputStream escribe bytes.
         */
        DataOutputStream dataStream = new DataOutputStream(fileOut);
        
        /*
         *
         */
        dataStream.writeInt(42);
        dataStream.writeBoolean(false);
        dataStream.writeChars("Yabadabadoo");
        
        /* Así como antes se cerraba el FileOutputStream para poder leer el contenido del archivo en que
           se escribió, aquí se cierra el DataOutputStream.
         * No entiendo bien por qué no se cierra de paso el FileOutputStream, pero funciona la lectura.
         */
        dataStream.close();
        
        FileInputStream fileIn = new FileInputStream(file);
        DataInputStream dataIn = new DataInputStream(fileIn);
        
        
        System.out.println(dataIn.readInt());
        System.out.println(dataIn.readBoolean());
        System.out.println(dataIn.readLine());
        
                
    }
    
}
