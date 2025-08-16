package java_code_ptit.J05027;

public class Giang_vien {
    private String ma, ten, mon;
    
    public Giang_vien(String ma, String ten, String mon){
        this.ma = ma;
        this.ten = ten;
        this.mon = mon;
    }

    public String getten(){
        return ten.toUpperCase();
    }
    
    public String chuanHoa(){
        String[] x = this.mon.toUpperCase().trim().split("\\s+");
        String ans = "";
        for(String a : x){
            ans += a.charAt(0);
        }
        return ans;
    }

    public String toString(){
        return this.ma + " " + this.ten + " " + chuanHoa();
    }
}
