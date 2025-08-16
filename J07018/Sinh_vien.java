package java_code_ptit.J07018;

public class Sinh_vien {
    private String maSv, tenSv, lop, bd;
    private double gpa;

    public Sinh_vien(String maSv, String tenSv, String lop, String bd, double gpa){
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.lop = lop;
        this.bd = bd;
        this.gpa = gpa;
    }

    public void chuanhoa_ten(){
        String[] a = this.tenSv.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : a){
            sb.append(Character.toUpperCase(x.charAt(0)));
            sb.append(x.substring(1).toLowerCase());
            sb.append(" ");
        }
        this.tenSv = sb.toString();
    }

    public void chuanhoa_ngaysinh(){
        StringBuilder sb = new StringBuilder(this.bd);
        if(sb.charAt(2) != '/') sb.insert(0, '0');
        if(sb.charAt(5) != '/') sb.insert(3, '0');
        this.bd = sb.toString();
    }

    public String toString(){
        chuanhoa_ten();
        chuanhoa_ngaysinh();
        return this.maSv + " " + this.tenSv + " " + this.lop + " " + this.bd + " " + String.format("%.2f", this.gpa);
    }
}
