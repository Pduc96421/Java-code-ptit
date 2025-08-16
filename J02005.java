package java_code_ptit;

import java.util.Scanner;
import java.util.TreeSet;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        TreeSet<Integer> A = new TreeSet<>(); 
        TreeSet<Integer> B = new TreeSet<>();
        for(int i = 0 ; i < a; i++){
            Integer x = sc.nextInt();
            A.add(x);
        }
        for(int i = 0; i < b; i++){
            Integer x = sc.nextInt();
            B.add(x);
        }
        A.retainAll(B);
        for(Integer x : A){
            System.out.print(x + " ");
        }
    }
}
