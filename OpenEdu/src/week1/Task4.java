package week1;

public class Task4 {
    public static void main(String[] args) {


        try (IO.Scanner in = IO.newScanner();
             IO.Printer out = IO.newPrinter()) {

            int size = in.nextInt();
            double element;
            double array[] = new double[size];
            Pair results[] = new Pair[size];


            for (int i = 0; i < size; i++) {
                element = in.nextDouble();
                array[i] = element;
            }


            for ()

        }
    }

    class Pair {
        double value;
        int index;

        Pair(double value, int index) {
            this.value = value;
            this.index = index;
        }

    }
}
