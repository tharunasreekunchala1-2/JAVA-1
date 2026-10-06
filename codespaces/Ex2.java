class A{
    int i = 10;
    A(int i){
        this.i = i;
        System.out.println("Parent class i = " +i);
    }
    void show(){
        System.out.println("show() in Parent");
    }
}
class B extends A{
    int i = 20;
    B(int i){
        super(i); 
        System.out.println("Child class i= " +this.i);
    }
    void show(){
        System.out.println("show() in Child " +super.i);
    }
}
public class Ex2 {
    public static void main(String args[]){
        B obj = new B(40);
        obj.show();
    }
}