package java_code_ptit.J04012;

public class Nhan_vien {
    private String ten, chuc_vu;
    private int luong;
    private int cong;

    public Nhan_vien(String ten, int luong, int cong, String chuc_vu){
        this.ten = ten;
        this.luong = luong;
        this.cong = cong;
        this.chuc_vu = chuc_vu;
    }

    public int luong_thang(){
        return this.luong * this.cong;
    }

    public double thuong(){
        if(this.cong >= 25){
            return this.luong_thang() * 0.2;
        }
        else if (this.cong >= 22){
            return this.luong_thang() * 0.1;
        }
        else{
            return 0;
        }
    }

    public int phu_cap(){
        String chucvu = this.chuc_vu;
        if(chucvu.equals("GD")) return 250000;
        else if(chucvu.equals("PGD")) return 200000;
        else if(chucvu.equals("TP")) return 180000;
        else return 150000;
    }

    public int thu_nhap(){
        return luong_thang() + (int)thuong() + phu_cap();
    }

    public String toString(){
        return "NV01 " + this.ten + " " + luong_thang() + " " + (int)thuong() + " " + phu_cap() + " " + thu_nhap();
    }
}
