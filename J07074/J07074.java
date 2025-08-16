package java_code_ptit.J07074;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07074 {
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

        String maMON = sc.nextLine();
        for(Mon_hoc x : mh){
            if(x.getmaMon().equals(maMON)){
                System.out.println("LICH GIANG DAY MON " + x.gettenMon() + ":");
                break;
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

        for(Lich_giang_day x : lgd){
            if(x.getmaMon().equals(maMON)){
                System.out.println(x);
            }
        }
        sc.close();
    }
}
// 2
// INT1155
// Tin hoc co so 2
// 2
// INT13162
// Lap trinh voi Python
// 3
// 4
// INT13162
// 5
// 1
// Nguyen Hoang Anh
// 102-A2
// INT1155
// 3
// 1
// Nguyen Dinh Hien
// 201A-A3
// INT1155
// 4
// 1
// Nguyen Quy Sy
// 201A-A3
// INT1155
// 5
// 1
// Tran Quy Nam
// 201A-A3
// INT1155