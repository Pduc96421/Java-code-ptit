package java_code_ptit.J06002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J06002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<San_pham> sp = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            San_pham a = new San_pham(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            sp.add(a);
        }
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<Hoa_don> hh = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            Hoa_don a = new Hoa_don(sc.nextLine(), "-" + String.format("%03d", i), sp);
            hh.add(a);
        }

        Collections.sort(hh, new Comparator<Hoa_don>() {
            public int compare(Hoa_don hh1, Hoa_don hh2){
                if(hh1.tongtien() < hh2.tongtien()) return 1;
                else return -1;
            }
        });
        for(Hoa_don x : hh){
            System.out.println(x);
        }
        sc.close();
    }
}
// 2
// AT
// Ao thun
// 80000
// 45000
// QJ
// Quan Jean
// 220000
// 125000
// 2
// AT1 95
// QJ2 105