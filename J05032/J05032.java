package java_code_ptit.J05032;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Tuoi> t = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Tuoi a = new Tuoi(sc.nextLine());
            t.add(a);
        }
        Collections.sort(t, new Comparator<Tuoi>() {
            public int compare(Tuoi t1, Tuoi t2){
                return t2.ngaySinh().compareTo(t1.ngaySinh());
            }
        });
        int stt = 0;
        for(Tuoi x : t){
            if(stt == n - 1) System.out.println(x);
            if(stt == 0) System.out.println(x);
            stt++;
        }
        sc.close();
    }
}
// 5
// Nam 01/10/1991
// An 30/12/1990
// Binh 15/08/1993
// Tam 18/09/1990
// Truong 20/09/1990