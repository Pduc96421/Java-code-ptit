package java_code_ptit.J02035;

import java.util.Scanner;

public class J02035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n + 1];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextLong();
            }
            int ans = 0;
            for(int i = 1; i < n; i++){
                if(a[i] > a[i + 1]){
                    ans = i;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
