package sorting;

import java.util.Arrays;

class Sorter1 {
    public void bubbleSort1(int[] numbers) {
        for (int counter = 0; counter < numbers.length; counter++) {
            for (int index = 0; index < numbers.length - 1; index++) {//complexity will be n*(n-1)
                if (numbers[index] > numbers[index + 1]) {
                    int temp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temp;
                }
            }
        }

    }

}

 class M {
    public static void main(String[] hello) {
        int[] numbers = new int[]{33, 85, 1, 89, 66};
        System.out.println("numbers = " + Arrays.toString(numbers));
        Sorter1 sorter1 = new Sorter1();
        sorter1.bubbleSort1(numbers);
        System.out.println("numbers = " + Arrays.toString(numbers));
    }
}
