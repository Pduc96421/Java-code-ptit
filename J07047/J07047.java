package java_code_ptit.J07047;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07047 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        // Scanner sc = new Scanner(System.in);
        Scanner sc  = new Scanner(file);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Khach_san> ks = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String s = sc.nextLine();
            String x[] = s.trim().split("\\s+");
            Khach_san a = new Khach_san(x[0], x[1], Double.parseDouble(x[2]), Double.parseDouble(x[3]));
            ks.add(a);
        }

        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Khach_hang> kh = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            Khach_hang a = new Khach_hang("KH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kh.add(a);
        }

        for(Khach_hang y : kh){
            for(Khach_san x : ks){
                if(y.kituloaiphong().equals(x.getkituloaiPhong())){
                    double tong_giangay = (x.getgiaNgay() * x.getphiPhucvu()) + x.getgiaNgay();
                    y.settongtien(tong_giangay);
                    break;
                }
            }
        }

        Collections.sort(kh, new Comparator<Khach_hang>() {
            public int compare(Khach_hang o1, Khach_hang o2){
                if(o1.songay() < o2.songay()) return 1;
                else return -1;
            }
        });

        for(Khach_hang x : kh){
            System.out.println(x);
        }
        sc.close();
    }
}
// 2
// C THUONG 150 0.03
// B VIP 200 0.05
// 2
// Nguyen Van Hoang
// 55B1
// 01/01/2021
// 05/01/2021
// Nguyen Trung Dung
// 04C6
// 01/01/2021
// 10/01/2021