package java_code_ptit.J05070;

public class Clb {
    private String maClb, tenClb;
    private int giave, doanhthu;
    private String maTrandau;

    public Clb(String maClb, String tenClb, int giave){
        this.maClb= maClb;
        this.tenClb = tenClb;
        this.giave = giave;
    }

    public String getmaClb(){
        return maClb;
    }

    public void setdoanhthu(int doanhthu){
        this.doanhthu = doanhthu;
    }

    public int getdoanhthu(){
        return doanhthu;
    }

    public int getgiave(){
        return giave;
    }

    public void setmaTrandau(String maTrandau){
        this.maTrandau = maTrandau;
    }

    public String gettenClb(){
        return tenClb;
    }

    public String toString(){
        return this.maTrandau + " " + this.tenClb + " " + this.doanhthu;
    }
}
