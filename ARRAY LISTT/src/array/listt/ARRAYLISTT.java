/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.listt;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Alexander
 */
public class ARRAYLISTT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Se define un ArrayList de enteros llamado 'list'
         * Un ArrayList es una clase que permite crear arreglos dinámicos. Es decir, arreglos cuya capa-
           cidad se puede alterar en el desarrollo. 
           Un arreglo estándar tiene un cupo fijo. Se necesita conocer de antemano el número de elemen-
           tos a guardar para crearlo.
         */
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        /* add() es el método que permite añadir un elemento de cualesquier tipo de dato acepte el A-
           rrayList.
           En este caso, un entero.
         * Regresa un bool.
         */
        list.add(6);
        list.add(8);
        list.add(42);
        
        // Todos los elementos de un ArrayList se pueden imprimir sencillamente con el método println()
        System.out.println(list);
        
        /* Así como puedes añadir elementos en un arreglo dinámico conforme avance el programa, también
           puedes quitar.
         * Sólo que el método remove() funciona diferente a su contraparte, ya que, en lugar de dar co-
           mo argumento el elemento a quitar, puedes también dar el índice que el elemento tiene en el
           arreglo:
         */
        list.remove(1);
        
        /* Nueva notación para un ciclo que recorra un ArrayList:
         * Donde Integer es la clase de la cual es el tipo de dato guardado en la lista.
         * 'pos' es el índice que va recorriendo el ArrayList
         * Y 'list' es el ArrayList que recorre.
         */
        for (Integer pos:list)
        {
            System.out.println(pos);
        }

    } 
}
