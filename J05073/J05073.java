package java_code_ptit.J05073;

import java.util.ArrayList;
import java.util.Scanner;

public class J05073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<giaBan> gb = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String maDh = s[0];
            int don_gia = Integer.parseInt(s[1]);
            int so_luong = Integer.parseInt(s[2]);
            giaBan a = new giaBan(maDh, don_gia, so_luong);
            gb.add(a);
        }

        for(giaBan x : gb){
            System.out.println(x);
        }
    }
}
