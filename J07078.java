package java_code_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07078 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("STRING.in");

        Scanner sc = new Scanner(file);
//        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            for(int i = 0; i < s1.length() - s2.length() + 1; i++){
                if (s1.substring(i, s2.length() + i).equals(s2)){
                    System.out.print(String.format("%d", i + 1) + " ");
                }
//                System.out.println(s1.substring(i, s2.length() + i));
            }

            System.out.println();
        }

    }
}
