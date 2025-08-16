package java_code_ptit.J07009;

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

    public IntSet intersection(IntSet b){
        IntSet ans = new IntSet();
        for(int x : this.set){
            if(b.set.contains(x)){
                ans.set.add(x);
            }
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
