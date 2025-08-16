package java_code_ptit.J07050;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07050 {
    public static void main(String[] args) throws FileNotFoundException{
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = sc.nextInt();
        ArrayList<Mat_hang> mh = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            sc.nextLine();
            Mat_hang a = new Mat_hang("MH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            mh.add(a);
        }

        Collections.sort(mh, new Comparator<Mat_hang>() {
            public int compare(Mat_hang mh1, Mat_hang mh2){
                if(mh1.loi_nhuan() < mh2.loi_nhuan()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });

        for(Mat_hang x : mh){
            System.out.println(x);
        }
    }
}
