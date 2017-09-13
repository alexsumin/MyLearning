package week1;


import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int array[] = {5, 2, 4, 6, 1, 3};

        for (int j = 1; j < array.length; j++) {

            int i = j - 1;

            while (i >= 0 && (array[i] > array[i + 1])) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = i - 1;
            }

        }

        Arrays.stream(array).forEach(value -> System.out.print(value + " "));

    }


}
