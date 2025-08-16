package java_code_ptit.J05038;

import java.util.ArrayList;
import java.util.Scanner;

public class J05038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<tienLuong> tl = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            tienLuong a = new tienLuong("NV" + String.format("%02d", i), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            tl.add(a);
        }

        int sum = 0;
        for(tienLuong x : tl){
            sum += x.tong();
            System.out.println(x);
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
