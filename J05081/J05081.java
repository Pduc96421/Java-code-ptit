package java_code_ptit.J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Mat_hang> mh = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            sc.nextLine();
            Mat_hang a = new Mat_hang("MH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            mh.add(a);
        }
        Collections.sort(mh, new Sap_xep());
        for(Mat_hang x : mh){
            System.out.println(x);
        }
        sc.close();
    }
}
