/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keys.y.contadores;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Alexander
 */
public class KeysYContadores {
    
    
    Map<String, Integer> table;
    
    // Constructor default
    public KeysYContadores()
    {
        table = new TreeMap<String, Integer>();
    }
    
    public void add(String s)
    {
        if (table.containsKey(s))
            table.put(s, table.get(s)+1);
        else
            table.put(s, 1);
    }
    
    public void print()
    {
        for (Map.Entry<String, Integer> item: table.entrySet())
        {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KeysYContadores obj = new KeysYContadores();
        Scanner scan = new Scanner(System.in);
        String temp="";
        
        System.out.println("Favor de escribir claves. El ciclo se detendrá hasta ingresar 'exit'");
        
        /*do
        {
            temp = scan.next();
            if (!(temp=="exit"))
                obj.add(temp);
        } while (!(temp.equals("exit")));
        */
        
        while (!(temp.equals("exit")))
        {
            temp = scan.next();
            if (!(temp=="exit"))
                obj.add(temp);
        }
        obj.print();
    }
    
}
