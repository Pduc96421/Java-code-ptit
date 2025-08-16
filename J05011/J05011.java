package java_code_ptit.J05011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Game_thu> gt = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Game_thu a = new Game_thu(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            gt.add(a);
        }
        Collections.sort(gt, new Comparator<Game_thu>() {
            public int compare(Game_thu gt1, Game_thu gt2){
                if(gt1.so_phut() < gt2.so_phut()) return 1;
                else return -1;
            }
        });
        for(Game_thu x : gt){
            System.out.println(x);
        }
        sc.close();
    }
}
// 3
// 01T
// Nguyen Van An
// 09:00
// 10:30
// 06T
// Hoang Van Nam
// 15:30
// 18:00
// 02I
// Tran Hoa Binh
// 09:05
// 10:00