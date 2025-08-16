package java_code_ptit.J04012;

import java.util.Scanner;

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        int luongCB = sc.nextInt();
        int ngayCong = sc.nextInt();
        sc.nextLine();
        String chucVu = sc.nextLine();
        Nhan_vien a = new Nhan_vien(hoTen, luongCB, ngayCong, chucVu);
        System.out.println(a);
        sc.close();
    }
}
// Bui Thi Trang
// 45000
// 23
// PGD