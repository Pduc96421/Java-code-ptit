package java_code_ptit.J05012;

public class matHang {
    private String maMh, tenMh;
    private int soluong;
    private long don_gia, chiet_khau;


    public matHang(String maMh, String tenMh, int soluong, long don_gia, long chiet_khau){
        this.maMh = maMh;
        this.tenMh = tenMh;
        this.soluong = soluong;
        this.don_gia = don_gia;
        this.chiet_khau = chiet_khau;
    }

    public long tong(){
        return this.don_gia * this.soluong - this.chiet_khau;
    }

    public String toString(){
        return this.maMh + " " + this.tenMh + " " + this.soluong + " " + this.don_gia + " " + this.chiet_khau + " " + tong();
    }
}
