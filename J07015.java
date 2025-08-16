package java_code_ptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class J07015 {
    public static boolean snt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        TreeSet<Integer> se = new TreeSet<>();
        int[] cnt = new int[10005];
        for(int x : a){
            if(snt(x)){
                se.add(x);
                cnt[x]++;
            }
        }
        for(int x : se){
            System.out.println(x + " " + cnt[x]);
        }
        in.close();
    }
}
