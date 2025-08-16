package java_code_ptit.J06008;

import java.util.ArrayList;
import java.util.Scanner;

public class J06008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Mon_hoc> mh = new ArrayList<>();
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
            Mon_hoc a = new Mon_hoc(ma, ten);
            mh.add(a);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Giang_vien> gv = new ArrayList<>();
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
            Giang_vien a = new Giang_vien(ma, ten);
            gv.add(a);
        }
        
        int k = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= k; i++){
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");
            String maGv = x[0];
            String maMh = x[1];
            double gio = Double.parseDouble(x[2]);
            for(Giang_vien a : gv){
                if(a.getma().equals(maGv)){
                    a.setgio(a.getgio() + gio);
                    for (Mon_hoc qhoa : mh) {
                        if (qhoa.getma().equals(maMh)) {
                            StringBuilder sb = new StringBuilder("");
                            sb.append(qhoa.getten());
                            sb.append(x[2]);
                            a.mh.add(sb.toString());
                            break;
                        }
                    }
                    break;
                }
            }
        }
        String maGv = sc.nextLine().trim();
        for(Giang_vien x : gv){
            if(maGv.equals(x.getma())){
                System.out.println("Giang vien: " + x.getten());
                for(String a : x.mh){
                    System.out.println(a);
                }
                System.out.println("Tong: " + String.format("%.2f", x.getgio()));
                break;
            }
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
// GV01