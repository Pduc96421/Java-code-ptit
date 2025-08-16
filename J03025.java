package java_code_ptit;

import java.util.Scanner;

public class J03025 {
    public static boolean check(String s){
        int cnt = 0;
        for (int i = 0 ; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                cnt++;
        }
        return cnt == 1 || (cnt == 0 && s.length() % 2 == 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
/* 
3
abccaa
abbcca
abcda
*/
