package java_code_ptit;
import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        double a, b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        b = scan.nextDouble();
        scan.close();
        if (a == 0) {
            if (b == 0) {
                System.out.println("VSN");
            } else System.out.println("VN");
        } else {
            double x = -b / a;
            System.out.printf("%.2f", x);
        }
    }
}
