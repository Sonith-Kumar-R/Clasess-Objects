package PolymorphismExample;

public class PolymorphismClass {
    // Also Called as Overloading;
    public void operation(){
        System.out.println("operation is prints");
    }
    public void operation(int a){
        System.out.println("operation is prints "+a);
    }
    public void operation(double m){
        System.out.println("operation is prints a double "+m);
    }
    public void operation(int x,int y){
        System.out.println("operation is prints addition "+(x+y));
    }
}
