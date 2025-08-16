package java_code_ptit.J04018;

import java.util.Scanner;

public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            So_phuc A = new So_phuc(sc.nextInt(), sc.nextInt());
            So_phuc B = new So_phuc(sc.nextInt(), sc.nextInt());
            So_phuc C = (A.cong(B)).nhan(A);
            So_phuc D = (A.cong(B)).nhan(A.cong(B));
            System.out.println(C + ", " + D);
        }
        sc.close();
    }
}
