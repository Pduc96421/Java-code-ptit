package java_code_ptit.J07028;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07028 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws FileNotFoundException{
        File file_MH = new File("MONHOC.in");
        File file_GV = new File("GIANGVIEN.in");
        File file_GC = new File("GIOCHUAN.in");

        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(file_MH);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Mon_hoc> mh = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String s = sc.nextLine();
            String x[] = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int j = 1; j < x.length; j++){
                sb.append(x[j]);
                sb.append(" ");
            }
            String tenMon = sb.toString();
            Mon_hoc a = new Mon_hoc(x[0], tenMon);
            mh.add(a);
        }

        sc = new Scanner(file_GV);
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Giang_vien> gv = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            String s = sc.nextLine();
            String x[] = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int j = 1; j < x.length; j++){
                sb.append(x[j]);
                sb.append(" ");
            }
            String tenGV = sb.toString();
            Giang_vien a = new Giang_vien(x[0], tenGV);
            gv.add(a);
        }

        sc = new Scanner(file_GC);
        int k = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= k; i++){
            String s = sc.nextLine();
            String x[] = s.trim().split("\\s+"); 
            Gio_chuan a = new Gio_chuan(x[0], x[1], Double.parseDouble(x[2]));
            for(Giang_vien y : gv){
                if(y.getmaGV().equals(x[0])){
                    y.settonggio(Double.parseDouble(x[2]) + y.gettonggio());
                }
            }
        }
        for(Giang_vien x : gv){
            System.out.println(x);
        }
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