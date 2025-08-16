package java_code_ptit.J04005;

import java.util.Scanner;

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thi_sinh a = new Thi_sinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.print(a.getten() + " " + a.getbd() + " ");
        System.out.printf("%.1f",a.tong());
        sc.close();
    }
}
