package java_code_ptit.J07049;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class khanhHang {
    private String maKh, tenKh, dc, maSp, ngay_mua, het_han;
    private int so_luong, tongTien;

    public khanhHang(String maKh, String tenKh, String dc, String maSp, int so_luong, String ngay_mua){
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.dc = dc;
        this.maSp = maSp;
        this.so_luong = so_luong;
        this.ngay_mua = ngay_mua;
    }

    public String getMaKh(){
        return maKh;
    }

    public String getMaSp(){
        return maSp;
    }

    public void tinhtoan(int giaban){
        this.tongTien += giaban * this.so_luong;
    }

    public void setHet_han(int baohanh){
        LocalDate mua = LocalDate.parse(this.ngay_mua, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate newDate = mua.plusMonths(baohanh);
        this.het_han = newDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String sapxep(){
        String[] s = this.het_han.trim().split("/");
        StringBuilder sb = new StringBuilder();
        sb.append(s[2]);
        sb.append(s[1]);
        sb.append(s[0]);
        return sb.toString();
    }

    public String toString(){
        return this.maKh + " " + this.tenKh + " " + this.dc + " " + this.maSp + " " + this.tongTien + " " + this.het_han;
    }
}
