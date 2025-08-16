package java_code_ptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07032 {
    public static boolean check(int n){
       String res = "" + n;
       StringBuilder sb = new StringBuilder(res);
        sb.reverse();
        if(sb.toString().compareTo(res) != 0) return false;
        if(res.length() % 2 == 0) return false;
        for(char x : res.toCharArray())
        {
            if((x - '0') % 2 == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();

        int[] dem1 = new int[1000005];
        int[] dem2 = new int[1000005];

        for(int x : a){
            if(check(x)) dem1[x]++;
        }

        for(int x : b){
            if(check(x)) dem2[x]++;
        }

        int dem = 0;
        for(int i = 10; i <= 1000004; i++){
            if(dem1[i] > 0 && dem2[i] > 0){
                System.out.println(i + " " + (dem1[i] + dem2[i]));
                dem++;
                if(dem == 10) break;
            }
        }
    }
}
