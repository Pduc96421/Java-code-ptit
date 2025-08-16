package java_code_ptit.J07020;

public class Hoa_don {
    private String maHD, maKH, maMH;
    private int soluong;
    public Hoa_don(String maHD, String maKH, String maMH, int soluong){
        this.maHD = maHD;
        this.maKH = maKH;
        this.maMH = maMH;
        this.soluong = soluong;
    }

    public String getmaKH(){
        return maKH;
    }

    public String getmaMH(){
        return maMH;
    }

    public int getsoluong(){
        return soluong;
    }

    public String toString(){
        return this.maHD;
    }
}
