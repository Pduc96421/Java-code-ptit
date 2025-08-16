package java_code_ptit.J07046;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Luu_tru {
    private String mkh, ten, mp, ngay_den, ngay_di;

    public Luu_tru(String mkh, String ten, String mp, String ngay_den, String ngay_di){
        this.mkh = mkh;
        this.ten = ten;
        this.mp = mp;
        this.ngay_den = ngay_den;
        this.ngay_di = ngay_di;
    }

    public long so_ngay(){
        if(this.ngay_di.equals(this.ngay_den)) return 0;
        LocalDate a = LocalDate.parse(this.ngay_den.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate b = LocalDate.parse(this.ngay_di.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return ChronoUnit.DAYS.between(a, b);
    }

    public String toString(){
        return this.mkh + " " + this.ten + " " + this.mp + " " + so_ngay();
    }
}
