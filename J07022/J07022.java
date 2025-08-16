package java_code_ptit.J07022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> ans = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            try {
                Integer a = Integer.parseInt(s);
            } catch (Exception e) {
                ans.add(s);
            }
        }
        Collections.sort(ans);
            for(String x : ans){
                System.out.print(x + " ");
            }
        sc.close();
    }
}
