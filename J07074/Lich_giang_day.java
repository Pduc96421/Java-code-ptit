package java_code_ptit.J07074;

public class Lich_giang_day {
    private String maNhom, maMon, tenGV, phong;
    private int thu, kip;

    public Lich_giang_day(String maNhom, String maMon, int thu, int kip, String tenGV, String phong){
        this.maNhom = maNhom;
        this.maMon = maMon ;
        this.thu = thu;
        this.kip = kip;
        this.tenGV = tenGV;
        this.phong = phong;
    }

    public String getmaMon(){
        return maMon;
    }

    public int getthu(){
        return thu;
    }

    public int getkip(){
        return kip;
    }

    public String gettenGV(){
        return tenGV;
    }

    public String toString(){
        return this.maNhom + " " + this.thu + " " + this.kip + " " + this.tenGV + " " + this.phong;
    }
}
