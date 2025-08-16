package java_code_ptit.J02023;

import java.util.Scanner;


public class J02023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        sc.close();
        if(s > n * 9 || (n > 1 && s == 0)){
            System.out.println("-1 -1");
            return ;
        }
        int s2 = s;

        // tim min
        s -= 1;
        int[] min_num = new int[n];
        for(int i = n - 1; i >= 0; i--){
            if(s >= 9){
                min_num[i] = 9;
                s -= 9;
            }
            else{
                min_num[i] = s;
                break;
            }
        }
        min_num[0] += 1;
        for(int x : min_num){
            System.out.print(x);
        }
        System.out.print(" ");

        // tim max
        int[] max_num = new int[n];
        for(int i = 0; i < n; i++){
            if(s2 >= 9){
                max_num[i] = 9;
                s2 -= 9;
            }
            else{
                max_num[i] = s2;
                break;
            }
        }

        // in
        for(int x : max_num){
            System.out.print(x);
        }
    }
}