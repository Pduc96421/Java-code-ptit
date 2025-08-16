package java_code_ptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] x = s.split("\\s+");
            BigInteger a = new BigInteger(x[0]);
            BigInteger b = new BigInteger(x[1]);
            BigInteger ans1 = a.mod(b);
            BigInteger ans2 = b.mod(a);
            String res = "0";
            BigInteger ans = new BigInteger(res);
            if(ans.compareTo(ans1) == 0 || ans.compareTo(ans2) == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            sc.close();
        }
    }
}
