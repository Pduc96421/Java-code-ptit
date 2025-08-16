package java_code_ptit;

import java.util.Scanner;
import java.util.TreeSet;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        TreeSet<Integer> n = new TreeSet<>();
        TreeSet<Integer> m = new TreeSet<>();
        for(int i = 0; i < a; i++){
            Integer x = sc.nextInt();
            n.add(x);
        }
        for(int i = 0; i < b; i++){
            Integer x = sc.nextInt();
            m.add(x);
        }
        n.addAll(m);
        for(Integer x : n){
            System.out.print(x + " ");
        }
    } 
}
