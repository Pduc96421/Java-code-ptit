package java_code_ptit.J07048;

public class San_pham {
    private String msp, ten;
    private int gia, bao_hanh;

    public San_pham (String msp, String ten, int gia, int bao_hanh){
        this.msp = msp;
        this.ten = ten;
        this.gia = gia;
        this.bao_hanh = bao_hanh;
    }

    public int getgia(){
        return gia;
    }

    public String getmsp(){
        return msp;
    }

    public String toString(){
        return this.msp + " " + this.ten + " " + this.gia + " " + this.bao_hanh;
    }
}
