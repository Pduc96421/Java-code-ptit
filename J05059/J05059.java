package java_code_ptit.J05059;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sinhVien> sv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sinhVien a = new sinhVien(sc.nextLine(), sc.nextLine(),Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            sv.add(a);
        }

        Collections.sort(sv, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if(o1.tong_diem() != o2.tong_diem()){
                    if (o1.tong_diem() < o2.tong_diem()) return 1;
                    else return -1;
                }
                else return o1.getMaTs().compareTo(o2.getMaTs());
            }
        });
        int k = Integer.parseInt(sc.nextLine());
        double diem_chuan = sv.get(k - 1).tong_diem();
        System.out.printf("%.1f\n", diem_chuan);
        for(sinhVien x : sv){
            System.out.print(x + " ");
            if(x.tong_diem() >= diem_chuan) System.out.println("TRUNG TUYEN");
            else System.out.println("TRUOT");
        }
    }
}
