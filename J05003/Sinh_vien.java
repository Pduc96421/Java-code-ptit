package java_code_ptit.J05003;

public class Sinh_vien {
    private String msv, ten, lop, bd;
    private double gpa;

    public Sinh_vien(String msv, String ten, String lop, String bd, double gpa){
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.bd = bd;
        this.gpa = gpa;
    }

    public void chuan_hoa(){
        StringBuilder sb = new StringBuilder(this.bd);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        this.bd = sb.toString(); 
    }

    public String toString(){
        chuan_hoa();
        return this.msv + " " + this.ten + " " + this.lop + " " + this.bd + " " + String.format("%.2f", gpa);
    }
}
