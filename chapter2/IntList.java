package chapter2;

public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f,IntList r)
    {
        first = f;
        rest = r;
    }
    public int size(){
        if(rest ==null) 
        {
            return 1;
        }
        return 1+ this.rest.size();
    }
    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(19,null);
        L.rest.rest = new IntList(5, null);

    }
}