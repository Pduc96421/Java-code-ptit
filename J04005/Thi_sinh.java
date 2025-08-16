package java_code_ptit.J04005;

public class Thi_sinh {
    public String ten, bd;
    double diem1, diem2, diem3;

    public Thi_sinh(String ten, String bd, double diem1, double diem2, double diem3){
        this.ten = ten;
        this.bd = bd;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getten(){
        return ten;
    }

    public String getbd(){
        return bd;
    }

    public double tong(){
        return this.diem1 + this.diem2 + this.diem3;
    }
}
