package java_code_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeSet<Integer> se = new TreeSet<>();
        int[] a = new int[1005];
        while (sc.hasNext()) {
            int x = sc.nextInt();
            a[x]++;
            se.add(x);
        }
        for(int x : se){
            System.out.println(x + " " + a[x]);
        }
        sc.close();
    }
}
