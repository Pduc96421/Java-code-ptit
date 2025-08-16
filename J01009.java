package java_code_ptit;

import java.util.Scanner;

public class J01009 {
    public static long giai_thua(int n){
        long tich = 1;
        for(int i = 1; i <= n; i++){
            tich = tich * i;
        }
        return tich;
    }
    public static void Solve(int n){
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + giai_thua(i);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Solve(n);
    }
}
