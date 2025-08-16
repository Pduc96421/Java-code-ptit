package java_code_ptit.J07048;

import java.util.Comparator;

public class Sap_xep implements Comparator<San_pham>{
    public int compare(San_pham sp1, San_pham sp2){
        if(sp1.getgia() != sp2.getgia()){
            if(sp1.getgia() < sp2.getgia()){
                return 1;
            }
            else return -1;
        }
        else{
            return sp1.getmsp().compareTo(sp2.getmsp());
        }
    }
}
