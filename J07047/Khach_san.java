package java_code_ptit.J07047;

public class Khach_san {
    private String kituloaiPhong, tenPhong;
    private double giaNgay, phiPhucvu;

    public Khach_san(String kituloaiPhong, String tenPhong, double giaNgay, double phiPhucvu){
        this.kituloaiPhong= kituloaiPhong;
        this.tenPhong = tenPhong;
        this.giaNgay = giaNgay;
        this.phiPhucvu = phiPhucvu;
    }

    public String getkituloaiPhong(){
        return kituloaiPhong;
    }

    public double getgiaNgay(){
        return giaNgay;
    }

    public double getphiPhucvu(){
        return phiPhucvu;
    }
}
