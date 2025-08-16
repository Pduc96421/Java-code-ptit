package java_code_ptit;

import java.util.Scanner;

public class J01018 {
    public static boolean ke_nhau(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 2){
                return false;
            }
        }
        return true;
    }

    public static boolean tong(String n){
        int sum = 0;
        for(int i = 0; i < n.length(); i++){
            char c = n.charAt(i);
            sum = sum + Character.getNumericValue(c);
        }
        if(sum % 10 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(ke_nhau(s) && tong(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

