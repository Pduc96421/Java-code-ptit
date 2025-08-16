package java_code_ptit.J05055;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05055 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("BANGDIEM.in");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        ArrayList<Sinh_vien> sv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            Sinh_vien a = new Sinh_vien("SV" + String.format("%02d", i), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            sv.add(a);
        }
        Collections.sort(sv, new Comparator<Sinh_vien>() {
            public int compare(Sinh_vien sv1, Sinh_vien sv2){
                if(sv1.diemTK() < sv2.diemTK()) return 1;
                else return -1;
            }
        });
        for(Sinh_vien x : sv){
            System.out.println(x);
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