package sorting;

public class Sorter4 {
    void selectionSort(String[] names) {
        for (int i = 0; i < names.length- 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareToIgnoreCase(names[i+ 1]) > 0) {
                    minIndex = j;
                }
            }
            String temp = names[i];
            names[i] = names[minIndex];
            names[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        String[] names = {"a", "t", "b","k","c"};
        Sorter4 sorter4 = new Sorter4();
        sorter4.selectionSort(names);
        for (String num : names) {
            System.out.print(num + " ");
        }
    }
}
