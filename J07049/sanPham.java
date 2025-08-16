package java_code_ptit.J07049;

public class sanPham {
    private String maSp, tenSp;
    private int giaban;
    private int baohanh;

    public sanPham(String maSp, String tenSp, int giaban, int baohanh){
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.giaban = giaban;
        this.baohanh = baohanh;
    }

    public int getGiaban(){
        return giaban;
    }

    public int getBaohanh(){
        return baohanh;
    }

    public String getMaSp(){
        return maSp;
    }
}
