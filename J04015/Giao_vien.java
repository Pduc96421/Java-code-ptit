package java_code_ptit.J04015;

public class Giao_vien {
    private String ma, ten;
    private int luong_cb;

    public Giao_vien(String ma, String ten, int luong_cb){
        this.ma = ma;
        this.ten = ten;
        this.luong_cb = luong_cb;
    }

    public String chuc_vu(){
        return ma.substring(0, 2);
    }

    public int he_so(){
        return Integer.parseInt(ma.substring(2));
    }

    public int phu_cap(){
        if(chuc_vu().equals("HT")){
            return 2000000;
        }
        else if(chuc_vu().equals("HP")){
            return 900000;
        }
        else{
            return 500000;
        }
    }

    public String toString(){
        return this.ma + " " + this.ten + " " + he_so() + " " + phu_cap() + " " + (this.luong_cb * he_so() + phu_cap());
    }
}
