package java_code_ptit.J07075;

public class Lich_giang_day {
    private String maNhom, maMon, tenGV, phong, tenMon;
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

    public void settenMon(String tenMon){
        this.tenMon = tenMon;
    }

    public String gettenMon(){
        return tenMon;
    }

    public String toString(){
        return this.maNhom + " " + this.tenMon + " " + this.thu + " " + this.kip + " " + this.phong;
    }
}
