package java_code_ptit.J07021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true){
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            if(s.compareTo("END") == 0) break;
            for(String x : a){
                System.out.print(x.substring(0, 1).toUpperCase());
                System.out.print(x.substring(1).toLowerCase() + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
