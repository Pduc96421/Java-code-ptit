package java_code_ptit.J07024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set = new TreeSet<>();

    public WordSet(String filename) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(filename));
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            this.set.add(s);
        }
    }
    
    public WordSet(TreeSet<String> a){
        this.set = a;
    }

    public WordSet difference(WordSet b){
        TreeSet<String> x = (TreeSet<String>) this.set.clone();
        TreeSet<String> y = b.set;
        x.removeAll(y);
        return new WordSet(x);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("");
        for(String x : set){
            sb.append(x);
            sb.append(" ");
        }
        return sb.toString();
    }
}
