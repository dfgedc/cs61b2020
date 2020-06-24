package chapter3_test;

public class Sort {
    static void sort(String[] x, int start) { 
        if (start == x.length) {
            return;
        }
        int smallestIndex = findSmallest(x);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
     }
      /** Returns the smallest string in x. */
      public static int findSmallest(String[] x) {
             int smallestIndex = 0;
            for (int i = 0; i < x.length; i += 1) {
                int cmp = x[i].compareTo(x[smallestIndex]);
                if (cmp < 0) {
                    smallestIndex = i;
            }
    }
             return smallestIndex;
    }
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}