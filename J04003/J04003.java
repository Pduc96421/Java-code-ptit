package java_code_ptit.J04003;

import java.util.Scanner;

public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phan_so a = new Phan_so(sc.nextLong(), sc.nextLong());
        a.rut_gon(a);
        sc.close();
    }
}
