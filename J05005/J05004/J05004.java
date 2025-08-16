package java_code_ptit.J05005.J05004;

import java.util.ArrayList;
import java.util.Scanner;

public class J05004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Sinh_vien> sv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            Sinh_vien a = new Sinh_vien("B20DCCN" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            sv.add(a);
        }
        for(Sinh_vien x : sv){
            System.out.println(x);
        }
        sc.close();
    }
}
// 1
// nGuyEn  vaN    biNH
// D20CQCN01-B
// 2/12/2002
// 3,1