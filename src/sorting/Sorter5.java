package sorting;

public class Sorter5 {
    public static void main(String[] args) {
        Sorter5 is = new Sorter5();
        int[] arr = {12, 11, 13, 5, 6};
        is.insertionSort(arr);
        System.out.println("Sorted array:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            for (int k = i; k > 0 && arr[j] > key; k--) {
                arr[k] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
