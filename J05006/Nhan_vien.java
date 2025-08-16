package java_code_ptit.J05006;

public class Nhan_vien {
    private String mnv, ten, sex, bd, dc, mst, date;
    
    public Nhan_vien(String mnv, String ten, String sex, String bd, String dc, String mst, String date){
        this.mnv = mnv;
        this.ten = ten;
        this.sex = sex;
        this.bd = bd;
        this.dc = dc;
        this.mst = mst;
        this.date = date;
    }

    public String toString(){
        return this.mnv + " " + this.ten + " " + this.sex + " " + this.bd + " " + this.dc + " " + this.mst + " " + this.date;
    }
}
