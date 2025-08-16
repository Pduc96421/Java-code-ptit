package java_code_ptit.J05018;

public class Hoc_sinh {
    private String ma, ten;
    private double toan, van, anh, ly, hoa, sinh, su, dia, congdan, congnghe;

    public Hoc_sinh(String ma, String ten, double toan, double van, double anh, double ly, double hoa, double sinh, double su, double dia, double congdan, double congnghe){
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.van = van;
        this.anh = anh;
        this.ly = ly;
        this.hoa = hoa;
        this.sinh = sinh;
        this.su = su;
        this.dia = dia;
        this.congdan = congdan;
        this.congnghe = congnghe;
    }

    public String getma(){
        return ma;
    }

    public double diemtb(){
        return (this.toan * 2 + this.van * 2 + this.anh + this.ly + this.hoa + this.sinh + this.su + this.dia + this.congdan + this.congnghe) / 12.0;
    }

    public String toString(){
        String xeploai;
        double tb = (double) Math.round(diemtb() * 10) / 10;
        if(tb >= 9.0){
            xeploai = "XUAT SAC";
        }
        else if(tb >= 8.0){
            xeploai = "GIOI";
        }
        else if(tb >= 7.0){
            xeploai = "KHA";
        }
        else if(tb >= 5.0){
            xeploai = "TB";
        }
        else xeploai = "YEU";

        return this.ma + " " + this.ten + " " + String.format("%.1f", tb) + " " + xeploai; 
    }
}
