package java_code_ptit.J06007;

import java.util.ArrayList;

public class Gio_day {
    private String maGV, maMon;
    private double gio;
    
    ArrayList<Giang_vien> gv = new ArrayList<>();

    public Gio_day(String maGV, String maMon, double gio, ArrayList<Giang_vien> gv){
        this.maGV = maGV;
        this.maMon = maMon;
        this.gio = gio;
        this.gv = gv;
    }

    public String toString(){
        String ans = "";
        for(Giang_vien x : gv){
            if(this.maGV.equals(x.getma())){
                ans += x.toString(); 
                break;
            }
        }
        return ans + String.format("%.2f", this.gio);
    }
}
