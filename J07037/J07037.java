package java_code_ptit.J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07037 {
    public static void main(String[] args) throws FileNotFoundException{
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        ArrayList<Doanh_nghiep> dn = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            sc.nextLine();
            Doanh_nghiep a = new Doanh_nghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            dn.add(a);
        }

        Collections.sort(dn, new Comparator<Doanh_nghiep>() {
            public int compare(Doanh_nghiep dn1, Doanh_nghiep dn2){
                return dn1.getmaDn().compareTo(dn2.getmaDn());
            }
        });

        for(Doanh_nghiep x : dn){
            System.out.println(x);
        }
        sc.close();
    }
}
