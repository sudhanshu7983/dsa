package sorting;

class Sorter3 {
    void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 50, 92, 30};
        Sorter3 sorter3 = new Sorter3();
        sorter3.selectionSort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}