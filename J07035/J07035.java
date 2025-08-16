package java_code_ptit.J07035;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07035 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws FileNotFoundException{
        File file_SV = new File("SINHVIEN.in");
        File file_MH = new File("MONHOC.in");
        File file_BD = new File("BANGDIEM.in");

        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(file_SV);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Sinh_vien> sv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Sinh_vien a = new Sinh_vien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(a);
        }

        sc = new Scanner(file_MH);
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Mon_hoc> mh = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            Mon_hoc a = new Mon_hoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            mh.add(a);
        }

        sc = new Scanner(file_BD);
        int k = Integer.parseInt(sc.nextLine());
        ArrayList<Bang_diem> bd = new ArrayList<>();
        for(int i = 1; i <= k; i++){
            String s = sc.nextLine();
            String x[] = s.trim().split("\\s+");
            Bang_diem a = new Bang_diem(x[0], x[1], Double.parseDouble(x[2]));
            bd.add(a);
        }

        Collections.sort(bd, new Comparator<Bang_diem>() {
            public int compare(Bang_diem o1, Bang_diem o2){
                if(o1.getdiem() != o2.getdiem()){
                    if(o1.getdiem() < o2.getdiem()) return 1;
                    else return -1;
                }
                else{
                    return o1.getmaSV().compareTo(o2.getmaSV());
                }
            }
        });

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            for(Mon_hoc x : mh){
                if(x.getmaMon().equals(s)){
                    System.out.println("BANG DIEM MON " + x.gettenMon() + ":");
                    break;
                }
            }
            for(Bang_diem x : bd){
                if(x.getmaMon().equals(s)){
                    for(Sinh_vien y : sv){
                        if(y.getmaSV().equals(x.getmaSV())){
                            System.out.println(y + " " + x);
                        }
                    }
                }
            }
        }
        sc.close();
    }
}
// 2
// B15DCKT150
// NGUYEN NGOC SON
// D15CQKT02-B
// sv3@stu.ptit.edu.vn
// B15DCKT199
// NguyeN   TrONg Tung
// D15CQKT02-B
// sv4@stu.ptit.edu.vn
// 2
// INT1155
// Tin hoc co so 2
// 2
// SKD1103
// Ky nang tao lap Van ban
// 1
// 2
// B15DCKT150 INT1155 8.5
// B15DCKT199 INT1155 9
// 1
// INT1155