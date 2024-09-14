package EncapsulationExampleMain;

import EncapsulationExample.Encapsulation;

public class EncapsulationMainClass {
    public static void main(String[] args) {
        Encapsulation ob1 = new Encapsulation();
        ob1.setName("sonith");
        ob1.setNum(12345);
        ob1.setStuId(2004);
        System.out.println(ob1.getStuId()+" "+ob1.getName()+" "+ob1.getNum()+" ");
        Encapsulation ob2 = new Encapsulation();
        System.out.println(ob2.getStuId()+" "+ob2.getName()+" "+ob2.getNum()+" ");
    }
}
