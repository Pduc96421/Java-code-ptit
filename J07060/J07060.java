package java_code_ptit.J07060;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07060 {
    public static void main(String[] args) throws FileNotFoundException {
        File file_mt = new File("MONTHI.in");
        File file_ct = new File("CATHI.in");
        File file_lt = new File("LICHTHI.in");

//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(file_mt);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<monThi> mt = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            monThi a = new monThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            mt.add(a);
        }
        sc = new Scanner(file_ct);
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<caThi> ct = new ArrayList<>();
        for (int i = 1; i <= m; i++){
            caThi a = new caThi("C" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ct.add(a);
        }
        sc = new Scanner(file_lt);
        int k = Integer.parseInt(sc.nextLine());
        ArrayList<lichThi> lt = new ArrayList<>();
        for (int i = 1; i <= k; i++){
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            String maCt = a[0];
            String maMon = a[1];
            String maNhom = a[2];
            int soSv = Integer.parseInt(a[3]);
            lichThi b = new lichThi(maCt, maMon, maNhom, soSv);
            lt.add(b);
        }

        for (lichThi x : lt){
            for (caThi y : ct){
                if (x.getMaCt().equals(y.getMaCt())){
                    x.thoigian(y.getNgay_thi(), y.getGio_thi(), y.getPhong_thi());
                }
            }
            for (monThi y : mt){
                if (x.getMaMon().equals(y.getMaMon())){
                    x.setTen_mon(y.getTenMon());
                }
            }
        }

        Collections.sort(lt, new Comparator<lichThi>() {
            @Override
            public int compare(lichThi o1, lichThi o2) {
                if(o1.chuanHoa_ngay().compareTo(o2.chuanHoa_ngay()) != 0){
                    return o1.chuanHoa_ngay().compareTo(o2.chuanHoa_ngay());
                }
                else{
                    if (o1.gio_thi.compareTo(o2.gio_thi) != 0){
                        return o1.gio_thi.compareTo(o2.gio_thi);
                    }
                    else{
                        return o1.getMaCt().compareTo(o2.getMaCt());
                    }
                }
            }
        });

        for (lichThi x : lt){
            System.out.println(x);
        }
    }
}

//2
//MUL1320
//Nhap mon da phuong tien
//Bai tap lon + Van dap truc tuyen
//BAS1203
//Giai tich 1
//Thi viet + Van dap truc tuyen
//2
//09/01/2022
//15:30
//70172
//09/01/2022
//10:00
//70279
//2
//C001 MUL1320 01 46
//C002 BAS1203 04 72

















