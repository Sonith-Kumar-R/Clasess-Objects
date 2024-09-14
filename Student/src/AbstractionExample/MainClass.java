package AbstractionExample;

public class MainClass {
    public static void main(String[] args) {
        ConcreateClass c1 = new ConcreateClass();
        c1.Demo1();
        c1.Demo2();
        c1.sample();
        System.out.print("Variable = "+c1.abstractvar);
    }
}
