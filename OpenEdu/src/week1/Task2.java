package week1;


import java.math.BigInteger;

public class Task2 {
    public static void main(String[] args) {
        try (IO.Scanner in = IO.newScanner();
             IO.Printer out = IO.newPrinter()) {
            BigInteger a = BigInteger.valueOf(in.nextLong());
            BigInteger b = BigInteger.valueOf(in.nextLong());
            BigInteger c = a.add(b.pow(2));
            out.println(c);

        }
    }

}
