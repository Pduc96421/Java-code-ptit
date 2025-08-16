package java_code_ptit.J04001;

import java.util.Scanner;

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Diem a = new Diem(sc.nextDouble(), sc.nextDouble());
            Diem b = new Diem(sc.nextDouble(), sc.nextDouble());
            System.out.printf("%.4f\n", a.distance(b));
            System.out.printf("%.4f\n", a.distance1(a, b));
        }
        sc.close();
    }
}
