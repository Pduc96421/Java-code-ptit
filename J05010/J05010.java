package java_code_ptit.J05010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Mat_hang> mh = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            Mat_hang a = new Mat_hang(String.format("%01d", i), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            mh.add(a);
        }

        Collections.sort(mh, new SortMH());

        for(Mat_hang x : mh){
            System.out.println(x);
        }
        sc.close();
    }
}
// 3
// May tinh SONY VAIO
// Dien tu
// 16400
// 17699
// Tu lanh Side by Side
// Dien lanh
// 18300
// 25999
// Banh Chocopie
// Tieu dung
// 27,5
// 37