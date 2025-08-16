package java_code_ptit.J07035;

public class Bang_diem {
    private String maSV, maMon;
    private double diem;

    public Bang_diem(String maSV, String maMon, double diem){
        this.maSV = maSV;
        this.maMon = maMon;
        this.diem = diem;
    }

    public String getmaSV(){
        return maSV;
    }

    public String getmaMon(){
        return maMon;
    }

    public double getdiem(){
        return diem;
    }

    public String toString(){
        if(this.diem == (int) this.diem){
            return (int) this.diem + "";
        }
        else{
            return this.diem + "";
        }
    }
}
