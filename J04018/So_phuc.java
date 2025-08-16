package java_code_ptit.J04018;

public class So_phuc {
    private int thuc, ao;

    public So_phuc(){

    }

    public So_phuc(int thuc, int ao){
        this.thuc = thuc;
        this.ao = ao;
    }

    public So_phuc cong(So_phuc b){
        So_phuc x = new So_phuc();
        x.thuc = this.thuc + b.thuc;
        x.ao = this.ao + b.ao;
        return x;
    }

    public So_phuc nhan(So_phuc b){
        So_phuc x = new So_phuc();
        x.thuc = this.thuc * b.thuc - this.ao * b.ao;
        x.ao = this.ao * b.thuc + this.thuc * b.ao;
        return x;
    }

    public String toString(){
        String ans = "";
        ans += this.thuc + " ";
        if(this.ao < 0){
            ans += "- " + Math.abs(this.ao) + "i";
        }
        else{
            ans += "+ " + Math.abs(this.ao) + "i";
        }
        return ans;
    }
}
