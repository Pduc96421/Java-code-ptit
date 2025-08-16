package java_code_ptit;

import java.util.Scanner;

public class J01022 {
    public static String[] F = new String[93];

    public static void init(){
        F[0] = "0";
        F[1] = "1";
        for(int i = 2; i < 93; i++){
            F[i] = F[i - 2].concat(F[i - 1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(F[n].charAt(k - 1));
        }
    }
}
