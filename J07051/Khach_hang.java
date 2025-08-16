package java_code_ptit.J07051;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Khach_hang {
    private String mkh, ten, soPhong, ngay_nhan, ngay_tra;
    private long dichVu;

    public Khach_hang(String mkh, String ten, String soPhong, String ngay_nhan, String ngay_tra, long dichVu){
        this.mkh = mkh;
        this.ten = ten;
        this.soPhong = soPhong;
        this.ngay_nhan = ngay_nhan;
        this.ngay_tra = ngay_tra;
        this.dichVu = dichVu;
    }

    public String getten(){
        String[] a = this.ten.trim().split("\\s+");
        String ans = "";
        for(String x : a){
            ans += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return ans;
    }

    public long soNgay() {
        LocalDate a = LocalDate.parse(this.ngay_nhan.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate b = LocalDate.parse(this.ngay_tra.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return ChronoUnit.DAYS.between(a, b) + 1;
    }

    public long loi_nhuan() {
        long a = this.soPhong.trim().charAt(0) - '0';
        if(a == 1) return (long) 25 * soNgay() + this.dichVu;
        else if(a == 2) return (long) 34 * soNgay() + this.dichVu;
        else if(a == 3) return (long) 50 * soNgay() + this.dichVu;
        else return (long) 80 * soNgay() + this.dichVu;
    }

    public String toString(){
        return this.mkh + " " + getten() + " " + this.soPhong + " " + soNgay() + " " + loi_nhuan();
    }
}