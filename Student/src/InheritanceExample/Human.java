package InheritanceExample;

public class Human extends Animal {
    public void Think(){
        System.out.println("Human Can Think");
        System.out.println(super.legs);
        super.Breathe();
        super.see();
    }
    public void see(){
        System.out.println("Human can see");
    }
    public void Breathe(){
        System.out.println("Human can Breathe");
    }
    public void legs(){
        System.out.println("Human have legs");
    }
}
