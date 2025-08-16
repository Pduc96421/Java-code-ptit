package java_code_ptit.J07025;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07025 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("KHACHHANG.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Khach_hang> kh = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Khach_hang a = new Khach_hang("KH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kh.add(a);
        }

        Collections.sort(kh, new Comparator<Khach_hang>() {
            public int compare(Khach_hang kh1, Khach_hang kh2){
                return kh1.ngaysinh().compareTo(kh2.ngaysinh());
            }
        });

        for(Khach_hang x : kh){
            System.out.println(x);
        }
        sc.close();
    }
}
// 2
//  nGuyen VAN     nAm
// Nam
// 12/12/1997
// Mo Lao-Ha Dong-Ha Noi
//  TRan    vAn     biNh
// Nam
// 14/11/1995
// Phung Khoang-Nam Tu Liem-Ha Noi