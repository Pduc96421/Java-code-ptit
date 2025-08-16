package java_code_ptit.J05015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<thiSinh> ts = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            thiSinh a = new thiSinh(sc.nextLine(), sc.nextLine(), sc.nextLine());
            ts.add(a);
        }
        Collections.sort(ts, new Comparator<thiSinh>() {
            @Override
            public int compare(thiSinh o1, thiSinh o2) {
                if(o1.time() > o2.time()) return 1;
                else return -1;
            }
        });
        for(thiSinh x : ts){
            System.out.println(x);
        }
    }
}
