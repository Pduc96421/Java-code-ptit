package java_code_ptit.J07060;

public class caThi {
    private String maCt, ngay_thi, gio_thi, phong_thi;

    public caThi(String maCt, String ngay_thi, String gio_thi, String phong_thi){
        this.maCt = maCt;
        this.ngay_thi = ngay_thi;
        this.gio_thi = gio_thi;
        this.phong_thi = phong_thi;
    }

    public String getMaCt(){
        return maCt;
    }

    public String getNgay_thi(){
        return ngay_thi;
    }

    public String getGio_thi(){
        return gio_thi;
    }

    public String getPhong_thi(){
        return phong_thi;
    }

}
