package java_code_ptit.J05081;

import java.util.Comparator;

public class Sap_xep implements Comparator<Mat_hang> {
    public int compare(Mat_hang mh1, Mat_hang mh2){
        if(mh1.loi_nhuan() != mh2.loi_nhuan()){
            if(mh1.loi_nhuan() < mh2.loi_nhuan()){
                return 1;
            }
            else return -1;
        }
        else{
            return mh1.getmamh().compareTo(mh2.getmamh());
        }
    }
}
