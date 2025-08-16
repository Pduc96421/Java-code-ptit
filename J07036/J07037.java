package java_code_ptit.J07036;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07037 {
    public static void main(String[] args) throws FileNotFoundException{
        File file_sv = new File("SINHVIEN.in");
        File file_mh = new File("MONHOC.in");
        File file_bd = new File("BANGDIEM.in");
        
//        Scanner sc = new Scanner(System.in);
      Scanner sc = new Scanner(file_sv);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Sinh_vien> sv = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Sinh_vien a = new Sinh_vien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(a);
        }

      sc = new Scanner(file_mh);
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Mon_hoc> mh = new ArrayList<>();
        for (int i = 1; i<= m; i++) {
            Mon_hoc a = new Mon_hoc(sc.nextLine(), sc.nextLine(),sc.nextLine());
            mh.add(a);
        }

      sc = new Scanner(file_bd);
        int k = Integer.parseInt(sc.nextLine());
        ArrayList<Bang_diem> bd = new ArrayList<>();
        for(int i = 0; i < k; i++){
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");
            Bang_diem a = new Bang_diem(x[0], x[1], Double.parseDouble(x[2]));
            bd.add((a));
            for(Sinh_vien b : sv){
                if(x[0].equals(b.getmaSv())){
                    bd.get(i).setTenSv(b.gettenSv());
                    bd.get(i).setLop(b.getlop());
                    break;
                }
            }
            for(Mon_hoc b : mh){
                if(x[1].equals(b.getMaMh())){
                    bd.get(i).setTenMh(b.getTenMh());
                }
            }
        }

        Collections.sort(bd, new Comparator<Bang_diem>() {
            @Override
            public int compare(Bang_diem o1, Bang_diem o2) {
                if(o1.getMaMh().compareTo(o2.getMaMh()) != 0){
                    return o1.getMaMh().compareTo(o2.getMaMh());
                }
                else{
                    return o1.getMaSv().compareTo(o2.getMaSv());
                }
            }
        });

        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String lop = sc.nextLine();
            System.out.println("BANG DIEM lop " + lop + ":");
            for(Bang_diem x : bd){
                if(lop.equals(x.getLop())){
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}
//2
//B15DCKT150
//NGUYEN NGOC SON
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//NguyeN   TrONg Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//2
//INT1155
//Tin hoc co so 2
//2
//SKD1103
//Ky nang tao lap Van ban
//1
//2
//B15DCKT150 INT1155 8.5
//B15DCKT150 SKD1103 9
//1
//D15CQKT02-B