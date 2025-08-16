package java_code_ptit.J05025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Giang_vien> gv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Giang_vien a = new Giang_vien("GV" + String.format("%02d", i), sc.nextLine(), sc.nextLine());
            gv.add(a);
        }
        Collections.sort(gv, new Comparator<Giang_vien>() {
            public int compare(Giang_vien gv1, Giang_vien gv2){
                if(gv1.getten().compareTo(gv2.getten()) != 0){
                    return gv1.getten().compareTo(gv2.getten());
                }
                else return gv1.getma().compareTo(gv2.getma());
            }
        });
        for(Giang_vien x : gv){
            System.out.println(x);
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