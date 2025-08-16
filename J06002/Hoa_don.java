package java_code_ptit.J06002;

import java.util.ArrayList;

public class Hoa_don {
    private String ma, loai, maloai;
    private long soLuong;
    private long thanhtien, giamgia;
    private String ten;

    ArrayList<San_pham> sp = new ArrayList<>();

    public Hoa_don(String s, String a, ArrayList<San_pham> sp){
        String[] x = s.trim().split("\\s+");
        this.maloai = x[0] + a;
        this.ma = x[0].substring(0,2);
        this.loai = x[0].substring(2);
        this.soLuong = Long.parseLong(x[1]);
        this.sp = sp;
    }

    public void gia(){
        for(San_pham x : sp){
            if(x.getma().equals(this.ma)){
                this.ten = x.getten();
                if(this.loai.equals("1")){
                    this.thanhtien = x.getloai1() * this.soLuong;
                }
                else{
                    this.thanhtien = x.getloai2() * this.soLuong;
                }
                if(this.soLuong >= 150) this.giamgia = Math.round(0.5 * this.thanhtien);
                else if(this.soLuong >= 100) this.giamgia = Math.round(0.3 * this.thanhtien);
                else if(this.soLuong >= 50) this.giamgia = Math.round(0.15 * this.thanhtien);
            }
        }
    }

    public long tongtien(){
        gia();
        return this.thanhtien - this.giamgia;
    }

    public String toString(){
        gia();
        return this.maloai + " " + this.ten + " " + this.giamgia + " " + tongtien();
    }
}
