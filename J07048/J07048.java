package java_code_ptit.J07048;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07048 {
    public static void main(String[] args) throws FileNotFoundException{
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = sc.nextInt();
        ArrayList<San_pham> sp = new ArrayList<>();

        for(int i = 1; i <= t; i++){
            sc.nextLine();
            San_pham a = new San_pham(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sp.add(a);
        }
        Collections.sort(sp, new Sap_xep());
        for(San_pham x : sp){
            System.out.println(x);
        }
        sc.close();
    }
}
