/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_code_ptit.J07036;

/**
 *
 * @author ASUS
 */
public class Sinh_vien {
    private String maSv, tenSv, lop, email;
    
    public Sinh_vien(String maSv, String tenSv, String lop, String email){
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.lop = lop;
        this.email = email;
    }

    public void chuanHoa(){
        String[] a = this.tenSv.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String x : a) {
            sb.append(Character.toUpperCase(x.charAt(0)));
            sb.append(x.substring(1).toLowerCase());
            sb.append(" ");
        }
        this.tenSv = sb.toString();
    }
    
    public String getmaSv(){
        return maSv;
    }
    
    public String gettenSv() {
        chuanHoa();
        return tenSv;
    }
    
    public String getlop() {
        return lop;
    }
}
