package java_code_ptit.J02027;

import java.util.Scanner;

public class J02027 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n ; i++){
                a[i] = sc.nextInt();
            }
            int dem = 0;
            for(int i = 0; i < n - 1; i++){
                for(int j = i + 1; j < n; j++){
                    int x = Math.abs(a[i] - a[j]);
                    if(x < k) dem++;
                }
            }
            System.out.println(dem);
        }
        sc.close();
    }
}

