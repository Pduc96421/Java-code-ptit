package java_code_ptit.J05005.J05004;

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

    public void chuan_hoa_ten(){
        String[] a = this.ten.trim().split("\\s+");
        String ans = "";
        for(String x : a){
            ans += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++){
                ans += Character.toLowerCase(x.charAt(i));
            }
            ans += " ";
        }
        this.ten = ans;
    }

    public void chuan_hoa_bd(){
        StringBuilder sb = new StringBuilder(this.bd);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        this.bd = sb.toString(); 
    }

    public String toString(){
        chuan_hoa_ten();
        chuan_hoa_bd();
        return this.msv + " " + this.ten + " " + this.lop + " " + this.bd + " " + String.format("%.2f", gpa);
    }
}
