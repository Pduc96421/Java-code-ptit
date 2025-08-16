package java_code_ptit.J05073;

public class giaBan {
    private String maDh;
    private int don_gia, so_luong;
    private double thue, van_chuyen;

    public giaBan(String maDh, int don_gia, int so_luong){
        this.maDh = maDh;
        this.don_gia = don_gia;
        this.so_luong = so_luong;
        tinhtoan();
    }

    public void tinhtoan(){
        int tien = this.don_gia * this.so_luong;
        this.thue = 0;
        if(this.maDh.charAt(0) == 'T'){
            this.thue += tien * 0.29;
            this.van_chuyen = tien * 0.04;
        }
        else if(this.maDh.charAt(0) == 'C'){
            this.thue += tien * 0.1;
            this.van_chuyen = tien * 0.03;
        }
        else if(this.maDh.charAt(0) == 'D'){
            this.thue += tien * 0.08;
            this.van_chuyen = tien * 0.025;
        }
        else{
            this.thue += tien * 0.02;
            this.van_chuyen = tien * 0.005;
        }

        if(this.maDh.endsWith("C")){
            this.thue -= this.thue * 0.05;
        }
    }

    public double tongtien(){
        double ans = (this.thue + this.don_gia * this.so_luong + this.van_chuyen) * 1.2;

        return ans /= this.so_luong * 1.0;
    }

    public String toString(){
        return this.maDh + " " + String.format("%.2f", tongtien());
    }
}
