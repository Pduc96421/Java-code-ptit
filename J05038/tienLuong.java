package java_code_ptit.J05038;

public class tienLuong {
    private String maNv, tenNv, chuc_vu;
    private int ngay_cong, luong_ngay;

    public tienLuong(String maNv, String tenNv, int luong_ngay, int ngay_cong, String chuc_vu){
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.luong_ngay = luong_ngay;
        this.ngay_cong = ngay_cong;
        this.chuc_vu = chuc_vu;
    }

    public int luong_thang(){
        return this.luong_ngay * this.ngay_cong;
    }

    public int thuong(){
        if(this.ngay_cong >= 25) return (int) (luong_thang() * 0.2);
        else if(this.ngay_cong >= 22) return (int) (luong_thang() * 0.1);
        else return 0;
    }

    public int phu_cap(){
        if(this.chuc_vu.equals("GD")) return 250000;
        else if(this.chuc_vu.equals("PGD")) return 200000;
        else if(this.chuc_vu.equals("TP")) return 180000;
        else return 150000;
    }

    public int tong(){
        return luong_thang() + thuong() + phu_cap();
    }

    public String toString(){
        return this.maNv + " " + this.tenNv + " " + luong_thang() + " " + thuong() + " " + phu_cap() + " " + tong();
    }
}
