package java_code_ptit.J07034;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07034 {
    public static void main(String[] args) throws FileNotFoundException{
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        ArrayList<Mon_hoc> mh = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            Mon_hoc a = new Mon_hoc(sc.nextLine(), sc.nextLine(),sc.nextInt());
            mh.add(a);   
        }

        Collections.sort(mh, new Comparator<Mon_hoc>() {
            public int compare(Mon_hoc mh1, Mon_hoc mh2){
                return mh1.getten().compareTo(mh2.getten());
            }
        });

        for(Mon_hoc x : mh){
            System.out.println(x);
        }
        sc.close();
    }
}
