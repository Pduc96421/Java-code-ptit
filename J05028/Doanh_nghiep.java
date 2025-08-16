package java_code_ptit.J05028;

public class Doanh_nghiep {
    private String ma, ten;
    private int soSV;

    public Doanh_nghiep(String ma, String ten, int soSV){
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
    }

    public String getma(){
        return ma;
    }

    public int getsoSV(){
        return soSV;
    }

    public String toString(){
        return this.ma + " " + this.ten + " " + this.soSV;
    }
}
