package java_code_ptit.J04009;

import java.util.Scanner;

public class J04009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Diem p1 = new Diem(sc.nextDouble(), sc.nextDouble());
            Diem p2 = new Diem(sc.nextDouble(), sc.nextDouble());
            Diem p3 = new Diem(sc.nextDouble(), sc.nextDouble());
            double a = p1.distance(p1, p2);
            double c = p2.distance(p2, p3);
            double b = p1.distance(p1, p3);
            if(a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a){
                double S = Math.sqrt((a + b + c) * (a + b - c ) * (-a + b + c) * (a - b + c)) * 1 / 4;
                double R = (a * b * c) / (4 * S);
                double ans = R * R * Math.PI; 
                System.out.printf("%.3f\n", ans);
            }
            else{
                System.out.println("INVALID");
            }
        }
        sc.close();
    }
}
