package java_code_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07008 {
    public static int ok;

    public static void init(int[] x, int n){
        for(int i = 1; i <= n; i++){
            x[i] = 0;
        }
        ok = 1;
    }

    public static void sinh(int[] x, int n){
        int i = n;
        while(x[i] == 1){
            x[i] = 0;
            i--;
        }
        if(i == 0) ok = 0;
        else x[i] = 1;
    }

    public static boolean check(ArrayList<Integer> tmp){
        for(int i = 0; i < tmp.size() - 1; i++){
            if(tmp.get(i) > tmp.get(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }
        int[] x = new int[n + 1];
        init(x, n);
        ArrayList<String> ans = new ArrayList<>();

        while(ok == 1){
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i = 1; i <= n; i++){
                if(x[i] == 1) tmp.add(a[i]);
            }

            if(check(tmp) && tmp.size() > 1){
                String qhoa = "";
                for(int i = 0; i < tmp.size(); i++){
                    qhoa += tmp.get(i) + " ";
                }
                qhoa.trim();
                ans.add(qhoa);
            }
            sinh(x, n);
        }
        Collections.sort(ans);
        for(String q : ans){
            System.out.println(q);
        }
        sc.close();
    }
}
