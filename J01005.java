package java_code_ptit;

import java.util.Scanner;

public class J01005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            for(int i = 1; i < n; i++){
                double b = i * 1.0 / n;
                double ans = 1.0 * h * Math.sqrt(b);
                System.out.printf("%.6f ", ans);
            }
            System.out.println();
        }
    }
}
