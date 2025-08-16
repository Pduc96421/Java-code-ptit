package java_code_ptit.J07019;

public class sanPham {
    private String maSp, tenSp;
    private int loai1, loai2;

    public sanPham(String maSp, String tenSp, int loai1, int loai2){
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.loai1 = loai1;
        this.loai2 = loai2;
    }

    public String getMaSp(){
        return maSp;
    }

    public String getTenSp(){
        return tenSp;
    }

    public int getLoai1(){
        return loai1;
    }

    public int getLoai2(){
        return loai2;
    }
}
