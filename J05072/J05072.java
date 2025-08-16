package java_code_ptit.J05072;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<thanhPho> tp = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            thanhPho a = new thanhPho(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            tp.add(a);
        }

        int m = Integer.parseInt(sc.nextLine());
        ArrayList<cuocGoi> cg = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String thuebao = s[0];
            String begin = s[1];
            String end = s[2];
            cuocGoi a = new cuocGoi(thuebao, begin, end);
            if(thuebao.charAt(0) == '0'){
                for (thanhPho x : tp){
                    if(x.getMaVung().equals(thuebao.substring(1, 3))){
                        a.setTinh(x.getTenVung());
                        a.setGiaCuoc(x.getGiaCuoc());
                    }
                }
            }
            else{
                a.setTinh("Noi mang");
                a.setGiaCuoc(800);
            }
            cg.add(a);
        }

        Collections.sort(cg, new Comparator<cuocGoi>() {
            @Override
            public int compare(cuocGoi o1, cuocGoi o2) {
                if(o1.getGiaCuoc() < o2.getGiaCuoc()) return 1;
                else return -1;
            }
        });

        for(cuocGoi x : cg){
            System.out.println(x);
        }
    }
}
