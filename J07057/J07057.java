package java_code_ptit.J07057;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07057 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("THISINH.in");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Thi_sinh> ts = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Thi_sinh a = new Thi_sinh("TS" + String.format("%02d", i), sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ts.add(a);
        }
        Collections.sort(ts, new Comparator<Thi_sinh>() {
            public int compare(Thi_sinh ts1, Thi_sinh ts2){
                if(ts1.diemChuan() != ts2.diemChuan()){
                    if(ts1.diemChuan() < ts2.diemChuan()) return 1;
                    else return -1;
                }
                else return ts1.getma().compareTo(ts2.getma());
            }
        });
        for(Thi_sinh x : ts){
            System.out.println(x);
        }
        sc.close();
    }
}
// 2
// Nguyen  hong ngat
// 22
// Kinh
// 1
//   Chu thi MINh
// 14
// Dao
// 3