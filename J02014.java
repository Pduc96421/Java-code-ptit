package java_code_ptit;

import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            int[] f = new int[n + 1];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
                if(i == 1) f[i] = a[i];
                else f[i] = f[i - 1] + a[i];
            }
            boolean ok = true;
            for(int i = 1; i <= n; i++){
                if(f[i] == (f[n] - f[i - 1])){
                    ok = false;
                    System.out.println(i + " ");
                    break;
                }
            }
            if(ok) System.out.println("-1");
        }
    }
}
