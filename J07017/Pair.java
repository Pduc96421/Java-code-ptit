package java_code_ptit.J07017;

public class Pair<T1, T2> {
    private T1 fisrt;
    private T2 second;

    public Pair(T1 fisrt, T2 second){
        this.fisrt = fisrt;
        this.second = second;
    }

    public boolean snt(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }

    public boolean isPrime(){
        return snt((Integer)this.fisrt) && snt((Integer)this.second);
    }

    public String toString(){
        return this.fisrt + " " + this.second;
    }
}
