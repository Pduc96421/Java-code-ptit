package java_code_ptit.J04014;

public class Phan_so {
    private long tu, mau;

    public Phan_so (long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }

    public long gcd(long a, long b){
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public void rut_gon(){
        long mc = gcd(this.tu, this.mau);
        this.tu /= mc;
        this.mau /= mc;
        if(this.mau < 0){
            this.mau = Math.abs(this.mau);
            this.tu *= -1;
        }
    }

    public Phan_so C(Phan_so p1, Phan_so p2){
        long Ctu = p1.tu * p2.mau + p1.mau * p2.tu;
        long Cmau = p1.mau * p2.mau;
        Ctu *= Ctu;
        Cmau *= Cmau;
        Phan_so ans = new Phan_so(Ctu, Cmau);
        ans.rut_gon();
        return ans;
    }

    public Phan_so D(Phan_so p1, Phan_so p2, Phan_so C){
        long Dtu = p1.tu * p2.tu * C.tu;
        long Dmau = p1.mau * p2.mau * C.mau;
        Phan_so ans = new Phan_so(Dtu, Dmau);
        ans.rut_gon();
        return ans;
    }

    public String toString(){
        return this.tu + "/" + this.mau;
    }
}