package java_code_ptit;

import java.util.Scanner;

public class J02020 {
    public static int n, k;

    public static int[] x = new int[25];

    public static int cnt = 0;

    public static void xuat(){
        for(int i = 1; i <= k; i++){
            System.out.print(x[i]);
        }
        System.out.print(" ");
    }

    public static void Try(int i){
        for(int j = x[i - 1] + 1; j <= n - k + i; j++){
            x[i] = j;
            if(i == k){
                cnt++;
                xuat();
            }
            else Try(i + 1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println("\nTong cong co " + cnt + " to hop");
    }
}
