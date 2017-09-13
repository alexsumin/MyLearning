package week1;


public class Task1 {
    public static void main(String[] args) {
        try (IO.Scanner in = IO.newScanner();
             IO.Printer out = IO.newPrinter()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = a + b;
            out.println(c);

        }


    }
}