package java_code_ptit.J05081;

public class Mat_hang {
    private String mamh, tenmh, dvtinh;
    private int giamua, giaban;

    public Mat_hang(){

    }

    public Mat_hang(String mamh, String tenmh, String dvtinh, int giamua, int giaban){
        this.mamh = mamh;
        this.tenmh = tenmh;
        this.dvtinh = dvtinh;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public int loi_nhuan(){
        return this.giaban - this.giamua;
    }

    public String getmamh(){
        return mamh;
    }

    public String toString(){
        return this.mamh + " " + this.tenmh + " " + this.dvtinh + " " + this.giamua + " " + this.giaban + " " + loi_nhuan();
    }
}
