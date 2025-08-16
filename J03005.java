package java_code_ptit;

import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            String tmp = "";
            for (String x : a){
                for(int i = 0; i < x.length(); i++){
                    if( i == 0){
                        tmp += Character.toUpperCase(x.charAt(i)); 
                    }
                    else{
                        tmp += Character.toLowerCase(x.charAt(i));
                    }
                }
                tmp += " ";
            }
            String[] ans = tmp.split(" ");
            for(int i = 1; i < a.length - 1; i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println(ans[a.length - 1] + ", " + ans[0].toUpperCase());
        }
    }
}
