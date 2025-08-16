package java_code_ptit;

import java.util.Scanner;

public class J01011 {
    public static long gcd(long a, long b){
        while(a != b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long ucln = gcd(a, b);
            long bcnn = (a * b) / ucln;
            System.out.println(bcnn + " " + ucln);
        }
    }
}
