package java_code_ptit.J05062;

public class sinhVien {
    private String tenSv, loaiHb;
    private double gpa;
    private int drl;

    public sinhVien(String tenSv, double gpa, int drl){
        this.tenSv = tenSv;
        this.gpa = gpa;
        this.drl = drl;
        ket_qua();
    }

    public double getGpa(){
        return gpa;
    }

    public void ket_qua(){
        if(this.gpa >= 3.6 && this.drl >= 90) this.loaiHb = "XUATSAC";
        else if(this.gpa >= 3.2 && this.drl >= 80) this.loaiHb = "GIOI";
        else if(this.gpa >= 2.5 && this.drl >= 70) this.loaiHb = "KHA";
        else this.loaiHb = "KHONG";
    }

    public void setLoaiHb(String loaiHb){
        this.loaiHb = loaiHb;
    }

    public String toString(){
        return this.tenSv + ": " + this.loaiHb;
    }
}
