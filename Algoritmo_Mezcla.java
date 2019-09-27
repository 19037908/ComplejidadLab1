public class Algoritmo_Mezcla {
	
	// se crea metodo recursivo en el cual se solicitan 3 valores, donde en el primero corresponde al arreglo propiamente tal
    // el segundo al indice inicial del arreglo (0) y el final (n-1), los cuales se iran actualizando a medida que se ejecute el metodo en cuestion 
     public void mergeSort(int[] arreglo, int IndiceInicial, int IndiceFinal) {  
            if (IndiceInicial == IndiceFinal) {  // si los indices anteriores son iguales quiere decir que ya se ordeno
            } else {
                int IndiceMedio = (IndiceInicial + IndiceFinal) / 2;  // se crea una variable la cual servira para determinar el valor cercano a la mitad                                                  
                mergeSort(arreglo, IndiceInicial, IndiceMedio);   // vuelve a ingresar al metodo recursivo actual con valores actualizados 
                mergeSort(arreglo, IndiceMedio + 1, IndiceFinal);  
                mergeSort(arreglo, IndiceInicial, IndiceMedio, IndiceFinal);  // ingresa al metodo recursivo mergeSort, pero de diferentes parametros 
            }
        }

        public void mergeSort(int[] arreglo, int IndiceInicial, int IndiceMedio, int IndiceFinal) {  
            int[] I = new int[IndiceMedio - IndiceInicial + 2];  // se crea arreglo I , para determinar los valores que corresponden al lado izquierdo

            for (int i = IndiceInicial; i <= IndiceMedio; i++) {   // ciclo en el que se guardan los valores en el arreglo segun los indices
                I[i - IndiceInicial] = arreglo[i];
            }
            I[IndiceMedio - IndiceInicial + 1] = Integer.MAX_VALUE; // se determina el valor mayor de la media 
            int[] D = new int[IndiceFinal - IndiceMedio + 1];    // se crea arreglo D, en el que se guardaran los valores mayores que la media

            for (int i = IndiceMedio + 1; i <= IndiceFinal; i++) {  // se repite lo mismo que en linea 28
                D[i - IndiceMedio - 1] = arreglo[i];
            }
            D[IndiceFinal - IndiceMedio] = Integer.MAX_VALUE;  
            int i = 0, j = 0;

            for (int k = IndiceInicial; k <= IndiceFinal; k++) {  // ciclo en el que se ordenan los elementos
                if (I[i] <= D[j]) {
                    arreglo[k] = I[i];
                    i++;
                } else {
                    arreglo[k] = D[j];
                    j++;
                }
            }
        }
}
