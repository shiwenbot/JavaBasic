package CS61B;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    public static void main(String[] args) {
        IntList L = new IntList(10, null);
        L = new IntList(15,L);
        L = new IntList(20,L);
        System.out.println(L.size());
        System.out.println(L.iterativesize());
        System.out.println(L.iterativeget(0));
    }

    public int size() {
        //recursion, need base case
        if(rest == null) return 1;
        return 1 + this.rest.size();
    }

    public int iterativesize(){
        IntList p = this;
        int iterativesize = 0;
        while(p != null){
            iterativesize += 1;
            p = p.rest;
        }
        return iterativesize;
    }

    //recursive, get the ith item of the Intlist
    public int get(int i){
        if (i == 0) return first;
        return rest.get(i - 1);
    }

    public int iterativeget(int i){
        IntList p = this;
        while(i!=0){
            p = p.rest;
            i--;
        }
        return p.first;
    }
}
