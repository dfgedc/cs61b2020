package chapter12;

public class DataIndexedIntegerSet  {
    private boolean[] present;
    private int i;
    public DataIndexedIntegerSet() {
        present = new boolean[2000000000];
    }

    public void add(int x) {
        present[i] = true;
    }

    public boolean contains(int x) {
        return present[i];
    }
}