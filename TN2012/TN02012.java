package java_code_ptit.TN2012;

import java.util.ArrayList;
import java.util.Scanner;

public class TN02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<phongBan> pb = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String maPb = s[0];
            StringBuilder sb = new StringBuilder();
            for(int j = 1; j < s.length; j++){
                sb.append(s[j] + " ");
            }
            String tenPb = sb.toString();
            phongBan a = new phongBan(maPb, tenPb);
            pb.add(a);
        }

        int m = Integer.parseInt(sc.nextLine());
        ArrayList<nhanVien> nv = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            nhanVien a = new nhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            for(phongBan x : pb){
                if(x.getMaPb().equals(a.maPb())){
                    a.setTenPb(x.getTenPb());
                    break;
                }
            }
            nv.add(a);
        }

        for(nhanVien x : nv){
            System.out.println(x);
        }
    }
}
