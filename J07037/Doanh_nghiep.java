package java_code_ptit.J07037;

public class Doanh_nghiep {
    private String maDn, tenDn;
    private int soSv;

    public Doanh_nghiep (String maDn, String tenDn, int soSv){
        this.maDn = maDn;
        this.tenDn = tenDn;
        this.soSv = soSv;
    }

    public String getmaDn(){
        return maDn;
    }

    public String toString(){
        return this.maDn + " " + this.tenDn + " " + this.soSv;
    }
}
