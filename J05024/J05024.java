package java_code_ptit.J05024;

import java.util.ArrayList;
import java.util.Scanner;

public class J05024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Sinh_vien> sv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Sinh_vien a = new Sinh_vien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(a);
        }
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String nganh = sc.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh + ":");
            String[] x = nganh.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            sb.append(x[0].charAt(0));
            sb.append(x[1].charAt(0));
            for(Sinh_vien a : sv){
                if(a.getma().contains(sb.toString())){
                    if(sb.toString().equals("CN") || sb.toString().equals("AT")){
                        if(a.getlop().charAt(0) != 'E') System.out.println(a);
                    }
                    else System.out.println(a);
                }
            }
        }
        sc.close();
    }
}
// 4
// B16DCCN011
// Nguyen Trong Duc Anh
// D16CNPM1
// sv1@stu.ptit.edu.vn
// B15DCCN215
// To Ngoc Hieu
// D15CNPM3
// sv2@stu.ptit.edu.vn
// B15DCKT150
// Nguyen Ngoc Son
// D15CQKT02-B
// sv3@stu.ptit.edu.vn
// B15DCKT199
// Nguyen Trong Tung
// D15CQKT02-B
// sv4@stu.ptit.edu.vn
// 1
// Ke toan