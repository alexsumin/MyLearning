package week1;

public class Task4 {
    public static void main(String[] args) {


        try (IO.Scanner in = IO.newScanner();
             IO.Printer out = IO.newPrinter()) {

            int size = in.nextInt();
            double element;
            Pair array[] = new Pair[size];

            for (int i = 0; i < size; i++) {
                element = in.nextDouble();
                array[i] = new Pair(element, i + 1);
            }


            for (int i = 0; i < size - 1; i++) {
                for (int j = size - 1; j > i; j--) {
                    if (array[j].get() < array[j - 1].get()) {
                        Pair temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
            out.print(array[0].getIndex() + " " + array[size / 2].getIndex() + " " +
                    array[size - 1].getIndex());
        }
    }


}

class Pair {
    double value;
    int index;

    Pair(double value, int index) {
        this.value = value;
        this.index = index;
    }

    double get() {
        return value;
    }

    int getIndex() {
        return index;
    }
}