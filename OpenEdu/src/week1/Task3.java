package week1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {


        try (IO.Scanner in = IO.newScanner();
             IO.Printer out = IO.newPrinter()) {
            int size = in.nextInt();
            int element;


            int array[] = new int[size];
            int indexes[] = new int[size];
            //заполнение массива из файла
            for (int i = 0; i < size; i++) {
                element = in.nextInt();
                array[i] = element;
            }


            //сортировка вставками
            for (int j = 0; j < size; j++) {
                int newValue = array[j];
                int i = j;
                while (i > 0 && (array[i - 1] > newValue)) {
                    array[i] = array[i - 1];
                    i--;
                }
                array[i] = newValue;
                indexes[j] = ++i;
            }


            Arrays.stream(indexes).forEach(value -> out.print(value + " "));
            out.println();
            Arrays.stream(array).forEach(value -> out.print(value + " "));

        }
    }
}



