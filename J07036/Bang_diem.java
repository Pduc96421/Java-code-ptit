package java_code_ptit.J07036;

public class Bang_diem {
    private String maSv, maMh;
    private double diem;

    private String lop, tenSv, tenMh;

    public Bang_diem(String maSv, String maMh, double diem){
        this.maSv = maSv;
        this.maMh = maMh;
        this.diem = diem;
    }

    public String getMaSv(){
        return  maSv;
    }

    public  String getMaMh(){
        return maMh;
    }

    public void setLop(String lop){
        this.lop = lop;
    }

    public String getLop(){
        return lop;
    }

    public void setTenSv(String tenSv){
        this.tenSv = tenSv;
    }

    public  void  setTenMh(String tenMh){
        this.tenMh = tenMh;
    }

    public String toString(){
        if (this.diem != (int)this.diem){
            return this.maSv + " " + this.tenSv + " " + this.maMh + " " + this.tenMh + String.format(" %.1f", this.diem);
        }
        else {
            return this.maSv + " " + this.tenSv + " " + this.maMh + " " + this.tenMh + " " + (int)this.diem;
        }
    }
}
