package java_code_ptit.J07019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07019 {
    public static void main(String[] args) throws FileNotFoundException      {
        File data1 = new File("DATA1.in");
        File data2 = new File("DATA2.in");

//        Scanner sc = new Scanner(System.in);

        Scanner sc = new Scanner(data1);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sanPham> sp = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sanPham a = new sanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            sp.add(a);
        }

        sc = new Scanner(data2);
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<hoaDon> hd = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String maHd = s[0];
            hoaDon a = new hoaDon(maHd + "-" + String.format("%03d", i), Integer.parseInt(s[1]));
            for(sanPham x : sp){
                if(x.getMaSp().equals(a.getMaSp())){
                    a.setTenSp(x.getTenSp());
                    a.tinhtoan(x.getLoai1(), x.getLoai2());
                }
            }
            hd.add(a);
        }

        for(hoaDon x : hd){
            System.out.println(x);
        }
    }
}
