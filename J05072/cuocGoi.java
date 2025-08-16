package java_code_ptit.J05072;

public class cuocGoi {
    private String thueBao, begin, end;
    private String tinh;
    private int giaCuoc;

    public cuocGoi(String thueBao, String begin, String end){
        this.thueBao = thueBao;
        this.begin = begin;
        this.end = end;
    }

    public int sophut(){
        String[] x = this.begin.trim().split(":");
        String[] y = this.end.trim().split(":");

        int a = Integer.parseInt(x[0]) * 60 + Integer.parseInt(x[1]);
        int b = Integer.parseInt(y[0]) * 60 + Integer.parseInt(y[1]);
        if(this.tinh == "Noi mang"){
            return (int)Math.ceil((b - a) / 3.0) ;
        }
        else{
            return b - a;
        }
    }

    public void setTinh(String tinh){
        this.tinh = tinh;
    }

    public void setGiaCuoc(int giacuoc){
        this.giaCuoc = giacuoc * sophut();
    }

    public int getGiaCuoc(){
        return giaCuoc;
    }

    public String toString(){
        return this.thueBao + " " + this.tinh + " " + sophut() + " " + this.giaCuoc;
    }
}
