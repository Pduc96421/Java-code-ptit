package java_code_ptit.J04002;

public class hcn {
    public double cdai, crong;
    String mau;

    public hcn (double cdai, double crong, String mau){
        this.cdai  = cdai;
        this.crong = crong;
        this.mau = mau;
    }

    public double getcdai(){
        return cdai;
    }

    public double getcrong(){
        return crong;
    }

    public String getmau(){
        return mau;
    }

    String chuan_hoa(String mau){
        String res = "";
        res += Character.toUpperCase(mau.charAt(0));
        for (int i = 1; i < mau.length(); i++){
            res += Character.toLowerCase(mau.charAt(i));
        }
        return res;
    }

    double dien_tich(){
        return this.cdai * this.crong;
    }

    double chu_vi(){
        return 2 * (this.cdai + this.crong);
    }
}
