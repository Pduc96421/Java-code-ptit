package java_code_ptit;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J03038 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new TreeSet<>();
        for (char x : s.toCharArray()) {
            set.add(x);
        }
        System.out.println(set.size());
    }
}
