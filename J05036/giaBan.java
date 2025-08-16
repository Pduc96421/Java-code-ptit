package java_code_ptit.J05036;

public class giaBan {
    private String maMh, tenMh, dvtinh;
    private int dongia_nhap, soluong;

    public giaBan(String maMh, String tenMh, String dvtinh, int dongia_nhap, int soluong){
        this.maMh = maMh;
        this.tenMh = tenMh;
        this.dvtinh = dvtinh;
        this.dongia_nhap = dongia_nhap;
        this.soluong = soluong;
    }

    public int phiVanchuyen(){
        return (int) Math.round((this.dongia_nhap * this.soluong) * 0.05);
    }

    public int thanhtien(){
        return (int) Math.round(this.dongia_nhap * soluong + phiVanchuyen());
    }

    public int giaban(){
        return (int) Math.round(thanhtien() + (0.02 * thanhtien()));
    }

    public String toString(){
        return this.maMh + " " + this.tenMh + " " + this.dvtinh + " " + phiVanchuyen() + " " + thanhtien() + " " + giaban();
    }
}
