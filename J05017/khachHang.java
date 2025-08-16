package java_code_ptit.J05017;

public class khachHang {
    private String maKh, tenKh;
    private int so_cu, so_moi;

    public khachHang(String maKh, String tenKh, int so_cu, int so_moi){
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.so_cu = so_cu;
        this.so_moi = so_moi;
    }

    public int chi_so(){
        return this.so_moi - this.so_cu;
    }

    public long tong_tien(){
        int x = chi_so();
        if(x > 100){
            return Math.round((50 * 100 + 50 * 150 + (x - 100) * 200) * 1.05);
        }
        else if(x > 50) {
            return Math.round((50 * 100 + (x - 50) * 150) * 1.03);
        }
        else{
            return Math.round((x * 100) * 1.02);
        }
    }

    public String toString(){
        return this.maKh + " " + this.tenKh + " " + tong_tien();
    }
}
