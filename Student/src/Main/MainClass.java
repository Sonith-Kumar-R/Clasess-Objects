package Main;

import Sample.Student1;

public class MainClass {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        System.out.println("s1 "+s1);
        s1.studentId=123;
        s1.name="Sonith";
        s1.dob="25-01-2004";
        s1.age=21;
        s1.gender="male";
        s1.yearOfAdmission="sep";
        s1.grade="96%";
        System.out.println("s1 "+s1);
        Student1 s2 = new Student1(321,"Kumar","23-04-2002",25,"male","April","98%");
        //s2.name="changed";
        System.out.println("s2 "+s2);
        Student1 s3 = s2;
        //Student1.email="emailChaned";
        System.out.println("s3 "+s3);
        Student1 s4 = new Student1();
        s4.studentId=950;
        s4.name="Mohan";
        s4.dob="22-12-2012";
        s4.age=27;
        s4.gender="female";
        s4.yearOfAdmission="AUG";
        s4.grade="92%";
        Student1.email="Mohan@.com";
        System.out.println("s4 "+s4);
    }
}
