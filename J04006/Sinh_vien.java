package java_code_ptit.J04006;

public class Sinh_vien {
    private String msv = "B20DCCN001", ten, lop, bd;
    private double gpa;

    public Sinh_vien(String ten, String lop, String bd, double gpa){
        this.ten = ten;
        this.lop = lop;
        this.bd = bd;
        this.gpa = gpa;
    }

    public String getmsv(){
        return msv;
    }

    public String getbd(){
        StringBuilder sn = new StringBuilder(bd);
        if(sn.charAt(2) != '/') sn.insert(0, "0");
        if(sn.charAt(5) != '/') sn.insert(3, "0");
        bd = sn.toString();
        return bd;
    }

    public String getten(){
        return ten;
    }

    public String getlop(){
        return lop;
    }

    public double getgpa(){
        return gpa;
    }

    @Override
    public String toString(){
        return getmsv() + " " + getten() + " "+ getlop() + " " + getbd() + " " + String.format("%.2f", getgpa()); 
    }
}