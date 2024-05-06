public class App {
    //Jostin Alexander Arias Valle 2024-1348U
    public static void insertion(int[] arr) {
       int n = arr.length;
       for (int i = 1; i < n; i++) {
        int key = arr[i]; // selecionamos el elemento a insertar en su posicion correcta
        int j = i - 1;
     
        //movemos los elemetos mayores que key a una posicion adelante de su posicion actual
        while (j >= 0  && arr [j] > key)  
        {
            arr [j + 1 ]  = arr [j];
            j --;          
        } 
          arr[j+1]  = key;
        }  
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! metodo de ordenamiento por insercion");
         
        int[] arr = {12, 11, 13, 5, 6 };

        System.out.println("arreglo original:");
        for ( int num : arr ) {
          System.out.println(num + " ");
        }
        System.out.println();
        System.out.println("----------------");
        insertion(arr); //llamada al metodo de ordenamiento por insercion

        System.out.println("arreglo ordenado:");
        for (int num : arr) {
            System.out.println(num +" ");  //muestra el arreglo de una manera ordenada;☻
        }
    }
}