package java_code_ptit;

import java.util.Scanner;

public class J01021 {
    public static int mod = (int) 1e9 + 7;

    public static long luy_thua(long a, long b){
        if(b == 0) return 1;
        if(b == 1) return a;
        long x = luy_thua(a, b / 2);
        if(b % 2 == 1) return (x % mod * x % mod * a % mod) % mod;
        else return (x % mod * x % mod) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(luy_thua(a, b));
        }
    }
}
