package java_code_ptit.J05034;

public class Thuc_tap {
    private int stt;
    private String ma, ten, lop, email, tenDN;

    public Thuc_tap (int stt, String ma, String ten, String lop, String email, String tenDN){
        this.stt = stt;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.tenDN = tenDN;
    }

    public String getma(){
        return ma;
    }

    public String gettenDN(){
        return tenDN;
    }

    public String toString(){
        return this.stt + " " + this.ma.trim() + " " + this.ten.trim() + " " + this.lop.trim() + " " + this.email.trim() + " " + this.tenDN.trim();
    }
}
