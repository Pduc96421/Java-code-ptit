package java_code_ptit.J07046;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07046 {
    public static void main(String[] args) throws FileNotFoundException{
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("KHACH.in"));  
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Luu_tru> lt = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Luu_tru a = new Luu_tru("KH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            lt.add(a);
        }

        Collections.sort(lt, new Comparator<Luu_tru>() {
            public int compare(Luu_tru lt1, Luu_tru lt2){
                if(lt1.so_ngay() < lt2.so_ngay()) return 1;
                else return -1;
            }
        });

        for(Luu_tru x : lt){
            System.out.println(x);
        }
        sc.close();
    }
}