package java_code_ptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class J07029 {
    public static boolean snt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int x : a){
            if(snt(x)){
                if(map.containsKey(x)){
                    map.put(x, map.get(x) + 1);
                }
                else{
                    map.put(x, 1);
                }
            }
        }
        int cnt = 0;
        for(int x : map.keySet()){
            System.out.println(x + " " + map.get(x));
            cnt++;
            if(cnt == 10){
                break;
            }
        }
        in.close();
    }
}
