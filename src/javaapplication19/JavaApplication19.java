
package javaapplication19;

public class JavaApplication19 {

    //colombia gano por goleado
    //colombia perdio
    
    void sort(int arr[])
    {
        int n= arr.length;
        for(int i=0;i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
         }
    }
    
    void printArray(int arr[]){
        int n = arr.length;
        //imprime las posiciones en orden
        
        
        for (int i=0; i<n; i++)
            System.out.println(arr[i]+" ");
    }
  
    public static void main(String[] args) {
        // TODO code application logic here
        
         //crear objeto
        JavaApplication19 p = new JavaApplication19(); 
        //hago un arreglo
        int arr[] = {8,879,456,213,87,465,55,213,21,213};
        //instanciar metodo sort
        p.sort(arr);
        //imprimo el arreglo
        System.out.println(arr);
        //instanciar metodo imprimir
        p.printArray(arr);
    }
    
}
