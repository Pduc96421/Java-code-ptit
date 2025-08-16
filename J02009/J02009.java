package java_code_ptit.J02009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Pair> p = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Pair a = new Pair(sc.nextInt(), sc.nextInt());
            p.add(a);
        }

        Collections.sort(p, new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2){
                if(p1.geta() > p2.geta()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });

        int ans = p.get(0).geta();
        for(int i = 0; i < n; i++){
            if(p.get(i).geta() >= ans){
                ans = p.get(i).geta() + p.get(i).getb();
            }
            else{
                ans += p.get(i).getb();
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
