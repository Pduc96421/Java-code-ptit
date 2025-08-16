package java_code_ptit.J07085;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class J07085 {
    public static int sum(String s){
        int ans = 0;
        for(char x : s.toCharArray()){
            ans += x - '0';
        }
        return ans;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));

        ArrayList<String> a = (ArrayList<String>) in.readObject();

        for(String x : a){
            String ans = "";
            for(char y : x.toCharArray()){
                if(Character.isDigit(y)){
                    ans += y;
                }
            }
            BigInteger s = new BigInteger(ans);
            System.out.println(s + " " +sum(ans));
        }
        in.close();
    }
}