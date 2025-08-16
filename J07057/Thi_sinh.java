package java_code_ptit.J07057;

public class Thi_sinh {
    private String ma, ten, dantoc;
    private double diem;
    private int khuvuc;

    public Thi_sinh(String ma, String ten, double diem, String dantoc, int khuvuc){
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
        this.dantoc = dantoc;
        this.khuvuc = khuvuc;
    }

    public double diemUT(){
        double ans = 0;
        if(this.dantoc.trim().equals("Kinh")) ans += 0;
        else ans += 1.5;
        if(this.khuvuc == 1) ans += 1.5;
        else if(this.khuvuc == 2) ans += 1;
        return ans;
    }

    public String getma(){
        return ma;
    }

    public double diemChuan()
    {
        return this.diem + diemUT();
    }

    public void chuanHoa(){
        String[] x = this.ten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String a : x){
            sb.append(Character.toUpperCase(a.charAt(0)));
            sb.append(a.substring(1).toLowerCase());
            sb.append(" ");
        }
        this.ten = sb.toString();
    }

    public String toString(){
        chuanHoa();
        String trangthai;
        if(diemChuan() >= 20.5) trangthai = "Do";
        else trangthai = "Truot";
        return this.ma + " " + this.ten + " " + String.format("%.1f", diemChuan()) + " " + trangthai;
    }
}
