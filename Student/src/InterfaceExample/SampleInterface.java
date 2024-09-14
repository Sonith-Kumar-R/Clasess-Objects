package InterfaceExample;

public interface SampleInterface {
    // variables are by default public and final(Can't be change)
    int interfaceVar = 10; // And it should be initialized at the time of declaration only
    public  abstract void Demo1(); // By default it us public and abstract
    void Demo2();
    default void canPossible(){
        System.out.println("It when if we don't want to change the implementation ");
    }
    static void alsoPossible(){
        System.out.println("in implementation class here only in this two methods(default,static) ");
        System.out.println("can have body inside the Interface");
    }
}
