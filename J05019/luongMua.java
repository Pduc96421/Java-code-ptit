package java_code_ptit.J05019;

public class luongMua {
    private String maTram, tenTram;
    private int luong_mua;
    public double thoi_gian;

    public luongMua(String maTram, String tenTram){
        this.maTram = maTram;
        this.tenTram = tenTram;
        this.thoi_gian = 0.0;
        this.luong_mua = 0;
    }

    public String getTenTram(){
        return tenTram;
    }

    public double getThoi_gian(){
        return thoi_gian;
    }

    public void setThoi_gian(double thoi_gian){
        this.thoi_gian = thoi_gian;
    }

    public int getLuong_mua(){
        return luong_mua;
    }

    public void setLuong_mua(int luong_mua){
        this.luong_mua = luong_mua;
    }

    public double luong_mua_tb(){
        return this.luong_mua / this.thoi_gian * 1.0;
    }

    public String toString(){
        return this.maTram + " " + this.tenTram + " " + String.format("%.2f", luong_mua_tb());
    }
}
