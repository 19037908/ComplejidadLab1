public class Algoritmo_Burbuja {
	
public void algoritmoBubuja(int num[]){
        
        int  aux, aux1;         
        for (int i = 0; i < num.length; i++) {  
            for (int f = 0; f < num.length - 1 - i; f++) {
                aux = num[f + 1];           // en la variable aux se guarda el valor siguiente a f
                aux1 = num[f];              // en la variable aux1 se guarda el valor actual de f
                if (num[f] > num[f + 1]) {  // se compara el valor en el indice f y f+1 , si el primero es menor entra
                                            
                    num[f + 1] = aux1;      // se intercambian las posiciones segun la sentencia
                    num[f] = aux;

                }
            }
        }
        // muestra el arreglo de numeros ordenado mediante el metodo de la burbuja
        System.out.println("BUBBLE sort");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
        System.out.println("");
    }
}