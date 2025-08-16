package java_code_ptit;

import java.util.Scanner;

public class J01006 {
    public static long[] F = new long[93];

    public static void fib(){
        F[1] = 1;
        F[2] = 1;
        for(int i = 3; i < 93; i++){
            F[i] = F[i - 1] + F[i - 2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fib();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long a = F[n];
            System.out.println(a);
        }   
    }
}
