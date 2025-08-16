package java_code_ptit.J07018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07018 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SINHVIEN.in");      
        Scanner sc = new Scanner(file);  
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Sinh_vien> sv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Sinh_vien a = new Sinh_vien("B20DCCN" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            sv.add(a);
        }
        for(Sinh_vien x : sv){
            System.out.println(x);
        }
        sc.close();
    }
}
