class parent{
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a , int b, int c){
        System.out.println(a+b+c);
    }
}
    class child extends parent{
        void add(){
            System.out.println("add");
        }
    }






public class methodoverloading {
    public static void main(String[] args) {
        child obj=new child();
        obj.sum(34);
        obj.sum(12,34);
        obj.sum(12,34,5);
        obj.add();
    }
}
