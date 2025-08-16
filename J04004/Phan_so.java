package java_code_ptit.J04004;

public class Phan_so {
    public long tu, mau;

    public Phan_so() {
    }

    public Phan_so(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }

    long gcd(long a, long b){
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    void rut_gon(Phan_so p){
        long x = gcd(p.tu, p.mau);
        p.tu = p.tu / x;
        p.mau = p.mau / x;
    }

    void add (Phan_so a, Phan_so b){
        Phan_so ans = new Phan_so();
        ans.mau = a.mau * b.mau;
        ans.tu = a.tu * b.mau + a.mau * b.tu;
        rut_gon(ans);
        System.out.println(ans.tu + "/" + ans.mau);
    }
}
