package java_code_ptit.J05015;

public class thiSinh {
    private String maTs, tenTs, don_vi, thoi_gian;

    public String chuan_hoa_maTs(String s){
        String[] x = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String a : x){
            sb.append(a.charAt(0));
        }
        return sb.toString();
    }

    public thiSinh(String tenTs, String don_vi, String thoi_gian){
        this.maTs = chuan_hoa_maTs(don_vi) + chuan_hoa_maTs(tenTs);
        this.tenTs = tenTs;
        this.don_vi = don_vi;
        this.thoi_gian = thoi_gian;
    }

    public double time(){
        String[] a = this.thoi_gian.trim().split(":");
        double ans = 0;
        double gio = Double.parseDouble(a[0]) - 6;
        double phut = Double.parseDouble(a[1]) / 60.0;
        ans = gio + phut;
        return ans;
    }

    public long van_toc(){
        return Math.round(120.0 / time());
    }

    public String toString(){
//        setMaTs();
        return this.maTs + " " + this.tenTs + " " + this.don_vi + " " + van_toc() + " Km/h";
    }
}
