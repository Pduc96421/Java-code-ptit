package java_code_ptit.J04022;

import java.util.*;

public class WordSet {
    private String s;

    private TreeSet<String> set = new TreeSet<>();

    public WordSet(String s){
        String[] x = s.trim().split("\\s+");
        for(String i : x){
            set.add(i.toLowerCase());
        }
        this.s = s;
    }

    public WordSet union(WordSet b){
        TreeSet<String> ans = new TreeSet<>();
        StringBuilder sb = new StringBuilder("");
        for(String x : this.set ){
            ans.add(x);
        }
        for(String x : b.set){
            ans.add(x);
        }
        for(String x : ans){
            sb.append(x);
            sb.append(" ");
        }

        return new WordSet(sb.toString());
    }

    public WordSet intersection(WordSet b){
        TreeSet<String> ans = new TreeSet<>();
        StringBuilder sb = new StringBuilder("");
        for(String x : this.set){
            if(b.set.contains(x)){
                ans.add(x);
            }
        }
        for(String x : ans){
            sb.append(x);
            sb.append(" ");
        }

        return new WordSet(sb.toString());
    }

    public String toString(){
        return this.s;
    }
}
