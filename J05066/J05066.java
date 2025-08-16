package java_code_ptit.J05066;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int GD = 1, TP = 3, PP = 3;
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<nhanVien> nv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String maNv = s[0];
            String chuc_vu = maNv.substring(0, 2);
            int soHieu = Integer.parseInt(maNv.substring(4));
            if((soHieu > 1 && chuc_vu.equals("GD")) || (soHieu > 3 && chuc_vu.equals("TP") || (soHieu > 3 && chuc_vu.equals("PP")))){
                chuc_vu = "NV";
            }
            String bac_luong = maNv.substring(2, 4);
            String so_hieu = maNv.substring(4, 7);
            StringBuilder sb = new StringBuilder();
            for(int j = 1; j < s.length; j++){
                sb.append(s[j] + " ");
            }
            String tenNv = sb.toString();
            nhanVien a = new nhanVien(tenNv, chuc_vu, bac_luong, so_hieu);
            nv.add(a);
        }

        Collections.sort(nv, new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien o1, nhanVien o2) {
                if(o1.getBac_luong().compareTo(o2.getBac_luong()) != 0){
                    return o2.getBac_luong().compareTo(o1.getBac_luong());
                }
                else{
                    return o1.getSo_hieu().compareTo(o2.getSo_hieu());
                }
            }
        });

        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String s = sc.nextLine().trim();
            for(nhanVien x : nv){
                if(x.getTenNv().toLowerCase().contains(s.toLowerCase())){
                    System.out.println(x);
                }
            }
            System.out.println();
        }
    }
}
