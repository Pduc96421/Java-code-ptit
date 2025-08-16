package java_code_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();
        while(s.length() >= 2){
            int n = s.length() / 2;
            BigInteger a = new BigInteger(s.substring(0, n));
            BigInteger b = new BigInteger(s.substring(n));
            BigInteger ans = a.add(b);
            s = ans.toString();
            System.out.println(s);
        }
        sc.close();
    }
}
