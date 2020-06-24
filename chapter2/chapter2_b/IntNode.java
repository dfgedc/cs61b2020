package chapter2.chapter2_b;

public class IntNode {
    public int item;
    public IntNode next;
    public IntNode prev;
    public IntNode(int i, IntNode n) {
        item = i;
        next = n;
    }
}