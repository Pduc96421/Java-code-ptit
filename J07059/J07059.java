package java_code_ptit.J07059;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07059 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("CATHI.in");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Ca_thi> ct = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Ca_thi a = new Ca_thi("C" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ct.add(a);
        }
        Collections.sort(ct, new Comparator<Ca_thi>() {
            public int compare(Ca_thi ct1, Ca_thi ct2){
                if(ct1.ngayThi().compareTo(ct2.ngayThi()) != 0){
                    return ct1.ngayThi().compareTo(ct2.ngayThi());
                }
                else{
                    if(ct1.getgiothi().compareTo(ct2.getgiothi()) != 0){
                        return ct1.getgiothi().compareTo(ct2.getgiothi());
                    }
                    else return ct1.getma().compareTo(ct2.getma());
                }
            }
        });
        for(Ca_thi x : ct){
            System.out.println(x);
        }
        sc.close();
    }
}
// 2
// 09/01/2022
// 15:30
// 70172
// 09/01/2022
// 10:00
// 70279