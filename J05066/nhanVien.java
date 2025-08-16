package java_code_ptit.J05066;

public class nhanVien {
    private String tenNv, chuc_vu, bac_luong, so_hieu;

    public nhanVien(String tenNv, String chuc_vu, String bac_luong, String so_hieu){
        this.tenNv = tenNv;
        this.chuc_vu = chuc_vu;
        this.bac_luong = bac_luong;
        this.so_hieu = so_hieu;
    }

    public String getTenNv(){
        return tenNv;
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
