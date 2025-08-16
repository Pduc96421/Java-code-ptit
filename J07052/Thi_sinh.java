package java_code_ptit.J07052;

public class Thi_sinh {
    private String ma, ten;
    private double toan, ly, hoa;

    public Thi_sinh(String ma, String ten, double toan, double ly, double hoa){
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getten(){
        String ans = "";
        String[] a = this.ten.trim().split("\\s+");
        for(String x : a){
            ans += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return ans;
    }

    public double uu_tien(){
        int a = this.ma.charAt(2) - '0';
        if(a == 1) return 0.5;
        else if(a == 2) return 1.0;
        else return 2.5;
    }

    public String getma(){
        return ma;
    }

    public double xet_tuyen(){
        return 2 * this.toan + this.hoa + this.ly + uu_tien();
    }

    public String toString(){
        String tmp = "";
        if(uu_tien() == 1.0) tmp += "1";
        else tmp += uu_tien();
        
        if(xet_tuyen() == (int) xet_tuyen()){
            return this.ma + " " + getten() + " " + tmp + " " + (int) xet_tuyen() + " ";
        }
        else{
            return this.ma + " " + getten() + " " + tmp + " " + String.format("%.1f", xet_tuyen()) + " ";
        }
    }
}
