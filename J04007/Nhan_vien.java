package java_code_ptit.J04007;

public class Nhan_vien {
    private String mnv = "00001", ten, sex, ns, dc, mst, date;

    public Nhan_vien(String ten, String sex, String ns, String dc, String mst, String date){
        this.ten = ten;
        this.sex = sex;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.date = date;
    }

    @Override
    public String toString(){
        return this.mnv + " " + this.ten + " " + this.sex + " " + this.ns + " " + this.dc + " " + this.mst + " " + this.date;
    }
}