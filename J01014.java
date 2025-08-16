package java_code_ptit;

import java.util.Scanner;

public class J01014 {
    public static long solve(long n){
        long ans = 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                while(n % i == 0){
                    n /= i;
                }
                ans = i;
            }
        }
        if(n != 1){
            ans = n;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(solve(n));
        }
    }
}
