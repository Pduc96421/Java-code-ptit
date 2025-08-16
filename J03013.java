/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_code_ptit;

/**
 *
 * @author ASUS
 */
import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            BigInteger res = (a.subtract(b)).abs(); 
            StringBuilder ans = new StringBuilder(res.toString());
            int tmp = Math.max(s1.length(), s2.length());
            if(tmp > ans.length()){
                ans.insert(0, "0");
            }
            System.out.println(ans);
        }
    }
}
