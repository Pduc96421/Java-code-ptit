package java_code_ptit;

import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test = 1; test <= t; test++){
            int n = sc.nextInt();
            System.out.print("Test " + test + ": ");
            for(int i = 2; i <= Math.sqrt((n)); i++){
                if(n % i == 0){
                    int cnt = 0;
                    while(n % i == 0){
                        cnt++;
                        n = n / i;
                    }
                    System.out.print(i + "(" + cnt + ") ");
                }
            }
            if(n != 1){
                System.out.print(n + "(1)");
            }
            System.out.println();
        }
    }
}
