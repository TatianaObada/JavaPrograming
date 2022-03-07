package day30_CustomClass;

public class Student {
    public String name;
    public String nation;
    public int age;
    public char gender;
    public String studentID;

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void code() {
        System.out.println(name + " is coding");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", studentID='" + studentID + '\'' +
                '}';
    }

    public void setInfo(String studentName, String studentNation, int studentAge, char studentGender, String studentID1) {
        name = studentName;
        nation = studentNation;
        age = studentAge;
        gender = studentGender;
        studentID = studentID1;

    }
}
