package java_code_ptit.J07011;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07011 {
    public static void main(String[] args) throws FileNotFoundException {
        File vanban = new File("VANBAN.in");
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(vanban);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine().toLowerCase();
            String[] a = s.trim().split("[\\W]+");
            for(String x : a){
                if(map.containsKey(x)){
                    map.put(x, map.get(x) + 1);
                }
                else{
                    map.put(x, 1);
                }
            }
        }
        ArrayList<thongBao> tb = new ArrayList<>();
        for(String x : map.keySet()){
            thongBao a = new thongBao(x, map.get(x));
            tb.add(a);
        }
        Collections.sort(tb, new Comparator<thongBao>() {
            @Override
            public int compare(thongBao o1, thongBao o2) {
                if(o1.getSoluong() != o2.getSoluong()){
                    if(o1.getSoluong() < o2.getSoluong()) return 1;
                    else return -1;
                }
                else return o1.getChu().compareTo(o2.getChu());
            }
        });
        for(thongBao x : tb){
            System.out.println(x);
        }
    }
}
// 3
// PTIT duy tri hoc phi on dinh nam 2019 va khong tang trong nam 2020-2021 va 2021-2022!
// Khi dich benh xuat hien PTIT trich hon 6 ty dong ho tro sinh vien PTIT
// voi muc ho tro 500000 dong/sinh vien PTIT.