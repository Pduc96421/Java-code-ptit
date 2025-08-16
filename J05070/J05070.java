package java_code_ptit.J05070;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Clb> clb = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Clb a = new Clb(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            clb.add(a);
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            String maTrandau = a[0];
            String maClb = a[0].substring(1, 3);
            int soluong = Integer.parseInt(a[1]);
            for(Clb x : clb){
                if(maClb.equals(x.getmaClb())){
                    int ans = soluong * x.getgiave();
                    x.setdoanhthu(ans);
                    x.setmaTrandau(maTrandau);
                }
            }
        }
        Collections.sort(clb, new Comparator<Clb>() {
            public int compare(Clb c1, Clb c2){
                if(c1.getdoanhthu() != c2.getdoanhthu()){
                    if(c1.getdoanhthu() < c2.getdoanhthu()){
                        return 1;
                    }
                    else {
                        return -1;
                    }
                }
                else{
                    return c1.gettenClb().compareTo(c2.getmaClb());
                }
            }
        });
        for(Clb x : clb){
            System.out.println(x);
        }
        sc.close();
    }
}
// 2
// AC
// AC Milan
// 12
// MU
// Manchester United
// 10
// 2
// IAC1 80000
// EMU2 60000