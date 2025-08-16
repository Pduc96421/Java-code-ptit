package java_code_ptit.J05028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Doanh_nghiep> dn = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            Doanh_nghiep a = new Doanh_nghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            dn.add(a);
        }
        Collections.sort(dn, new Comparator<Doanh_nghiep>() {
            public int compare(Doanh_nghiep dn1, Doanh_nghiep dn2){
                if(dn1.getsoSV() != dn2.getsoSV()){
                    if(dn1.getsoSV() < dn2.getsoSV()) return 1;
                    else return -1;
                }
                else return dn1.getma().compareTo(dn2.getma());
            } 
        });
        for(Doanh_nghiep x : dn){
            System.out.println(x);
        }
        sc.close();
    }
}
// 4
// VIETTEL
// TAP DOAN VIEN THONG QUAN DOI VIETTEL
// 40
// FSOFT
// CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
// 300
// VNPT
// TAP DOAN BUU CHINH VIEN THONG VIET NAM
// 200
// SUN
// SUN*
// 50