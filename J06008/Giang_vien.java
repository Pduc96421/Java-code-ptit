package java_code_ptit.J06008;

import java.util.ArrayList;

public class Giang_vien {
    private String ma, ten;
    private double gio;

    ArrayList<String> mh = new ArrayList<>();

    public Giang_vien(String ma, String ten){
        this.ma = ma;
        this.ten = ten;
    }

    public String getma(){
        return ma;
    }

    public String getten(){
        return ten;
    }

    public double getgio(){
        return gio;
    }

    public void setgio(double gio){
        this.gio = gio;
    }
    
}
