package java_code_ptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class J07031 {
    public static boolean snt(int n)
    {
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int x : a){
            if(snt(x) && x < 500002){
                int y = 1000000 - x;
                if(a.indexOf(y) != -1 && b.indexOf(x) == -1 && b.indexOf(y) == -1){
                    if(snt(y)){
                        map.put(x, y);
                    }
                }
            }
        }
        for(int x : map.keySet()){
            System.out.println(x + " " + map.get(x));
        }
        in1.close();
        in2.close();
    }
}
