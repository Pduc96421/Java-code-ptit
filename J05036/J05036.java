package java_code_ptit.J05036;

import java.util.ArrayList;
import java.util.Scanner;

public class J05036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        ArrayList<giaBan> db = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            giaBan a = new giaBan("MH" + String.format("%02d", i), sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            db.add(a);
        }

        for(giaBan x : db){
            System.out.println(x);
        }
    }
}
