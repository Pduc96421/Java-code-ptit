package java_code_ptit;

import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int cnt = 0;
            String n = sc.nextLine();
            sc.close();
            for(char x : n.toCharArray()){
                if(x == '4' || x == '7'){
                    cnt++;
                }
            }
            if(cnt == 4 || cnt == 7) System.out.println("YES");
            else System.out.println("NO");
        }
    }
