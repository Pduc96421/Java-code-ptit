package java_code_ptit.J07033;

public class Sinh_vien {
    private String msv, ten, lop, email;

    public Sinh_vien(String msv, String ten, String lop, String email){
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getten(){
        String[] a = this.ten.trim().split("\\s+");
        String ans = "";
        for(String x : a){
            ans += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return ans;
    }

    public String getmsv(){
        return msv;
    }

    public String toString(){
        return this.msv + " " + getten() + " " + this.lop + " " + this.email;
    }
}
