package java_code_ptit.J07034;

public class Mon_hoc {
    private String ma_Mon, ten;
    private int tin_chi;

    public Mon_hoc (String ma_Mon, String ten, int tin_chi){
        this.ma_Mon = ma_Mon;
        this.ten = ten;
        this.tin_chi = tin_chi;
    }

    public String getten(){
        return ten;
    }

    public String toString(){
        return this.ma_Mon + " " + this.ten + " " + this.tin_chi;
    }
}
