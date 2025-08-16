package java_code_ptit.J04008;

import java.util.Scanner;

public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            Diem p1 = new Diem(sc.nextDouble(), sc.nextDouble());
            Diem p2 = new Diem(sc.nextDouble(), sc.nextDouble());
            Diem p3 = new Diem(sc.nextDouble(), sc.nextDouble());
            double a = p1.distance(p1, p2);
            double b = p1.distance(p1, p3);
            double c = p2.distance(p2, p3);
            if(a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a){
                System.out.printf("%.3f",a + b + c);
            }
            else{
                System.out.print("INVALID");
            }
            System.out.println();
        }
        sc.close();
    }
}
