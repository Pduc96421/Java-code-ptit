package java_code_ptit.J05012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<matHang> mh = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            matHang a = new matHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            mh.add(a);
        }

        Collections.sort(mh, new Comparator<matHang>() {
            @Override
            public int compare(matHang o1, matHang o2) {
                if(o1.tong() < o2.tong()) return 1;
                else return -1;
            }
        });

        for(matHang x : mh){
            System.out.println(x);
        }
    }
}
