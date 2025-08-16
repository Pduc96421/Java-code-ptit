package java_code_ptit.J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Hoc_sinh> hs = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            Hoc_sinh a = new Hoc_sinh("HS" + String.format("%02d", i), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            hs.add(a);
        }
        Collections.sort(hs, new Comparator<Hoc_sinh>() {
            public int compare(Hoc_sinh hs1, Hoc_sinh hs2){
                if(hs1.diemtb() != hs2.diemtb()){
                    if(hs1.diemtb() < hs2.diemtb()) return 1;
                    else return -1;
                }
                else return hs1.getma().compareTo(hs2.getma());
            }
        });
        for(Hoc_sinh x : hs){
            System.out.println(x);
        }
        sc.close();
    }
}
// 3
// Luu Thuy Nhi
// 9,3  9,0  7,1  6,5  6,2  6,0  8,2  6,7  4,8  5,5
// Le Van Tam
// 8,0  8,0  5,5  9,0  6,8  9,0  7,2  8,3  7,2  6,8
// Nguyen Thai Binh
// 9,0  6,4  6,0  7,5  6,7  5,5  5,0  6,0  6,0  6,0