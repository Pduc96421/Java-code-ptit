package java_code_ptit.J05030;

public class Bang_diem {
    private  String ma, ten, lop;
    private double diem1, diem2, diem3;

    public Bang_diem(String ma, String ten, String lop, double diem1, double diem2, double diem3){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getten(){
        return ten;
    }

    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + String.format("%.1f", this.diem1) + " " + String.format("%.1f", this.diem2) + " " + String.format("%.1f", this.diem3);
    }
}
