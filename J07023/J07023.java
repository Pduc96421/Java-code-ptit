package java_code_ptit.J07023;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class J07023 {
    public static boolean snt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false; 
        }
        return n >= 2;
    } 

    public static boolean thuan_nghich(int n){
        String s = "" + n;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        TreeSet<Integer> ans = new TreeSet<>();

        for(int x : a){
            if(thuan_nghich(x) && snt(x)){
                ans.add(x);
                if(map1.containsKey(x)){
                    map1.put(x, map1.get(x) + 1);
                }
                else{
                    map1.put(x, 1);
                }
            }
        }
        for(int x : b){
            if(thuan_nghich(x) && snt(x)){
                ans.add(x);
                if(map2.containsKey(x)){
                    map2.put(x, map2.get(x) + 1);
                }
                else{
                    map2.put(x, 1);
                }
            }
        }
        for(int x : ans){
            System.out.println(x + " " + map1.get(x) + " " + map2.get(x));
        }
    }
}
