/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alexander
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File file = new File("archivo.txt");
        FileWriter fw = new FileWriter(file);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); 
  
        //br.readLine
        /*String st; 
        while ((st = br.readLine()) != null) 
            System.out.println(st); */
        
        
        fw.write("Hola mundo");
        // Se necesita
        fw.close();
        
        
        System.out.println(br.readLine());
        /*char i; 
        while ((i=(char) fr.read()) != -1) 
            System.out.print((char) i); 
        */
        
        
        //String temp = fr.read();
        //System.out.println(temp);
  
  
       
        
    }
    
}
