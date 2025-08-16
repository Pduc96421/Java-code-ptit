package java_code_ptit.J04013;

public class Sinh_vien {
    private String mats, ten;
    private double toan, ly, hoa;

    public Sinh_vien(String mats, String ten, double toan, double ly, double hoa){
        this.mats = mats;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double uu_tien(){
        int a = Integer.parseInt(this.mats.substring(2, 3));
        if(a == 1) return 0.5;
        else if(a == 2) return 1.0;
        else return 2.5;
    }

    public double Diem_thi(){
        return this.toan * 2 + this.ly + this.hoa;
    }

    public String toString(){
        String trang_thai;
        double tong = Diem_thi() + uu_tien();
        if(tong >= 24.0){
            trang_thai = "TRUNG TUYEN";
        }
        else{
            trang_thai = "TRUOT";
        }

        if(uu_tien() == (int)uu_tien()){
            if(Diem_thi() == (int)Diem_thi()){
                return this.mats + " " + this.ten + " " + (int)uu_tien() + " " + (int)Diem_thi() + " " + trang_thai;
            }
            else{
                return this.mats + " " + this.ten + " " + (int)uu_tien() + " " + String.format("%.1f", Diem_thi()) + " " + trang_thai;
            }
        }
        else{
            if(Diem_thi() == (int)Diem_thi()){
                return this.mats + " " + this.ten + " " + uu_tien() + " " + (int)Diem_thi() + " " + trang_thai;
            }
            else{
                return this.mats + " " + this.ten + " " + uu_tien() + " " + String.format("%.1f", Diem_thi()) + " " + trang_thai;
            }
        }
    }
}
