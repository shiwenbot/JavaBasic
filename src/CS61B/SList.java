package CS61B;

public class SList {

    //IntNode is nested class
    private class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }
    private IntNode first;
    private int size;

    public SList(int x){

        first = new IntNode(x,null);
        size = 1;
    }

    public void addfirst(int x){

        first = new IntNode(x,first);
        size += 1;
    }

    public int getfirst(){
        return first.item;
    }

    public void addlast(int x){
        IntNode p = first;
        while (p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x,null);
        size += 1;
    }

    public int size(){return size;}


    public static void main(String[] args) {
        SList L = new SList(5);
        L.addfirst(10);
        L.addfirst(15);
        System.out.println(L.getfirst());
        System.out.println(L.size());
    }
}
