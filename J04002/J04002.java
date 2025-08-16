package java_code_ptit.J04002;

import java.util.Scanner;

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double chieu_dai = sc.nextDouble();
        double chieu_rong = sc.nextDouble();
        String color = sc.next();
        if(chieu_dai <= 0 || chieu_rong <= 0){
            System.out.println("INVALID");
        }
        else{
            hcn a = new hcn(chieu_dai, chieu_rong, color);
            System.out.print((int)a.chu_vi() + " " + (int)a.dien_tich() + " " + a.chuan_hoa(color));
        }
        sc.close();
    }
}
