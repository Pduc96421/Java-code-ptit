package java_code_ptit.J05025;

public class Giang_vien {
    private String ma, ten, mon;
    
    public Giang_vien(String ma, String ten, String mon){
        this.ma = ma;
        this.ten = ten;
        this.mon = mon;
    }

    public String getten(){
        String[] x = this.ten.trim().split("\\s+");
        return x[x.length - 1];
    }

    public String getma(){
        return ma;
    }

    public void chuanHoa(){
        String[] x = this.mon.toUpperCase().trim().split("\\s+");
        String ans = "";
        for(String a : x){
            ans += a.charAt(0);
        }
        this.mon = ans;
    }

    public String toString(){
        chuanHoa();
        return this.ma + " " + this.ten + " " + this.mon;
    }
}
