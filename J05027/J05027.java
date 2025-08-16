package java_code_ptit.J05027;

import java.util.ArrayList;
import java.util.Scanner;

public class J05027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Giang_vien> gv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Giang_vien a = new Giang_vien("GV" + String.format("%02d", i), sc.nextLine(), sc.nextLine());
            gv.add(a);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String tukhoa = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + tukhoa + ":");
            String ans = tukhoa.toUpperCase();
            for(Giang_vien x : gv){
                if(x.getten().contains(ans)){
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}
// 3
// Nguyen Manh Son
// Cong nghe phan mem
// Vu Hoai Nam
// Khoa hoc may tinh
// Dang Minh Tuan
// An toan thong tin
// 1
// aN