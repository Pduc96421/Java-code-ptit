package java_code_ptit.J07058;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class J07058 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Mon_thi> mt = new ArrayList<>();
        for(int i = 0; i < t; i++){
            Mon_thi a = new Mon_thi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            mt.add(a);
        }
        Collections.sort(mt, new Comparator<Mon_thi>() {
            public int compare(Mon_thi mt1, Mon_thi mt2){
                return mt1.getmaMon().compareTo(mt2.getmaMon());
            }
        });
        for(Mon_thi x : mt){
            System.out.println(x);
        }
        sc.close();
    }
}
