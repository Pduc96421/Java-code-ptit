package java_code_ptit.J07051;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07051 {
    public static void main(String[] args) throws FileNotFoundException{
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        ArrayList<Khach_hang> kh = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            sc.nextLine();
            Khach_hang a = new Khach_hang("KH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLong());
            kh.add(a);
        }

        Collections.sort(kh, new Comparator<Khach_hang>() {
            public int compare(Khach_hang kh1, Khach_hang kh2){
                if(kh1.loi_nhuan() < kh2.loi_nhuan()) return 1;
                else return -1;
            } 
        });

        for(Khach_hang x : kh){
            System.out.println(x);
        }
        sc.close();
    }
}
