package java_code_ptit.J07020;

public class Khach_hang {
    private String makh, tenkh, sex, bd, dc;

    public Khach_hang(String makh, String tenkh, String sex, String bd, String dc){
        this.makh = makh;
        this.tenkh = tenkh;
        this.sex = sex;
        this.bd = bd;
        this.dc = dc;
    }

    public String getmakh(){
        return makh;
    }

    public String toString(){
        return this.tenkh + " " + this.dc;
    }
}
