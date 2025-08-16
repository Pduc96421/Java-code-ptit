package java_code_ptit.J07075;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07075 {
    public static void main(String[] args) throws FileNotFoundException{
        File monhoc = new File("MONHOC.in");
        File lichgd = new File("LICHGD.in");

        Scanner sc = new Scanner(monhoc);
        ArrayList<Mon_hoc> mh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            Mon_hoc a = new Mon_hoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            mh.add(a);
        }
        sc = new Scanner(lichgd);
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Lich_giang_day> lgd = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            Lich_giang_day a = new Lich_giang_day("HP" + String.format("%03d", i), sc.nextLine(), Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            lgd.add(a);
        }

        for(Lich_giang_day x : lgd){
            for(Mon_hoc y : mh){
                if(x.getmaMon().equals(y.getmaMon())){
                    x.settenMon(y.gettenMon());
                }
            }
        }

        Collections.sort(lgd, new Comparator<Lich_giang_day>() {
            public int compare(Lich_giang_day o1, Lich_giang_day o2){
                if(o1.getthu() != o2.getthu()){
                    if(o1.getthu() > o2.getthu()) return 1;
                    else return -1;
                }
                else{
                    if(o1.getkip() != o2.getkip()){
                        if(o1.getkip() > o2.getkip()) return 1;
                        else return -1;
                    }
                    else{
                        return o1.gettenGV().compareTo(o2.gettenGV());
                    }
                }
            }
        });

        String tenGV = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + tenGV + ":");
        for(Lich_giang_day x : lgd){
            if(x.gettenGV().equals(tenGV)){
                System.out.println(x);
            }
        }
        sc.close();
    }
}
// 2
// INT1449
// Phat trien ung dung cho cac thiet bi di dong
// 3
// INT13162
// Lap trinh voi Python
// 3
// 3
// INT13162
// 5
// 4
// Nguyen Trong Khanh
// 102-A2
// INT1449
// 2
// 2
// Nguyen Hoang Anh
// 105-A2
// INT13162
// 5
// 1
// Nguyen Hoang Anh
// 102-A2
// Nguyen Hoang Anh