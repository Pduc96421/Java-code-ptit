package java_code_ptit.J04019;

public class Triangle {
    private double a, b, c;

    public Triangle(Point a, Point b, Point c){
        this.a = a.distance(a, b);
        this.b = a.distance(a, c);
        this.c = b.distance(b, c);
    }

    public boolean valid(){
        return (a + b > c) && (a + c > b) && (b + c > a) && a > 0 && b > 0 && c > 0; 
    }

    public String getPerimeter(){
        double ans = a + b + c;
        return String.format("%.3f", ans);
    }
}
