package java_code_ptit.J08015;

import java.util.Scanner;

public class J08015 {
    public static long k, n, cnt;

    public static void result(int[] x, long[] a){
        long count = 0;
        long sum = 0;
        for(int i = 1; i <= n; i++){
            if(x[i] == 1){
                count++;
                sum += a[i];
            }
        }

        if(sum == k && count == 2){
            cnt++;
        }
    }    

    public static void Try(int i, int[] x, long[] a){
        for(int j = 0 ; j <= 1 ; j++){
            x[i] = j;
        if(i == n)
            result(x, a);
        else
            Try(i+1, x, a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextLong();
            k = sc.nextLong();
            cnt = 0;
            long[] a = new long[(int) n + 1];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextLong();
            }
            int[] x = new int[(int) n + 1];
            Try(1, x, a);
            System.out.println(cnt);
        }
        sc.close();
    }
}
// 4
// 4 6
// 1 5 7 -1
// 5 6
// 1 5 7 -1 5
// 4 2
// 1 1 1 1
// 13 11
// 10 12 10 15 -1 7 6 5 4 2 1 1 1