package java_code_ptit.J05010;

import java.util.Comparator;

public class SortMH implements Comparator<Mat_hang> {
    public int compare(Mat_hang mh1, Mat_hang mh2){
        if(mh1.loi_nhuan() < mh2.loi_nhuan()) return 1;
        else return -1;
    }
}
