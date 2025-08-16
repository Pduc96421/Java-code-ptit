package java_code_ptit.J05054;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05054 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("BANGDIEM.in");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        ArrayList<Trung_binh> tb = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            Trung_binh a = new Trung_binh("SV" + String.format("%02d", i),sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            tb.add(a);
        }
        Collections.sort(tb, new Comparator<Trung_binh>() {
            public int compare(Trung_binh o1, Trung_binh o2){
                if(o1.diemtb()<o2.diemtb()) return 1;
                if(o1.diemtb()>o2.diemtb()) return -1;
                return o1.getma().compareTo(o2.getma());
            }
        });
        tb.get(0).setxephang(1);
        System.out.println(tb.get(0));
        for(int i = 1; i < n; i++){
            if(tb.get(i).diemtb() == tb.get(i - 1).diemtb()){
                tb.get(i).setxephang(tb.get(i - 1).getxepthang());
            }
            else tb.get(i).setxephang(i + 1);
            System.out.println(tb.get(i)); 
        }
        sc.close();
    }
}
// 2
//  ha Thi kieu     anh
// 7
// 6
// 7
// Pham    THI  HAO
// 6
// 7
// 6