package PolymorphismExampleMain;

import PolymorphismExample.PolymorphismClass;

public class PolymorphismMainClass {
    public static void main(String[] args) {
        PolymorphismClass ob1 = new PolymorphismClass();
        ob1.operation();
        ob1.operation(10);
        ob1.operation(56894.000323);
        ob1.operation(100,200);
    }
}
