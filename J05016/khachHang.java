package java_code_ptit.J05016;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class khachHang {
    private String maKh, tenKh, so_phong, check_in, check_out;
    private int dich_vu;

    public khachHang(String maKh, String tenKh, String so_phong, String check_in, String check_out, int dich_vu){
        this.maKh = maKh;
        this.tenKh = tenKh.trim();
        this.so_phong = so_phong.trim();
        this.check_in = check_in;
        this.check_out = check_out;
        this.dich_vu = dich_vu;
    }

    public int don_gio(){
        int a = this.so_phong.charAt(0) - '0';
        if(a == 1) return  25;
        else if (a == 2) return 34;
        else if (a == 3) return 50;
        else return 80;
    }

    public long so_ngay(){
        LocalDate x = LocalDate.parse(this.check_in.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate y = LocalDate.parse(this.check_out.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return ChronoUnit.DAYS.between(x, y) + 1;
    }

    public long tong_tien(){
        return don_gio() * so_ngay() + this.dich_vu;
    }

    public String toString(){
        return this.maKh + " " + this.tenKh + " " + this.so_phong + " " + so_ngay() + " " + tong_tien();
    }
}
