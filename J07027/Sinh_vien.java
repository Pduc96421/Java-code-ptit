package java_code_ptit.J07027;

public class Sinh_vien {
    private String maSV, tenSV, sdt;

    public Sinh_vien(String maSV, String tenSV, String sdt){
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdt = sdt;
    }

    public String getmaSV(){
        return maSV;
    }

    public String toString(){
        return this.maSV + " " + this.tenSV + " " + this.sdt;
    }
}
