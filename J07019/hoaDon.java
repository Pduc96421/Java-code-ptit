package java_code_ptit.J07019;

public class hoaDon {
    private String maHd;
    private int so_luong;
    private String maSp, tenSp;
    private int loaiSp;
    private int gia;

    public hoaDon(String maHd, int so_luong){
        this.maHd = maHd;
        this.so_luong = so_luong;
        this.maSp = maHd.substring(0, 2);
        this.loaiSp = Integer.parseInt(maHd.substring(2, 3));
    }

    public String getMaSp(){
        return maSp;
    }

     public void setTenSp(String tenSp){
        this.tenSp = tenSp;
     }

     public void tinhtoan(int loai1, int loai2){
        if(this.loaiSp == 1) this.gia = loai1;
        else this.gia = loai2;
     }

     public double giamgia(){
        int thanhtien = this.so_luong * this.gia;
        if(this.so_luong >= 150) return thanhtien * 0.5;
        else if(this.so_luong >= 100) return thanhtien * 0.3;
        else if(this.so_luong >= 50) return thanhtien * 0.15;
        return 0;
     }

     public double tongtien(){
        return this.so_luong * this.gia - giamgia();
     }

     public String toString(){
        return this.maHd + " " + this.tenSp + " " + String.format("%.0f", giamgia()) + " " + String.format("%.0f", tongtien());
     }
}
