package java_code_ptit.J07052;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07052 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("THISINH.in");
        Scanner sc = new Scanner(file);

        int n = sc.nextInt();
        ArrayList<Thi_sinh> ts = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            Thi_sinh a = new Thi_sinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            ts.add(a);
        }

        Collections.sort(ts, new Comparator<Thi_sinh>() {
            public int compare(Thi_sinh ts1, Thi_sinh ts2){
                if(ts1.xet_tuyen() != ts2.xet_tuyen()){
                    if(ts1.xet_tuyen() < ts2.xet_tuyen()) return 1;
                    else return -1;
                }
                else{
                    return ts1.getma().compareTo(ts2.getma());
                }
            }
        });

        int chi_tieu = sc.nextInt();
        double diem_chuan = ts.get(chi_tieu - 1).xet_tuyen();
        System.out.println(String.format("%.1f", diem_chuan));
        for(Thi_sinh x : ts){
            System.out.print(x);
            if(x.xet_tuyen() >= diem_chuan){
                System.out.println("TRUNG TUYEN");
            }
            else{
                System.out.println("TRUOT");
            }
        }
        sc.close();
    }
}
