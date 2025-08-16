package java_code_ptit.J07028;

public class Giang_vien {
    private String maGV, tenGV;
    private double tongGio;

    public Giang_vien(String maGV, String tenGV){
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    public String getmaGV(){
        return maGV;
    }

    public void settonggio(double gioday){
        this.tongGio = gioday;
    }

    public double gettonggio(){
        return tongGio;
    }

    public String toString(){
        return this.tenGV + " " + String.format("%.2f", this.tongGio);
    }
}
