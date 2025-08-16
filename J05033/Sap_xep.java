package java_code_ptit.J05033;

import java.util.Comparator;

public class Sap_xep implements Comparator<Thoi_gian> {
    public int compare(Thoi_gian t1, Thoi_gian t2){
        if(t1.getgio() != t2.getgio()){
            if(t1.getgio() < t2.getgio()){
                return -1;
            }
            else return 1;
        }
        else{
            if(t1.getphut() != t2.getphut()){
                if(t1.getphut() < t2.getphut()) return -1;
                else return 1;
            }
            else{
                if(t1.getgiay() != t2.getgiay()){
                    if(t1.getgiay() < t2.getgiay()) return -1;
                    else return 1;
                }
            }
        }
        return -1;
    }
}
