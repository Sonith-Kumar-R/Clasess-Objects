package InheritanceExampleMain;

import InheritanceExample.Animal;
import InheritanceExample.Dog;
import InheritanceExample.Human;

public class InheritanceMainClass {
    public static void main(String[] args) {
        Animal ob1 = new Animal();
        ob1.see();
        ob1.Breathe();
        ob1.legs();
        System.out.println("Human CHILD CLASS ");
        Human h1 = new Human();
        h1.Think();
        h1.see();
        h1.Breathe();
        System.out.println("Dog CHILD CLASS ");
        Dog d1 = new Dog();
        d1.Bark();
        d1.Breathe();
        d1.see();
    }
}
