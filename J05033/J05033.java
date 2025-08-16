package java_code_ptit.J05033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Thoi_gian> time = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Thoi_gian a = new Thoi_gian(sc.nextInt(), sc.nextInt(), sc.nextInt());
            time.add(a);
        }
        Collections.sort(time, new Sap_xep());
        for(Thoi_gian x : time){
            System.out.println(x);
        }
        sc.close();
    }
}
