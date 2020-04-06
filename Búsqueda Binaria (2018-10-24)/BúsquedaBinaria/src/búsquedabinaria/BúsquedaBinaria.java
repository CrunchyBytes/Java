/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package búsquedabinaria;

import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class BúsquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese el número de enteros que desee agrear a la lista: ");
        int n = scan.nextInt();
        
        int x[] = new int[n];
        
        System.out.println("Por favor ingrese el número de enteros que desee agrear a la lista: ");

        /*
         //Variables
	int frst=0, last, mid, n, num, pos, i, temp;
	bool edit=true;
	
	//Procesos
	printf("\t\t\t\t B%cSQUEDA BINARIA\n", 233);
	printf("--------------------------------------------------------------------------------");
	printf("%cDe cu%cntos elementos ser%c su lista? ", 168, 160, 160);
	scanf("%i", &n);
	
	int x[n];
	last = n-1;
	
	printf("\nIngrese los elementos de su lista:");
	for (i=0; i<n; i++)
	{
		// Cada elemento del vector es 
		printf("\n[%i]: ", i);
		scanf("%i", &x[i]);
	}
	
	while (edit==true)
	{
		edit=false;
		for(i=0; i<n; i++)
		{
			if (x[i] > x[i+1])
			{
				temp = x[i];
				x[i] = x[i+1];
				x[i+1] = temp;
				edit=true;
			}
		}
	}
	
	printf("\n\nLa lista (ordenada) es: ");
	for (i=0; i<n; i++)
	{
		printf("\n[%i]: %i", i, x[i]);
	}
	
	printf("\n\nAhora, %cqu%c n%cmero es el que busca? ", 168, 130, 163);
	scanf("%i", &num);
	
	while (frst<=last)
	{
		mid = (frst+last)/2;
		if (x[mid] == num)
		{
			pos = mid;
			frst = n+1;
		}
		else if (num < x[mid])
		{
			last = mid-1;
		}
		else
		{
			frst = mid+1;
		}
	}
	if (frst==n+1)
	{
		printf("\n\nEl n%cmero a buscar, %i, se encuentra en la posici%cn [%i] de la lista", 163, num, 162, pos);
	}
	else
	{
		printf("\n\nEl n%cmero a buscar, %i, no se encuentra en la lista", 163, num);
	}
        */
    }
    
}
