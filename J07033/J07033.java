package java_code_ptit.J07033;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07033 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        //Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Sinh_vien> sv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Sinh_vien a = new Sinh_vien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(a);
        }
        Collections.sort(sv, new Comparator<Sinh_vien>() {
            public int compare(Sinh_vien sv1, Sinh_vien sv2){
                return sv1.getmsv().compareTo(sv2.getmsv());
            }
        });

        for(Sinh_vien x : sv){
            System.out.println(x);
        }
        sc.close();
    }
}
