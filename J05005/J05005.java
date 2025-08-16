package java_code_ptit.J05005;

import java.util.*;

public class J05005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Sinh_vien> sv = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            Sinh_vien a = new Sinh_vien("B20DCCN" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            sv.add(a);
        }
        Collections.sort(sv, new Comparator<Sinh_vien>() {
            public int compare(Sinh_vien sv1, Sinh_vien sv2){
                if(sv1.getgpa() < sv2.getgpa()) return 1;
                else return -1;
            }
        });
        for(Sinh_vien x : sv){
            System.out.println(x);
        }
        sc.close();
    }
}
// 2
// ngUYen Van NaM
// D20DCCN01-B
// 2/12/1994
// 2,17
// Nguyen QuanG hAi
// D20DCCN02-B
// 1/9/1994
// 3,0