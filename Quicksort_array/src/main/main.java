package main;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scan = new Scanner(System.in);

		        System.out.print("Ingrese el tamaño del arreglo: ");
		        int n = scan.nextInt();

		        int[] arr = new int[n];

		        
		        for (int i = 0; i < n; i++) {
		         System.out.println("Ingrese el numero en la posicion "+(i+1)+" : ");
		            arr[i] = scan.nextInt();
		        }
		        System.out.println("Array desordenado");
		        System.out.println(Arrays.toString(arr));
		        System.out.println("");
		        sort(arr);
		        System.out.println("Arreglo ordenado:");
		     
		        System.out.println(Arrays.toString(arr));
		    }
	//SORT:metodo publico que se mandara a llamar para que ordene el arreglo este
	//manda a llamar a nuestro metodo privado quicsork que es por el cual realizamos la ordenacion real

		    public static void sort(int[] arr) {
		        if (arr == null || arr.length == 0) {
		            return;
		        }
		        quicksort(arr, 0, arr.length - 1);
		    }
		  //en los argumentos le pasamos un arreglo, el indice mas bajo o el primer elemento, y el indice mas 
			 //Alto o ultimo elemento
			 //este metodo  realiza el algoritmo real
		    private static void quicksort(int[] arr, int low, int high) {
		     // inicializamos los indices de i y j 
		    //estos índices serán utilizados para recorrer el arreglo y comparar los elementos con el pivote.
		        int i = low, j = high;
		   //definimos el pivote que se comparara con los demas elementos
		        int pivot = arr[low];
		  //el while principal o exterior sirve para comparar cada elemento con el pivote
         //lo que significa que todavía hay elementos por comparar.

		        while (i <= j) {
	   //El primer bucle while se ejecuta mientras el valor del elemento arr[i] es menor
	  //que el valor del pivote  este bucle mueve el índice i hacia la derecha hasta que encuentra 
		      		          		    	//un elemento que es mayor o igual al pivote  
		            while (arr[i] < pivot) {
		                i++;
		            }
       
		          //Este bucle mueve el índice j hacia la izquierda hasta 
				      //que encuentra un elemento que es menor o igual al pivote.            
		            while (arr[j] > pivot) {
		                j--;
		            }
		            if (i <= j) {
		                int temp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = temp;
		                i++;
		                j--;
		            }
		        }

		        if (low < j) {
		            quicksort(arr, low, j);
		        }
		        if (i < high) {
		            quicksort(arr, i, high);
		        }
		    }
		

	}


