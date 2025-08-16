package java_code_ptit.J07025;

public class Khach_hang {
    private String maKh, tenKh, sex, bd, dc;

    public Khach_hang (String maKh, String tenKH, String sex, String bd, String dc){
        this.maKh = maKh;
        this.tenKh = tenKH;
        this.sex = sex;
        this.bd = bd;
        this.dc = dc;
    }

    public void chuanHoa_bd(){
        StringBuilder sb = new StringBuilder(this.bd);
        if(sb.charAt(2) != '/') sb.insert(0, '0');
        if(sb.charAt(5) != '/') sb.insert(3, '0');
        this.bd = sb.toString();
    }

    public void chuanhoa_ten(){
        String a[] = this.tenKh.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : a){
            sb.append(Character.toUpperCase(x.charAt(0)));
            sb.append(x.substring(1).toLowerCase());
            sb.append(" ");
        }
        this.tenKh = sb.toString();
    }

    public String ngaysinh(){
        chuanHoa_bd();
        String[] x = this.bd.trim().split("/");
        StringBuilder sb = new StringBuilder();
        sb.append(x[2]);
        sb.append(x[1]);
        sb.append(x[0]);
        return sb.toString();
    }    

    public String toString(){
        chuanHoa_bd();
        chuanhoa_ten();
        return this.maKh + " " + this.tenKh + " " + this.sex + " " + this.dc + " " + this.bd;
    }
}
