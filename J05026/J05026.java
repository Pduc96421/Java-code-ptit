package java_code_ptit.J05026;

import java.util.ArrayList;
import java.util.Scanner;

public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Giang_vien> gv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Giang_vien a = new Giang_vien("GV" + String.format("%02d", i), sc.nextLine(), sc.nextLine());
            gv.add(a);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String mon = sc.nextLine().toUpperCase();
            String[] a = mon.trim().split("\\s+");
            String ans = "";
            for(String x : a){
                ans += x.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + ans + ":");
            for(Giang_vien x : gv){
                if(x.chuanHoa().equalsIgnoreCase(ans)){
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}
// 3
// Nguyen Manh Son
// Cong nghe phan mem
// Vu Hoai Nam
// Khoa hoc may tinh
// Dang Minh Tuan
// An toan thong tin
// 1
// Cong nghe phan mem