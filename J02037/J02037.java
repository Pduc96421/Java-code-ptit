package java_code_ptit.J02037;

import java.util.Scanner;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String a[] = s.trim().split("\\s+");
            int sum = a.length;
            int chan = 0;
            int le = 0;
            for(int i = 0; i < sum; i++){
                int x = Integer.parseInt(a[i]);
                if(x % 2 == 0) 
                    chan++;
                else 
                    le++;
            }
            if((sum % 2 == 0 && chan > le) || (sum % 2 != 0 && le > chan)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
