package java_code_ptit;

import java.util.Scanner;

public class J03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            boolean ok = true;
            int cnt = 0;
            for (int i = 0; i < s.length(); i++){
                char x = s.charAt(i);
                if(!Character.isDigit(x)){
                    ok = false;
                    break;
                }
                else {
                    int a = Character.getNumericValue(x);
                    if(a % 2 == 0) cnt++;
                    else cnt--;
                }
            }
            if(!ok) System.out.println("INVALID");
            else{
                if((s.length() % 2 == 0 && cnt > 0) || (s.length() % 2 == 1 && cnt < 0)) 
                    System.out.println("YES");
                else 
                    System.out.println("NO");
            }
        }
    }
}
