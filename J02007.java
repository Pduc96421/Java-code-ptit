package java_code_ptit;

import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t = 1; t <= test; t++){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] dem = new int[100005];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                dem[a[i]]++;
            }
            System.out.println("Test " + t + ":");
            for(int i = 0; i < n; i++){
                if(dem[a[i]] != 0){
                    System.out.println(a[i] + " xuat hien " + dem[a[i]] + " lan");
                    dem[a[i]] = 0;
                }
            }
        }
        sc.close();
    }
}
