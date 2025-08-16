package java_code_ptit.J06003;

public class Sinh_vien {
    private String ma, ten, sdt;
    private int stt;

    public Sinh_vien(String ma, String ten, String sdt, int stt){
        this.ma = ma.trim();
        this.ten = ten;
        this.sdt = sdt;
        this.stt = stt;
    }

    public void chuanHoa() {
        String[] x = this.ten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < x.length; i++) {
            sb.append(Character.toUpperCase(x[i].charAt(0)));
            for (int j = 1; j < x[i].length(); j++) {
                sb.append(Character.toLowerCase(x[i].charAt(j)));
            }
            if (i != x.length - 1) {
                sb.append(" ");
            }
        }
        this.ten = sb.toString();
    }

    public int getstt(){
        return stt;
    }

    public String toString(){
        chuanHoa();
        return this.ma + " " + this.ten + " " + this.sdt;
    }
}
