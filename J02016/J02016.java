package java_code_ptit.J02016;

import java.util.Arrays;
import java.util.Scanner;

public class J02016 {
    public static int[] x = new int[5001];
    public static boolean ok;

    public static boolean check(long[] a){
        long p1 = a[x[1]];
        long p2 = a[x[2]];
        long p3 = a[x[3]];
        if(p1 + p2 ==  p3) return true;
        else return false;
    }

    public static void inkq(long[] a){
        if(check(a)){
            ok = true;
        }
    }

    public static void Try(int i, int n, long[] a){
        for(int j = x[i - 1] + 1 ; j <= n - 3 + i; j++){
            x[i] = j;
            if(i == 3){
                inkq(a);
                if(ok) break;
            }
            else 
            Try(i + 1, n, a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            ok = false;
            int n = sc.nextInt();
            long[] a = new long[n + 1];
            for(int i = 1; i <= n; i++){
                int x = sc.nextInt();
                a[i] = x * x;
            }

            Arrays.sort(a);
            Try(1, n, a);
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
