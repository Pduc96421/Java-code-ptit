package java_code_ptit.J05054;

public class Trung_binh {
    private String ma, ten;
    private double d1, d2, d3;
    private int xephang;

    public Trung_binh (String ma, String ten, double d1, double d2, double d3){
        this.ma = ma;
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String chuanHoa(){
        String[] x = this.ten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String a : x){
            sb.append(Character.toUpperCase(a.charAt(0)));
            sb.append(a.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString();
    }

    public double diemtb(){
        return (this.d1 * 3 + this.d2 * 3 + this.d3 * 2) / 8;
    }

    public String getma(){
        return ma;
    }

    public int getxepthang(){
        return xephang;
    }

    public void setxephang(int xephang){
        this.xephang = xephang;
    }

    public String toString(){
        return this.ma + " " + chuanHoa() + String.format("%.2f", diemtb()) + " " + this.xephang;
    }
}
