package java_code_ptit.J04003;

public class Phan_so {
    private long tu, mau;

    public Phan_so(long tu, long mau){
        this.mau = mau;
        this.tu = tu;
    }

    long gcd(long a, long b){
        if(b == 0) return a;
        else return gcd(b, a % b);
    }

    void rut_gon(Phan_so p){
        long x = gcd(p.tu, p.mau);
        p.tu = p.tu / x;
        p.mau = p.mau / x;
        System.out.println(p.tu + "/" + p.mau);
    }
}
