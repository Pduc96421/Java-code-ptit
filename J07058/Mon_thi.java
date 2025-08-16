package java_code_ptit.J07058;

public class Mon_thi {
    private String maMon, tenMon, hinh_thuc;

    public Mon_thi(String maMon, String tenMon, String hinh_thuc){
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinh_thuc = hinh_thuc;
    }

    public String getmaMon(){
        return maMon;
    }

    public String toString(){
        return this.maMon + " " + this.tenMon + " " + this.hinh_thuc;
    }
}
