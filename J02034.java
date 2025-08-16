package java_code_ptit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> a = new HashSet<>();
        int Max = (int) -1e9;
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            Max = Math.max(x, Max);
            a.add(x);
        }
        if(Max == a.size()){
            System.out.println("Excellent!");
        }
        else{
            for (int i = 1; i <= Max; i++){
                if (!a.contains(i)){
                    System.out.println(i);
                }
            }
        }
    }
}
