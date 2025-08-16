package java_code_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> se = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            String[] a = s.trim().split("\\s+");
            for(String x : a){
                se.add(x);
            }
        }
        for(String x : se){
            System.out.println(x);
        }
        sc.close();
    }
}
