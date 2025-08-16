package java_code_ptit.J04021;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> set = new TreeSet<>();

    public IntSet(){

    }

    public IntSet(int a[]){
        for(int x : a){
            set.add(x);
        }
    }

    public IntSet union(IntSet b){
        IntSet ans = new IntSet();
        for(int x : this.set){
            ans.set.add(x);
        }
        for(int x : b.set){
            ans.set.add(x);
        }
        return ans;
    }

    public String toString(){
        String ans = "";
        for(int x : this.set){
            ans += x + " ";
        }
        return ans;
    }
}
