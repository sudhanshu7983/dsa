package sorting;


import java.util.Arrays;
import java.util.Scanner;

class Sorter2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] array =new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=scanner.nextInt();
        }
        Sorter2 sorter2=new Sorter2();
        System.out.println( sorter2.bubbleSort(array));


    }
   int  bubbleSort(int[] array) {
       int count = 0;
       int n =array.length;
       boolean swap=true;
       while(swap){
           swap=false;
           count=count+1;
           for (int i = 0; i < n-1; i++) {
               if (array[i] > array[i+1]) {

                   int temp= array[i];
                   array[i]=array[i+1];
                   array[i+1]=temp;
                   swap=true;
               }

           }
       }
       return count;
   }
}
