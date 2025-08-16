package java_code_ptit.J07060;

public class lichThi {
    private String maCt, maMon, maNhom;
    private int soSv;
    public String ngay_thi, gio_thi, phong_thi, ten_mon;

    public lichThi(String maCt, String maMon, String maNhom, int soSv){
        this.maCt = maCt;
        this.maMon = maMon;
        this.maNhom = maNhom;
        this.soSv = soSv;
    }

    public String getMaCt(){
        return maCt;
    }

    public String getMaMon(){
        return maMon;
    }

    public void thoigian(String ngay_thi, String gio_thi, String phong_thi){
        this.ngay_thi = ngay_thi;
        this.gio_thi = gio_thi;
        this.phong_thi = phong_thi;
    }

    public String chuanHoa_ngay(){
        String[] x = this.ngay_thi.trim().split("/");
        StringBuilder sb = new StringBuilder();
        sb.append(x[2]);
        sb.append(x[1]);
        sb.append(x[0]);
        return sb.toString();
    }

    public void setTen_mon(String tenMon){
        this.ten_mon = tenMon;
    }

    public String toString(){
        return this.ngay_thi + " " + this.gio_thi + " " + this.phong_thi
        + " " + this.ten_mon + " " + this.maNhom + " " + this.soSv;
    }
}
