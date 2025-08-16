package java_code_ptit.J02024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J02024 {  
    public static int ok;
    
    public static void init(int[] x, int n){
        for(int i = 1; i <= n; i++) 
            x[i] = 0;
    }

    public static void sinh(int[] x, int n){
        int i = n;
        while(x[i] == 1 && i > 0){
            x[i] = 0;
            i--;
        }
        if(i == 0) ok = 0;
        else x[i] = 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            a[0] = -1;
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int[] x = new int[n + 1];
            ok = 1;
            init(x, n);
            ArrayList<String> ans = new ArrayList<>();
            while(ok == 1){
                int sum = 0;
                for(int i = 1; i <= n; i++){
                    sum += x[i] * a[i];
                }
                if(sum % 2 == 1){
                    String tmp = "";
                    for(int i = n; i > 0; i--){
                        if(x[i] == 1) tmp += a[i] + " ";
                    }
                    ans.add(tmp);
                }
                sinh(x, n);
            }
            Collections.sort(ans);
            for(String y : ans){
                System.out.println(y);
            }
        }
        sc.close();
    }
}