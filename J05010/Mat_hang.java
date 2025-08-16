package java_code_ptit.J05010;

public class Mat_hang {
    private String ma, ten, nhom;
    private double giaBan, giaMua;

    public Mat_hang (String ma, String ten, String nhom, double giaBan, double giaMua){
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.giaBan = giaBan;
        this.giaMua = giaMua;
    }

    public double loi_nhuan(){
        return this.giaMua - this.giaBan;
    }

    public String toString(){
        return this.ma + " " + this.ten + " " + this.nhom + " " + String.format("%.2f", loi_nhuan());
    }
}
