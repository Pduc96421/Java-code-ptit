package java_code_ptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine();
            BigInteger x = new BigInteger(s1);
            BigInteger y = new BigInteger("11");
            BigInteger ans = x.mod(y);
            if(ans.toString().compareTo("0") == 0) System.out.println("1");
            else System.out.println("0");
        }
        sc.close();
    }
}