package java_code_ptit.J06002;

public class San_pham {
    private String ma, ten;
    private long loai1, loai2;

    public San_pham(String ma, String ten, long loai1, long loai2){
        this.ma = ma;
        this.ten = ten;
        this.loai1 = loai1;
        this.loai2 = loai2;
    }

    public String getma(){
        return ma;
    }

    public String getten(){
        return ten;
    }

    public long getloai1(){
        return loai1;
    }

    public long getloai2(){
        return loai2;
    }
}
