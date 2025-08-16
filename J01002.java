package java_code_ptit;

import java.util.Scanner;

public class J01002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test != 0){
            long n = sc.nextLong();
            long tong = ((n + 1) * n) / 2;
            System.out.println(tong);
            test = test - 1;
        }
    }
}
