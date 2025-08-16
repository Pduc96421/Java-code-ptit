package java_code_ptit.J07035;

public class Sinh_vien {
    @SuppressWarnings("unused")
    private String maSV, tenSV, lop, email;

    public Sinh_vien(String maSV, String tenSV, String lop, String email){
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.email = email;
    }

    public String getmaSV(){
        return maSV;
    }

    public void chuanHoa(){
        String a[] = this.tenSV.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : a){
            sb.append(Character.toUpperCase(x.charAt(0)));
            sb.append(x.substring(1).toLowerCase());
            sb.append(" ");
        }
        this.tenSV = sb.toString();
    }

    public String toString(){
        chuanHoa();
        return this.maSV + " " + this.tenSV + " " + this.lop;
    }
}
