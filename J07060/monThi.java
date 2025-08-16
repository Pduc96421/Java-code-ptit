package java_code_ptit.J07060;

public class monThi {
    private String maMon, tenMon, hinh_thuc_thi;

    public monThi(String maMon, String tenMon, String hinh_thuc_thi){
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinh_thuc_thi = hinh_thuc_thi;
    }

    public String getMaMon(){
        return maMon;
    }

    public String getTenMon(){
        return tenMon;
    }
}
