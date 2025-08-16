package java_code_ptit.J05034;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Thuc_tap> tt = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Thuc_tap a = new Thuc_tap(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            tt.add(a);
        }
        Collections.sort(tt, new Comparator<Thuc_tap>() {
            public int compare(Thuc_tap tt1, Thuc_tap tt2){
                return tt1.getma().compareTo(tt2.getma());
            }
        });
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String truyvan = sc.nextLine();
            for(Thuc_tap x : tt){
                if(x.gettenDN().equalsIgnoreCase(truyvan)){
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}
// 6
// B17DCCN016 
// Le Khac Tuan Anh 
// D17HTTT2   
// test1@stu.ptit.edu.vn
// VIETTEL
// B17DCCN107 
// Dao Thanh Dat    
// D17CNPM5   
// test2@stu.ptit.edu.vn
// FPT
// B17DCAT092 
// Cao Danh Huy     
// D17CQAT04-B
// test3@stu.ptit.edu.vn
// FPT
// B17DCCN388 
// Cao Sy Hai Long  
// D17CNPM2   
// test4@stu.ptit.edu.vn
// VNPT
// B17DCCN461 
// Dinh Quang Nghia 
// D17CNPM2   
// test5@stu.ptit.edu.vn
// FPT
// B17DCCN554 
// Bui Xuan Thai    
// D17CNPM1   
// test6@stu.ptit.edu.vn
// GAMELOFT
// 1
// FPT