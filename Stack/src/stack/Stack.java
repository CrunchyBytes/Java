/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Se crea el objeto 'it' de tipo "Stack"
         * Su método push() permite agregar un objeto hasta la cima del Stack
           Toma como parámetros un objeto, y a la vez regresa uno.
         * Tiene la misma función que el método addElement(), salvo por el return, ya que éste es un 
           void.
         */
        java.util.Stack it = new java.util.Stack();
        
        /* Es por ello que, al primero "empujar" 14 y luego 3, el Stack queda de manera que el 3 está
           encima del 14 por haber sido añadido al último -> hasta la cima.
         */
        it.push(14);
        it.push(3);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Stack original: " + it + "\n");
        
        /* Se guardan los 2 valores que vienen guardado en 'it' en variables temporales.
         * Se guarda un entero nuevo, 'one', el cual es pedido al usuario.
         * Se guarda en la primera posición de 'it' la multiplicación de los 2 valores guardados en las 
           variables temporales, 14 y 3, y el segundo lugar lo ocupa 'one'.
         * El ciclo se recorre 10 veces.
         */
        for (int i=0; i<10; i++)
        {
            /* Así como push() es el método para guardar objetos en un Stack, pop() es aquel que los re-
               cupera.
             * A diferencia de push(), pop() no acepta parámetros: saca el objeto de hasta arriba del
               Stack
             = First in, first out
            */
            int temp = Integer.parseInt(it.pop().toString());
            int temper = Integer.parseInt(it.pop().toString());
            System.out.println("Ingrese un entero a continuación por favor: ");
            int one = scan.nextInt();
            it.push(temp*temper);
            it.push(one);
            System.out.println("Stack nuevo: " + it + "\n");
        }
    }
    
}
