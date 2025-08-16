package java_code_ptit.J07010;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07010 {
    public static void main(String[] args) throws FileNotFoundException{
//        Scanner sc = new Scanner(new File("SV.in"));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Sin_vien> sv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Sin_vien a = new Sin_vien("B20DCCN" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            sv.add(a);
        }
        for(Sin_vien x : sv) {
            System.out.println(x);
        }
        sc.close();
    }
}
//1
//Nguyen Van An
//D20CQCN01-B
//2/12/2002
//3.19