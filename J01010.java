package java_code_ptit;

import java.util.Scanner;

public class J01010 {
    public static double solve(long n){
        double ans = 0;
        double cnt = 0;
        while(n != 0){
            cnt++;
            long a = n % 10;
            if(a == 0 || a == 8 || a == 9){
                ans = 0 * Math.pow(10.0, cnt) + ans;
            }
            else if(a == 1){
                ans = 1 * Math.pow(10.0, cnt) + ans;
            }
            else{
                return 0;
            }
            n /= 10;
        }
        if(ans == 0){
            return 0;
        }
        else{
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            double anS = solve(n);
            if(anS == 0){
                System.out.println("INVALID");
            }
            else{
                System.out.printf("%.0f\n", anS / 10);
            }
        }
    }
}
