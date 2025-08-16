package java_code_ptit.J05019;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class J05019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<luongMua> lm = new ArrayList<>();
        HashSet<String> se = new HashSet<>();
        int cnt = 1;
        for(int i = 1; i <= n; i++){
            String tenTram = sc.nextLine();
            String begin = sc.nextLine();
            String end = sc.nextLine();
            int luongmua = Integer.parseInt(sc.nextLine());
            if(!se.contains(tenTram)){
                se.add(tenTram);
                luongMua a = new luongMua("T" + String.format("%02d", cnt), tenTram);
                String[] x = begin.trim().split(":");
                String[] y = end.trim().split(":");
                long thoigian = Long.parseLong(y[0]) * 60 + Long.parseLong(y[1]) - Long.parseLong(x[0]) * 60 - Long.parseLong(x[1]);
                a.setThoi_gian(thoigian / 60.0 + a.getThoi_gian());
                a.setLuong_mua(luongmua + a.getLuong_mua());
                lm.add(a);
                cnt++;
            }
            else{
                String[] x = begin.trim().split(":");
                String[] y = end.trim().split(":");
                long thoigian = Long.parseLong(y[0]) * 60 + Long.parseLong(y[1]) - Long.parseLong(x[0]) * 60 - Long.parseLong(x[1]);
                for(luongMua a : lm){
                    if(tenTram.equals(a.getTenTram())){
                        a.setThoi_gian(thoigian / 60.0 + a.getThoi_gian());
                        a.setLuong_mua(luongmua + a.getLuong_mua());
                        break;
                    }
                }
            }
        }
        for(luongMua a : lm){
            System.out.println(a);
        }
    }
}
