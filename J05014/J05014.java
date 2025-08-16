package java_code_ptit.J05014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<giaoVien> gv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            giaoVien a = new giaoVien("GV" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            gv.add(a);
        }
        Collections.sort(gv, new Comparator<giaoVien>() {
            @Override
            public int compare(giaoVien o1, giaoVien o2) {
                if(o1.tong_dien() != o2.tong_dien()){
                    if(o1.tong_dien() < o2.tong_dien()) return 1;
                    else return -1;
                }
                else return o1.getMaGv().compareTo(o2.getMaGv());
            }
        });
        for(giaoVien x : gv){
            System.out.println(x);
        }
    }
}
