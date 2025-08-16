package java_code_ptit.J07010;

public class Sin_vien {
    private final String msv;
    private final String ten;
    private final String lop;
    private String bd;
    private final double gpa;

    public Sin_vien(String msv, String ten, String lop, String bd, double gpa){
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.bd = bd;
        this.gpa = gpa;
    }

    public String getbd(){
       StringBuilder sn = new StringBuilder(bd);
       if(sn.charAt(2) != '/') sn.insert(0, "0");
       if(sn.charAt(5) != '/') sn.insert(3, "0");
       bd = sn.toString();
       return bd;
    }

    public String toString(){
        return this.msv + " " + this.ten + " " + this.lop + " " + getbd() + " " + String.format("%.2f",this.gpa);
    }
}
