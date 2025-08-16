package java_code_ptit.J05059;

public class sinhVien {
    private String maTs, tenTs;
    private double toan, ly, hoa;

    public sinhVien (String maTs, String tenTs, double toan, double ly, double hoa){
        this.maTs = maTs;
        this.tenTs = tenTs;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getMaTs(){
        return maTs;
    }

    public double uu_tien(){
        String s = this.maTs.substring(0, 3);
        if(s.equals("KV1")) return 0.5;
        else if(s.equals("KV2")) return 1.0;
        else return 2.5;
    }

    public double tong_diem(){
        return this.toan * 2 + this.ly + this.hoa + uu_tien();
    }

    public String toString(){
        String tmp = "";
        if (uu_tien() != 1.0) {
            tmp += uu_tien();
        } else {
            tmp += "1";
        }

        if (tong_diem() == (int) tong_diem()){
            return this.maTs + " " + this.tenTs + " " + tmp + " " + (int)tong_diem();
        }
        else{
            return this.maTs + " " + this.tenTs + " " + tmp + " " + String.format("%.1f", tong_diem());
        }

    }
}
