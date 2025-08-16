package java_code_ptit.J05033;

public class Thoi_gian {
    public int gio, phut, giay;

    public Thoi_gian(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getgio(){
        return gio;
    }

    public int getphut(){
        return phut;
    }

    public int getgiay(){
        return giay;
    }

    public String toString(){
        return this.gio + " " + this.phut + " " + this.giay;
    }
}
