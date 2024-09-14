package InterfaceExample;

public class MainClass {
    public static void main(String[] args) {
        SampleImplementation s1 = new SampleImplementation();
        s1.Demo1();
        s1.Demo2();
        s1.canPossible();
        SampleInterface.alsoPossible();
        System.out.println("Interface Variable = "+s1.interfaceVar);
    }
}
