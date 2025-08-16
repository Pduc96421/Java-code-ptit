package java_code_ptit.J05021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sinh_vien> sv = new ArrayList<>();
        while(sc.hasNextLine()){
            Sinh_vien a = new Sinh_vien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(a);
        }
        Collections.sort(sv, new Comparator<Sinh_vien>() {
            public int compare(Sinh_vien sv1, Sinh_vien sv2){
                return sv1.getma().compareTo(sv2.getma());
            }
        });
        for(Sinh_vien x : sv){
            System.out.println(x);
        }
        sc.close();
    }
}
