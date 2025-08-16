package java_code_ptit.J05055;

public class Sinh_vien {
    private String ma, ten;
    private double dlt, dth, dt;

    public Sinh_vien(String ma, String ten, double dlt, double dth, double dt){
        this.ma = ma;
        this.ten = ten;
        this.dlt = dlt;
        this.dth = dth;
        this.dt = dt;
    }

    public double diemTK(){
        return this.dlt * 0.25 + this.dth * 0.35 + this.dt * 0.4;
    }

    public void chuanHoa(){
        String[] x = this.ten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String a : x){
            sb.append(Character.toUpperCase(a.charAt(0)));
            sb.append(a.substring(1).toLowerCase());
            sb.append(" ");
        }
        this.ten = sb.toString();
    }

    public String toString(){
        chuanHoa();
        String xeploai;
        if(diemTK() >= 8.0) xeploai = "GIOI";
        else if(diemTK() >= 6.5) xeploai = "KHA";
        else if(diemTK() >= 5) xeploai = "TRUNG BINH";
        else xeploai = "KEM";
        return this.ma + " " + this.ten + " " + String.format("%.2f", diemTK()) + " " + xeploai;
    }
}
