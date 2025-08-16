package java_code_ptit.J05013;

public class thiSinh {
    private String maTs, tenTs;
    private double ly_thuyet, thuc_hanh;

    public thiSinh(String maTs, String tenTs, double ly_thuyet, double thuc_hanh){
        this.maTs = maTs;
        this.tenTs = tenTs;
        this.ly_thuyet = ly_thuyet;
        this.thuc_hanh = thuc_hanh;
    }

    public double trung_binh(){
        if (this.ly_thuyet > 10) {
            this.ly_thuyet /= 10.0;
        }
        if (this.thuc_hanh > 10) {
            this.thuc_hanh /= 10.0;
        }
        return (this.ly_thuyet + this.thuc_hanh) / 2.0;
    }

    public String xep_loai(){
        if(trung_binh() < 5) return "TRUOT";
        else if(trung_binh() < 8) return "CAN NHAC";
        else if (trung_binh() < 9.5) return "DAT";
        else return "XUAT SAC";
    }

    public String toString(){
        return this.maTs + " " + this.tenTs + " " + String.format("%.2f", trung_binh()) + " " + xep_loai();
    }

}
