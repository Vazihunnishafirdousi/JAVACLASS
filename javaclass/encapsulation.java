class atm{
    private int a;

    void setRupees(int a){
        this.a=a;
    }
    int getRupees(){
        return a;
    }
}
public class encapsulation{
    public static void main(String[]args){
        atm obj=new atm();
        obj.setRupees(3400);
        System.out.println(obj.getRupees());
    } 
}