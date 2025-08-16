package java_code_ptit.J05072;

public class thanhPho {
    private String maVung, tenVung;
    private int giaCuoc;

    public thanhPho(String maVung, String tenVung, int giaCuoc){
        this.maVung = maVung;
        this.tenVung = tenVung;
        this.giaCuoc = giaCuoc;
    }

    public String getMaVung(){
        return maVung;
    }

    public String getTenVung(){
        return tenVung;
    }

    public int getGiaCuoc(){
        return giaCuoc;
    }
}
