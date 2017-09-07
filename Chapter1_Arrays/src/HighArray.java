
public class HighArray {

    private long[] a;
    private int nElements;

    public HighArray(int max) {
        a = new long[max];
        nElements = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElements; j++)
            if (a[j] == searchKey)
                break;
        if (j == nElements)
            return false;
        else
            return true;
    }

    public void insert(long value) {
        a[nElements] = value;
        nElements++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElements; j++)
            if (value == a[j])
                break;

        if (j == nElements)
            return false;
        else {
            for (int k = 0; k < nElements; k++)
                a[k] = a[k + 1];
            nElements--;
            return true;
        }

    }

    public void display() {
        for (int j = 0; j < nElements; j++)
            System.out.print(a[j] + " ");
        System.out.println("");

    }

}

class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        int searchKey = 35;
        if (arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();
    }
}

