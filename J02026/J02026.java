package java_code_ptit.J02026;

import java.util.Arrays;
import java.util.Scanner;

public class J02026 {
    public static int ok;

    public static void init(int[] x, int k){
        for(int i = 1; i <= k; i++){
            x[i] = i;
        }
    }

    public static void sinh(int n, int k, int[] a)
    {
        int i = k;
        while(i > 0 && a[i] == n - k + i){
            i--;
        }
        if(i == 0) ok = 0;
        else {
            a[i]++;
            for(int j = i + 1; j <= k; j++){
                a[j] = a[j - 1] + 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n + 1];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            a[0] = -1;
            Arrays.sort(a);
            int[] x = new int[k + 1];
            init(x, k);
            ok = 1;
            while(ok == 1){
                for(int i = 1; i <= k; i++){
                    System.out.print(a[x[i]] + " ");
                }
                System.out.println();
                sinh(n, k, x);
            }
        }
        sc.close();
    }
}
