package java_code_ptit.J05030;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Bang_diem> bd = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            Bang_diem a = new Bang_diem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            bd.add(a);
        }
        Collections.sort(bd, new Comparator<Bang_diem>() {
            public int compare(Bang_diem bd1, Bang_diem bd2){
                return bd1.getten().compareTo(bd2.getten());
            }
        });
        int stt = 1;
        for(Bang_diem x : bd){
            System.out.print(stt + " ");
            stt++;
            System.out.println(x);
        }
        sc.close();
    }
}
// 3
// B20DCCN999
// Nguyen Van An
// D20CQCN04-B
// 10,0
// 9,0
// 8,0
// B20DCAT001
// Le Van Nam
// D20CQAT02-B
// 6,0
// 6,0
// 4,0
// B20DCCN111
// Tran Hoa Binh
// D20CQCN04-B
// 9,0
// 5,0
// 6,0