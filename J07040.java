package java_code_ptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> s = (ArrayList<String>) in.readObject();

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        for(String x : s){
            String[] a = x.trim().toLowerCase().split("\\s+");
            for(String y : a){
                set1.add(y);
            }
        }

        while(sc.hasNext()){
            String a = sc.next().toLowerCase();
            set2.add(a);
        }

        for(String x : set2){
            if(set1.contains(x)) System.out.println(x);
        }
        sc.close();
    }
}
