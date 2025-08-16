package java_code_ptit.J04014;

import java.util.Scanner;

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Phan_so A = new Phan_so(sc.nextLong(), sc.nextLong());
            Phan_so B = new Phan_so(sc.nextLong(), sc.nextLong());
            Phan_so C = A.C(A, B);
            Phan_so D = A.D(A, B, C);
            System.out.print(C + " ");
            System.out.println(D);
        }
        sc.close();
    }
}
