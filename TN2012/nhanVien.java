package java_code_ptit.TN2012;

public class nhanVien {
    private String maNv, tenNv;
    private int luong_coban, ngay_cong;

    private String tenPb;

    public nhanVien(String maNv, String tenNv, int luong_coban, int ngay_cong){
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.luong_coban = luong_coban * 1000;
        this.ngay_cong = ngay_cong;
    }

    public String maPb(){
        return this.maNv.substring(3);
    }

    public void setTenPb(String tenPb){
        this.tenPb = tenPb;
    }

    public int he_so_nhan(){
        String x = this.maNv.substring(0, 1);
        int nam = Integer.parseInt(this.maNv.substring(1, 3));
        if (x.equals("A")) {
            if (nam >= 16) {
                return 20;
            } else if (nam >= 9) {
                return 14;
            } else if (nam >= 4) {
                return 12;
            } else if (nam >= 1) {
                return 10;
            } else {
                return 1;
            }
        } else if (x.equals("B")) {
            if (nam >= 16) {
                return 16;
            } else if (nam >= 9) {
                return 13;
            } else if (nam >= 4) {
                return 11;
            } else if (nam >= 1) {
                return 10;
            } else {
                return 1;
            }
        } else if (x.equals("C")) {
            if (nam >= 16) {
                return 14;
            } else if (nam >= 9) {
                return 12;
            } else if (nam >= 4) {
                return 10;
            } else if (nam >= 1) {
                return 9;
            } else {
                return 1;
            }
        } else {
            if (nam >= 16) {
                return 13;
            } else if (nam >= 9) {
                return 11;
            } else if (nam >= 4) {
                return 9;
            } else if (nam >= 1) {
                return 8;
            } else {
                return 1;
            }
        }
    }

    public long tong(){
        return (long)this.luong_coban * this.ngay_cong * he_so_nhan();
    }

    public String toString(){
        return this.maNv + " " + this.tenNv + " " + this.tenPb + tong();
    }
}
