package java_code_ptit.J07020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07020 {
    public static void main(String[] args) throws FileNotFoundException {
        File file_kh = new File("KH.in");
        File file_mh = new File("MH.in");
        File file_hd = new File("HD.in");
        
        Scanner sc = new Scanner(file_kh);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Khach_hang> kh = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Khach_hang a = new Khach_hang("KH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kh.add(a);
        }

        sc = new Scanner(file_mh);
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Mat_hang> mh = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            Mat_hang a = new Mat_hang("MH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            mh.add(a);
        }

        sc = new Scanner(file_hd);
        int k = Integer.parseInt(sc.nextLine());
        ArrayList<Hoa_don> hd = new ArrayList<>();
        for(int i = 1; i <= k; i++){
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");
            String maKH = x[0];
            String maMH = x[1];
            int soluong = Integer.parseInt(x[2]);
            Hoa_don a = new Hoa_don("HD" + String.format("%03d", i), maKH, maMH, soluong);
            hd.add(a);
        }

        for(Hoa_don x : hd){
            System.out.print(x + " ");
            for(Khach_hang a : kh){
                if(a.getmakh().equals(x.getmaKH())){
                    System.out.print(a + " ");
                }
            }
            for(Mat_hang a : mh){
                if(a.getmaMH().equals(x.getmaMH())){
                    System.out.print(a + " ");
                    System.out.println( x.getsoluong() + " " + (a.getgiaban() * x.getsoluong()));
                }
            }
        }
        sc.close();
    }
}
// 2
// Nguyen Van Nam
// Nam
// 12/12/1997
// Mo Lao-Ha Dong-Ha Noi
// Tran Van Binh
// Nam
// 11/14/1995
// Phung Khoang-Nam Tu Liem-Ha Noi
// 2
// Ao phong tre em
// Cai
// 25000
// 41000
// Ao khoac nam
// Cai
// 240000
// 515000
// 3
// KH001 MH001 2
// KH001 MH002 3
// KH002 MH002 4