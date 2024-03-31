package sorting;
import java.util.Arrays;
class Sorter {
    public void bubbleSort(String[] names) {
        for (int counter = 0; counter < names.length; counter++) {
            for (int index = 0; index < names.length - 1; index++) {//complexity will be n*(n-1)
                if (names[index].compareToIgnoreCase(names[index + 1]) > 0) {
                    String temp = names[index];
                    names[index] = names[index + 1];
                    names[index + 1] = temp;
                }
            }
        }

    }
}
class Main {
    public static void main(String[] hello) {
        String[] names = new String[]{"B", "A", "W", "s", "l"};
        System.out.println("numbers = " + Arrays.toString(names));
        Sorter sorter = new Sorter();
        sorter.bubbleSort(names);
        System.out.println("names = " + Arrays.toString(names));
    }
}
