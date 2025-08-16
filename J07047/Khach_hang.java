package java_code_ptit.J07047;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Khach_hang {
    private String maKH, tenKH, maPhong, ngay_den, ngay_di;
    private double tongtien;

    public Khach_hang(String maKH, String tenKH, String maPhong, String ngay_den, String ngay_di){
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maPhong = maPhong;
        this.ngay_den = ngay_den;
        this.ngay_di = ngay_di;
    }

    public String kituloaiphong(){
        return this.maPhong.substring(2, 3).toUpperCase();
    }

    public long songay(){
        LocalDate checkin = LocalDate.parse(ngay_den, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate checkout = LocalDate.parse(ngay_di, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return ChronoUnit.DAYS.between(checkin, checkout);
    }

    public void settongtien(double tong_giangay){
        long ngay = songay();
        if(ngay == 0) ngay = 1;
        double ans = 0.0;
        if(ngay < 10) ans =  tong_giangay * ngay;
        else if(ngay < 20) ans = tong_giangay * ngay * 0.98;
        else if(ngay < 30) ans = tong_giangay * ngay * 0.96;
        else ans = tong_giangay * 0.94;
        this.tongtien = ans;
    }

    public String toString(){
        return this.maKH + " " + this.tenKH + " " + this.maPhong + " " + songay() + " " + String.format("%.2f", this.tongtien);
    }
}
