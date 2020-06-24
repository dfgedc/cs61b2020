package chapter6;

import java.util.Iterator;

public class ArraySet<T> implements Iterable<T> {
    private T[] items;
    private int size; // the next item to be added will be at position size

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    public boolean contains(T x){
        for(int i =0;i<size;i++)
        {
            if(items[i].equals(x)){
                return true;
            }
        }
        return false;
    }
    public void add(T x)
    {
        if(contains(x)){
            return;
        }
        items[size] = x;
        size++;
    }
    public int size(){
        return size;
    }
    
    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new ArraySetIterator();
    }
    private class ArraySetIterator implements Iterator<T> {
        private int wizPos;

        public ArraySetIterator() {
            wizPos = 0;
        }

        public boolean hasNext() {
            return wizPos < size;
        }

        public T next() {
            T returnItem = items[wizPos];
            wizPos += 1;
            return returnItem;
        }
    }

    public String toString(){
        StringBuilder returnSB = new StringBuilder("{");
        for (int i = 0; i < size - 1; i += 1) {
            returnSB.append(items[i].toString());
            returnSB.append(", ");
        }
        returnSB.append(items[size - 1]);
        returnSB.append("}");
        return returnSB.toString();
    }
}