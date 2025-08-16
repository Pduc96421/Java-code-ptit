package java_code_ptit.J08021;

import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Stack<Integer> st = new Stack<>();
        while (t -- > 0) {
            String s = sc.nextLine();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    st.push(i);
                }
                
            }
        }
    }
}
