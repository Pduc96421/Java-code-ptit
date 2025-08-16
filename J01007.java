package java_code_ptit;

import java.util.Arrays;
import java.util.Scanner;

public class J01007 {
    public static long[] F = new long[93];
    
    public static void fib(){
        F[1] = 0;
        F[2] = 1;
        for(int i = 3; i < 93; i++){
            F[i] = F[i - 1] + F[i - 2];
        }
    }
    public static void main(String[] args) {
        fib();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(Arrays.binarySearch(F, n) > 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
