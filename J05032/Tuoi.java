package java_code_ptit.J05032;

public class Tuoi {
    private String ten, bd;

    public Tuoi(String a){
        String[] x = a.trim().split("\\s+");
        this.ten = x[0];
        this.bd = x[1];
    }

    public String ngaySinh(){
        String[] x = this.bd.split("/");
        StringBuilder sb = new StringBuilder();
        sb.append(x[2]);
        sb.append(x[1]);
        sb.append(x[0]);
        return sb.toString();
    }
    public String toString(){
        return this.ten;
    }
}
