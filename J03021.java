
package java_code_ptit;

import java.util.Scanner;
import java.util.regex.Pattern;

public class J03021 {
        public static boolean isCodeValid(String code) {
        String studentCodePattern = "^[b]\\d{2}(dc)(cn|at)\\d{3}$";
        return Pattern.matches(studentCodePattern, code);
    }
    public static boolean isBillCode(String code) {
        String billCodePattern = "^[nx]\\d{2}(ptit)\\d{2,4}$";
        return Pattern.matches(billCodePattern, code);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code1 = scanner.nextLine();
        String code2 = scanner.nextLine();
        if(isBillCode(code1.toLowerCase()) || isCodeValid(code1.toLowerCase())) System.out.println("TRUE");
        else System.out.println("FALSE");
        if(isBillCode(code2.toLowerCase()) || isCodeValid(code2.toLowerCase())) System.out.println("TRUE");
        else System.out.println("FALSE");
    }
}
