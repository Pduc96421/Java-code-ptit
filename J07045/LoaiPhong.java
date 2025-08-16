package java_code_ptit.J07045;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String ky_hieu, ten;
    private int don_gia;
    private double phiPv;

    public LoaiPhong(String s){
        String[] x = s.trim().split("\\s+");
        this.ky_hieu = x[0];
        this.ten = x[1];
        this.don_gia = Integer.parseInt(x[2]);
        this.phiPv = Double.parseDouble(x[3]);
    }

    public int compareTo(LoaiPhong a){
        return this.ten.compareTo(a.ten);
    }

    public String toString(){
        return this.ky_hieu + " " + this.ten + " " + this.don_gia + " " + this.phiPv;
    }
}
