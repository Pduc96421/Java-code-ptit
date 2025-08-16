package java_code_ptit;

import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.next();
            String s2 = sc.next();
            if(s1.contentEquals(s2)) System.out.println("-1");
            else System.out.println(Math.max(s1.length(), s2.length()));
        }
    }
}
/*
2
abcd
defgh
a
a
*/