public class Algoritmo_Rapido {
	
	 public int[] quicksort(int numeros[]) {    // metodo recursivo, el cual busca recopilar informacion acerca del arreglo 
         return quicksort(numeros, 0, numeros.length - 1); // retornara el arreglo, con el valor 0 (quien determinara el lado izquierdo) y el tamaño -1 
 }

 private int[] quicksort(int numeros[], int izq, int der) {  // se ingresan los valores recopilados (arreglo,indice del lado izquierdo,indice lado derecho) 
     
     if (izq >= der) {  // si el indice es mayor o igual que el indice derecho, retornara el arreglo ordenado
       return numeros;
     }
     int i = izq, d = der;   // si no se crean variables auxiliares de los indices, ya que estos se modificaran mas adelante
     if (izq != der) {    // si el indice izquierdo es distinto al derecho ingresara
         int pivote;    // y se definira un pivote y un auxiliar
         int aux;   
         pivote = izq;   // se inicia la variable pivote con el valor del indice izquierdo , donde todas las comparaciones seran con este 
         while (izq != der) {  // mientras el indice izquierdo sea distinto al derecho se realiza lo siguiente
             while (numeros[der] >= numeros[pivote] && izq < der) {  // decremanta el indice derecho al cumplir la sentencia establecida
                 der--;
             }
             while (numeros[izq] < numeros[pivote] && izq < der) {  // incrementa el indice izquierdo al cumplir la comparacion
                 izq++;
             }
             if (der != izq) {   // si el indice derecho es distinto al izquierdo hacer 
                 aux = numeros[der]; // que el elemento en la posicion der del arreglo numeros se guarde en la varaible aux
                 numeros[der] = numeros[izq]; // el arreglo en la posicion der sera igual al de la posicion izquierda
                 numeros[izq] = aux; // el arreglo finalmente toma el valor del elemento almacenado en aux
                 }
         }
         if (izq == der) {        // si el pivote coincide con el indice derecho, volvera a ingresar al metodo recursivo con otros parametros
           quicksort(numeros, i, izq - 1);
           quicksort(numeros, izq + 1, d);
         }
     } else {
          return numeros;   // retorna el arreglo
       }
       
     return numeros;     // retorna el arreglo
     }
}