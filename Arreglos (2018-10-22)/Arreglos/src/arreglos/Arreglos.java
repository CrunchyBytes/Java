/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int [] array = new int[5];
        
        System.out.println("Favor de ingresar 5 enteros para llenar el arreglo: ");
        for (int i=0; i<5; i++)
        {
            System.out.println("Número " + (i+1));
            array[i] = scan.nextInt();
        }
        
        System.out.println("\nSu arreglo consiste de los números: ");
        
        for (int i=0; i<5; i++)
        {
            System.out.println("#" + (i+1) + ": " + array[i]);
        }
    }
    
}
