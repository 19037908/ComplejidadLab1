import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Complejidad_Lab1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Random aleatorio = new Random();
	        int N;

	        // CREAR ARCHIVO
	        File archivo; // se declara como un archivo la variable archivo
	        PrintWriter escribir; // se declara como la escritura en el archivo la variable escribir
	        int Ns_original[] = new int[200];  // se crea el arreglo de tamaño 200

	        archivo = new File("C:\\archivos\\archivo.txt"); // se crea el archivo en una direccion predeterminada con un nombre arbitrario

	        if (archivo.createNewFile()) {    // si el archivo no ha sido creado se mostrara el siguiente mensaje
	            System.out.println("Archivo creado con exito");
	        } else {
	            System.out.println("Ya existe el archivo");  // por otro lado si ya existe se mostrara el mensaje actual
	        }

	        // ESCRIBIR EN EL ARCHIVO
	        try {
	            // se inicia la variable antes mencionada otorgandole el nombre y el tipo de archivo (ytf-8, corresponde texto plano)
	            escribir = new PrintWriter(archivo, "utf-8");  

	            
	            for (int d = 0; d < Ns_original.length; d++) {
	                N = aleatorio.nextInt(200);  // se crean numeros aleatorios gracias a la clase predeterminada Random
	                escribir.print(N + " "); // se escriben los valores recopilados en el archivo
	            }

	            escribir.close();  // se cierra el archivo
	        } catch (Exception e) {
	        }

	        // LEER ARCHIVO
	        String texto = "", direccion = "C:\\archivos\\archivo.txt";  // se define variable texto para el total de los elementos del archivo y
	                                                                    // se define dirrecion, la cual establece la direccion del archivo,
	        try {                                                          // el nombre en conjunto con el tipo (yxt)
	            BufferedReader bf = new BufferedReader(new FileReader(direccion)); // se crea un espacio de memoria para leer el contenido
	            String temp = "";   // se declara variable temp para ir almacenando el contenido del archivo
	            String bfRead;  // se declara variavle actual para asignarle un elemento del archivo
	            while ((bfRead = bf.readLine()) != null) { // mientras sea distinto a "vacio" se ira leyendo el contenido del archivo 
	                temp = temp + bfRead;   // se acumulan los valores recopilados en temp
	            }
	            texto = temp;    // finalmente la varaible texto almacena todo lo recopilado anteriormente en el archivo
	            bf.close();
	        } catch (Exception e) {
	            System.err.println("No se encontro archivo");
	        }
	       

	        // SE GUARDA EN UN ARREGLO EL CONTENIDO DEL ARCHIVO
	        String num[] = texto.split(" ");   // se declara arreglo inicializado con los elementos del archivo de tipo String, gracias a la funcion split
	                                            // se almacena en el arreglo en cada indice correspondiente luego de encontrar un " "(espacio)


	        //  SE CONVIERTE EN ENTERO EL CONTENIDO DEL ARCHIVO
	        // ademas se declaran arreglos auxiliares correspondientes a los metodos de ordenamiento
	        int nums[] = new int[num.length];
	        int auxQUICK[] = new int[num.length];
	        int auxMERGE[] = new int[num.length];
	        for (int l = 0; l < nums.length; l++) {
	            nums[l] = Integer.parseInt(num[l]);  // se convierte en entero gracias a la funcion Integer.pars.
	            auxQUICK[l] = nums[l];               // se hacen copias del arreglo para los demas metodos de ordenamiento
	            auxMERGE[l] = nums[l];
	        }
	        
	        
	        Algoritmo_Burbuja burbu = new Algoritmo_Burbuja(); // se crea objeto burbu referenciado de la clase Algoritmo burbuja 
	        burbu.algoritmoBubuja(nums);            // y se rescata el metodo algoritmoBurbuja para su posterior ordenamiento
	        Algoritmo_Rapido rapido = new Algoritmo_Rapido();
	        System.out.println("QUICK sort");
	        rapido.quicksort(auxQUICK);
	         for(int t=0;t<auxQUICK.length;t++){
	                System.out.print(auxQUICK[t]+" ");
	            }
	         System.out.println("");
	         System.out.println("MERGE sort");
	         Algoritmo_Mezcla mezcla = new Algoritmo_Mezcla();
	         mezcla.mergeSort(auxMERGE, 0, auxMERGE.length-1);
	         for(int u=0;u<auxMERGE.length;u++){
	             System.out.print(auxMERGE[u]+" ");
	         }
	    }

	}