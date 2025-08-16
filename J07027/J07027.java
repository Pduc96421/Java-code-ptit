package java_code_ptit.J07027;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class J07027 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws FileNotFoundException{
        File file_SV = new File("SINHVIEN.in");
        File file_BT = new File("BAITAP.in");
        File file_N = new File("NHOM.in");

        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(file_SV);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Sinh_vien> sv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Sinh_vien a = new Sinh_vien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(a);
        }

        sc = new Scanner(file_BT);
        int m = Integer.parseInt(sc.nextLine());
        HashMap<String, String> bt = new HashMap<>();
        for(int i = 1; i <= m; i++){
            String s = sc.nextLine();
            bt.put(i + "", s);
        }

        sc = new Scanner(file_N);
        HashMap<String, String> nhom = new HashMap<>();
        for(int i = 1; i <= n; i++){
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");
            nhom.put(x[0], x[1]);
        }

        Collections.sort(sv, new Comparator<Sinh_vien>() {
            public int compare(Sinh_vien o1, Sinh_vien o2){
                return o1.getmaSV().compareTo(o2.getmaSV());
            }   
        });

        for(Sinh_vien x : sv){
            System.out.print(x + " ");
            System.out.println(nhom.get(x.getmaSV()) + " " + bt.get(nhom.get(x.getmaSV())));
        }
        sc.close();
    }
}
// 5
// B17DTCN001
// Nguyen Chi  Linh
// 0987345543
// B17DTCN011
// Vu Viet Thang
// 0981234567
// B17DTCN023
// Pham Trong Thang
// 0992123456
// B17DTCN022
// Nguyen Van  Quyet
// 0977865432
// B17DTCN031
// Ngo Thanh Vien
// 0912313111
// 2
// Xay dung website ban dien thoai truc tuyen
// Xay dung ung dung quan ly benh nhan Covid-19
// B17DTCN001 1
// B17DTCN011 1
// B17DTCN023 1
// B17DTCN022 2
// B17DTCN031 2