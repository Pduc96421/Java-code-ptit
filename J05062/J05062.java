package java_code_ptit.J05062;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().trim().split("\\s+");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        ArrayList<sinhVien> sv = new ArrayList<>();
        ArrayList<Double> diemHb = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            String ten = sc.nextLine();
            String[] x = sc.nextLine().trim().split("\\s+");
            double gpa = Double.parseDouble(x[0]);
            int drl = Integer.parseInt(x[1]);
            sinhVien a = new sinhVien(ten, gpa, drl);
            sv.add(a);
            diemHb.add(gpa);
        }

        Collections.sort(diemHb, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                if(o1 < o2) return 1;
                else return -1;
            }
        });

        double diem_chuan = diemHb.get(m - 1);
        for(sinhVien  x : sv){
            if(x.getGpa() < diem_chuan) x.setLoaiHb("KHONG");
        }
        for(sinhVien x : sv){
            System.out.println(x);
        }
    }
}
