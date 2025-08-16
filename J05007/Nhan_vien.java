package java_code_ptit.J05007;

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

    public String getNgaysinh(){
        String[] x = this.bd.split("/");
        StringBuilder sb = new StringBuilder();
        sb.append(x[2]);
        sb.append(x[1]);
        sb.append(x[0]);
        return sb.toString();
    }

    public String toString(){
        return this.mnv + " " + this.ten + " " + this.sex + " " + this.bd + " " + this.dc + " " + this.mst + " " + this.date;
    }
}
