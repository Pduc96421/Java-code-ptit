package java_code_ptit.J05065;

public class nhanVien {
    private String tenNv, chuc_vu, so_hieu, bac_luong;

    public nhanVien (String tenNv, String chuc_vu, String bac_luong, String so_hieu){
        this.tenNv = tenNv;
        this.chuc_vu = chuc_vu;
        this.bac_luong = bac_luong;
        this.so_hieu = so_hieu;
    }

    public String getChuc_vu(){
        return chuc_vu;
    }

    public String getBac_luong(){
        return bac_luong;
    }

    public String getSo_hieu(){
        return so_hieu;
    }

    public String toString(){
        return this.tenNv + " " + this.chuc_vu + " " + this.so_hieu + " " + this.bac_luong;
    }
}
