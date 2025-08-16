package java_code_ptit;

import java.util.Scanner;

public class J01001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 || b <= 0){
            System.out.println('0');
        }
        else{
            int dientich = a * b;
            int chuvi = 2 * (a + b);
            System.out.print(chuvi + " ");
            System.out.println(dientich);
        }
    }
}