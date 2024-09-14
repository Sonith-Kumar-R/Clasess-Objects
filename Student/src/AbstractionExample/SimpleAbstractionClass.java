package AbstractionExample;

public abstract class SimpleAbstractionClass {
    public int abstractvar = 10;// variable can't be Abstract
    // Only the Methods can be Abstract
    public abstract void Demo1();
    public abstract void Demo2();
    public void sample(){
        System.out.println("Sample Method");
    }
}
