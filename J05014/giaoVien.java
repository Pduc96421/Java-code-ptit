package java_code_ptit.J05014;

public class giaoVien {
    private String maGv, tenGv, ma_xet_tuyen;
    private double tin_hoc, chuyen_mon;

    public giaoVien(String maGv, String tenGv, String ma_xet_tuyen, double tin_hoc, double chuyen_mon){
        this.maGv = maGv;
        this.tenGv = tenGv;
        this.tin_hoc = tin_hoc;
        this.chuyen_mon = chuyen_mon;
        this.ma_xet_tuyen = ma_xet_tuyen;
    }

    public String getMaGv(){
        return maGv;
    }

    public String mon(){
        String s = this.ma_xet_tuyen.substring(0, 1);
        if(s.equals("A")) return "TOAN";
        else if(s.equals("B")) return "LY";
        else return "HOA";
    }

    public double uu_tien(){
        String s = this.ma_xet_tuyen.substring(1, 2);
        if(s.equals("1")) return 2.0;
        else if(s.equals("2")) return 1.5;
        else if(s.equals("3")) return 1.0;
        else return 0.0;
    }

    public double tong_dien(){
        return uu_tien() + this.tin_hoc * 2 + this.chuyen_mon;
    }

    public String ket_qua(){
        if(tong_dien() >= 18) return "TRUNG TUYEN";
        else return "LOAI";
    }

    public String toString(){
        return this.maGv + " " + this.tenGv + " " + mon() + " " + String.format("%.1f", tong_dien()) + " " + ket_qua();
    }
}
