package java_code_ptit.J07020;

public class Mat_hang {
    private String maMH, tenMH, dvTinh;
    private int giamua, giaban;

    public Mat_hang(String maMH, String tenMH, String dvTinh, int giamua, int giaban){
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.dvTinh = dvTinh;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public String getmaMH(){
        return maMH;
    }

    public int getgiaban(){
        return giaban;
    }

    public int loi_nhuan(){
        return this.giaban - this.giamua;
    }

    public String toString(){
        return this.tenMH + " " + this.dvTinh + " " + this.giamua + " " + this.giaban;
    }
}
