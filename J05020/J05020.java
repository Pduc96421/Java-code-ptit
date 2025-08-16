package java_code_ptit.J05020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Sinh_vien> sv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Sinh_vien a = new Sinh_vien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(a);
        }
        Collections.sort(sv, new Comparator<Sinh_vien>() {
            public int compare(Sinh_vien sv1, Sinh_vien sv2){
                if(sv1.getlop().compareTo(sv2.getlop()) != 0){
                    return sv1.getlop().compareTo(sv2.getlop());
                }
                else return sv1.getma().compareTo(sv2.getma());
            }
        });
        for(Sinh_vien x : sv){
            System.out.println(x);
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
// D15CQKT03-B
// sv4@stu.ptit.edu.vn