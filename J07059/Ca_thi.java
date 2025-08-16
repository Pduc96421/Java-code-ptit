package java_code_ptit.J07059;

public class Ca_thi {
    private String ma, ngaythi, giothi, phongthi;

    public Ca_thi(String ma, String ngaythi, String giothi, String phongthi){
        this.ma = ma;
        this.ngaythi = ngaythi;
        this.giothi = giothi;
        this.phongthi = phongthi;
    }

    public String ngayThi(){
        String[] x = this.ngaythi.trim().split("/");
        StringBuilder sb = new StringBuilder();
        sb.append(x[2]);
        sb.append(x[1]);
        sb.append(x[0]);
        return sb.toString();
    }

    public String getgiothi(){
        return giothi;
    }

    public String getma(){
        return ma;
    }    

    public String toString(){
        return this.ma + " " + this.ngaythi + " " + this.giothi + " " + this.phongthi;
    }
}
