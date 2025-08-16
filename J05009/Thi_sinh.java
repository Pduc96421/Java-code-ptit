package java_code_ptit.J05009;

public class Thi_sinh {
    private String ma, ten, bd;
    private double diem1, diem2, diem3;

    public Thi_sinh(String ma, String ten, String bd, double diem1, double diem2, double diem3){
        this.ma = ma;
        this.ten = ten;
        this.bd = bd;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public double tongDiem(){
        return this.diem1 + this.diem2 + this.diem3;
    }

    public String toString(){
        return this.ma + " " + this.ten + " " + this.bd + " " + String.format("%.1f", tongDiem());
    }
}
