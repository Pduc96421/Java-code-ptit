package java_code_ptit.J05016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<khachHang> kh = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            khachHang a = new khachHang("KH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine(), Integer.parseInt(sc.nextLine()));
            kh.add(a);
        }

        Collections.sort(kh, new Comparator<khachHang>() {
            @Override
            public int compare(khachHang o1, khachHang o2) {
                if(o1.tong_tien() < o2.tong_tien()) return 1;
                else return -1;
            }
        });

        for(khachHang x : kh){
            System.out.println(x);
        }
    }
}
