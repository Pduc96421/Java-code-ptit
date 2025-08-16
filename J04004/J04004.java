package java_code_ptit.J04004;

import java.util.Scanner;

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phan_so ps1 = new Phan_so(sc.nextLong(), sc.nextLong());
        Phan_so ps2 = new Phan_so(sc.nextLong(), sc.nextLong());
        ps1.add(ps1, ps2);
        sc.close();
    }
}
