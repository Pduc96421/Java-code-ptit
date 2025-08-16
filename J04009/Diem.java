package java_code_ptit.J04009;

public class Diem {
    private double x, y;

    public Diem(double x, double y){
        this.x = x;
        this.y= y;
    }

    public double distance(Diem p1, Diem p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}
