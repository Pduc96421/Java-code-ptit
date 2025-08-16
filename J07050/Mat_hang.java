package java_code_ptit.J07050;

public class Mat_hang {
    private String ma, ten, nhom;
    private double giaMua, giaBan;

    public Mat_hang(String ma, String ten, String nhom, double giaMua, double giaBan){
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public double loi_nhuan(){
        return this.giaBan - this.giaMua;
    }

    public String toString(){
        return this.ma + " " + this.ten + " " + this.nhom + " " + String.format("%.2f", loi_nhuan());
    }
}
