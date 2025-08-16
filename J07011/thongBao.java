package java_code_ptit.J07011;

public class thongBao {
    private String chu;
    private int soluong;

    public thongBao(String chu, int soluong){
        this.chu = chu;
        this.soluong = soluong;
    }

    public int getSoluong(){
        return soluong;
    }

    public String getChu(){
        return chu;
    }

    public String toString(){
        return this.chu + " " + this.soluong;
    }
}
