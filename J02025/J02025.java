package java_code_ptit.J02025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J02025 {
    public static int ok;

    public static boolean snt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    
    public static void init(int[] x, int n){
        for(int i = 0; i <= n; i++) 
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
            Integer[] a = new Integer[n + 1];
            a[0] = 1001;
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, new Comparator<Integer>() {
                public int compare(Integer s1, Integer s2){
                    return s2 - s1;
                }
            });
            int[] x = new int[n + 1];
            ok = 1;
            init(x, n);
            while(ok == 1){
                int sum = 0;
                for(int i = 1; i <= n; i++){
                    if(x[i] == 1) sum += a[i];
                }
                if(snt(sum)){
                    for(int i = 1; i <= n; i++){
                        if(x[i] == 1) System.out.print(a[i] + " ");
                    }
                    System.out.println();
                }
                sinh(x, n);
            }
        }
        sc.close();
    }
}
