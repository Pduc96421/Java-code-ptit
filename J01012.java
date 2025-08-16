package java_code_ptit;

import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int cnt = 0;
            for(int i = 1; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    int a = n / i;
                    if(i % 2 == 0) cnt++;
                    if(a % 2 == 0 && a != i) cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
