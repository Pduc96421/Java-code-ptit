package java_code_ptit.J05023;

public class Sinh_vien {
    private String ma, ten, lop, email;

    public Sinh_vien(String ma, String ten, String lop, String email){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getlop(){
        return lop;
    }

    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
    }
}
