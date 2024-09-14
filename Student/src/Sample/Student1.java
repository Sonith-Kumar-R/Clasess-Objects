package Sample;

public class Student1 {
    public int studentId;
    public String name;
    public String dob;
    public int age;
    public String gender;
    public String yearOfAdmission;
    public String grade;
   // public int var;

    public static String email="SonithKumar@gmail.com";

    public Student1(int studentId, String name, String dob, int age, String gender, String yearOfAdmission, String grade) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.yearOfAdmission = yearOfAdmission;
        this.grade = grade;
      //  Student1.email=email;
    }

    public Student1() {

    }

    @Override
    public String toString() {
        return "Student1{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", yearOfAdmission='" + yearOfAdmission + '\'' +
                ", grade='" + grade + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
