package java_code_ptit.J05007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Nhan_vien> nv = new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            Nhan_vien a = new Nhan_vien(String.format("%05d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            nv.add(a);
        }
        Collections.sort(nv, new Comparator<Nhan_vien>() {
            public int compare(Nhan_vien nv1, Nhan_vien nv2){
                return nv1.getNgaysinh().compareTo(nv2.getNgaysinh());
            }
        });
        for(Nhan_vien x : nv){
            System.out.println(x);
        }
        sc.close();
    }
}
