package java_code_ptit;

import java.util.Scanner;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] S1 = s1.split("\\s+");
            String[] S2 = s2.split("\\s+");
            TreeSet<String> set1 = new TreeSet<>();
            TreeSet<String> set2 = new TreeSet<>();
            for (String x : S1){
                set1.add(x);
            }
            for(String x : S2){
                set2.add(x);
            }
            set1.removeAll(set2);
            for(String x : set1){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
