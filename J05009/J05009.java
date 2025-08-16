package java_code_ptit.J05009;

import java.util.ArrayList;
import java.util.Scanner;

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Thi_sinh> ts = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            Thi_sinh a = new Thi_sinh(String.format("%1d", i), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            ts.add(a);
        }
        double Max = 0.0;
        for(Thi_sinh x : ts){
            Max = Math.max(Max, x.tongDiem());
        }
        for(Thi_sinh x : ts){
            if(x.tongDiem() == Max){
                System.out.println(x);
            }
        }
        sc.close();
    }
}
// 3
// Nguyen Van A
// 12/12/1994
// 3,5
// 7,0
// 5,5
// Nguyen Van B
// 1/9/1994
// 7,5
// 9,5
// 9,5
// Nguyen Van C
// 6/7/1994
// 8,5
// 9,5
// 8,5