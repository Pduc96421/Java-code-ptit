package java_code_ptit.J06007;

import java.util.ArrayList;
import java.util.Scanner;

public class J06007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Mon_hoc> mh = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");
            String ma = x[0];
            StringBuilder sb = new StringBuilder();
            for(int j = 1; j < x.length; j++){
                sb.append(x[j]);
                sb.append(" ");
            }
            String ten = sb.toString();
            Mon_hoc a = new Mon_hoc(ma, ten);
            mh.add(a);
        }
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Giang_vien> gv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");
            String ma = x[0];
            StringBuilder sb = new StringBuilder();
            for(int j = 1; j < x.length; j++){
                sb.append(x[j]);
                sb.append(" ");
            }
            String ten = sb.toString();
            Giang_vien a = new Giang_vien(ma, ten);
            gv.add(a);
        } 
        int k = Integer.parseInt(sc.nextLine());
        ArrayList<Gio_day> gd = new ArrayList<>();
        for(int i = 1; i <= k; i++){
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");
            String maGV = x[0];
            String maMon = x[1];
            double gio = Double.parseDouble(x[2]);
            Gio_day a = new Gio_day(maGV, maMon, gio, gv);
            gd.add(a);
        }
        for(Gio_day x : gd){
            System.out.println(x);
        }
        sc.close();
    }
}
// 2
// INT1155 Tin hoc co so 2
// INT1306 Cau truc du lieu va giai thuat
// 2
// GV01 Nguyen Van An
// GV02 Hoang Binh Minh
// 2
// GV01 INT1155 113.2
// GV02 INT1306 126.72