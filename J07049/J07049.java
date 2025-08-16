package java_code_ptit.J07049;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07049 {
    public static void main(String[] args) throws FileNotFoundException  {
        File file_mh = new File("MUAHANG.in");

//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(file_mh);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sanPham> sp = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sanPham a = new sanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            sp.add(a);
        }

        int m = Integer.parseInt(sc.nextLine());
        ArrayList<khanhHang> kh = new ArrayList<>();
        for (int i = 1; i <= m; i++){
            khanhHang a = new khanhHang("KH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
            kh.add(a);
        }

        for (khanhHang x : kh){
            for (sanPham y : sp){
                if (x.getMaSp().equals(y.getMaSp())){
                    x.tinhtoan(y.getGiaban());
                    x.setHet_han(y.getBaohanh());
                }
            }
        }

        Collections.sort(kh, new Comparator<khanhHang>() {
            @Override
            public int compare(khanhHang o1, khanhHang o2) {
                if (o1.sapxep().compareTo(o2.sapxep()) != 0){
                    return o1.sapxep().compareTo(o2.sapxep());
                }
                else{
                    return o1.getMaKh().compareTo(o2.getMaKh());
                }
            }
        });

        for (khanhHang x : kh){
            System.out.println(x);
        }
  
        sc.close();
    }
}
// 2
// KC740
// May khoan KC1
// 39
// 18
// KC742
// May cat KC2
// 46
// 12
// 2
// Le Ngoc Long
// Hoang Mai
// KC740
// 11
// 21/05/2009
// Nguyen Sao Mai
// Hoan Kiem
// KC742
// 17
// 06/02/2009
