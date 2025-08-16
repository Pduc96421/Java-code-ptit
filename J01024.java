package java_code_ptit;

import java.util.Scanner;

public class J01024 {
    public static boolean check(String n){
        for(int i = 0; i < n.length(); i++){
            char b = n.charAt(i);
            if(b != '0' && b != '1' && b != '2'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String n = sc.nextLine();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
