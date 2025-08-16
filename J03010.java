
package java_code_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J03010 {
    public static String chuan_hoa(String s){
        String[] a = s.trim().toLowerCase().split("\\s+");
        String res = a[a.length - 1];
        for(int i = 0; i < a.length - 1; i++){
            res += a[i].charAt(0);
        }
        return res;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = sc.nextInt();
        sc.nextLine();
        String[] res = new String[t + 1];
        for(int test = 1; test <= t; test++){
            String s = sc.nextLine();
            s = chuan_hoa(s);
            int cnt = 1;
            for(int i = 1; i < test; i++){
                if(s.contentEquals(res[i])) cnt++;
            }
            res[test] = s;
            String tmp = "";
            if(cnt > 1) tmp += cnt;
            System.out.println(s + tmp + "@ptit.edu.vn");
        }
        sc.close();
    }
}
