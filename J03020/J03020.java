package java_code_ptit.J03020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J03020 {
    public static boolean check(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> ans = new HashMap<>();
        ArrayList<String> a = new ArrayList<>();
        int max_len = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                max_len = Math.max(max_len, s.length());
                if(ans.containsKey(s)){
                    ans.put(s, ans.get(s) +  1);
                }
                else{
                    a.add(s);
                    ans.put(s, 1);
                }
            }
        }
        for(String x : a){
            if(x.length() == max_len){
                System.out.println(x + " " + ans.get(x));
            }
        }
        sc.close();
    }
}
// AAA BAABA HDHDH ACBSD SRGTDH DDDDS
// DUAHD AAA AD DA HDHDH AAA AAA AAA AAA
// DDDAS HDHDH HDH AAA AAA AAA AAA AAA
// AAA AAA AAA
// DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
// TDTD