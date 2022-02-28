package Day30_CustomClass;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Jack";
        student1.nation = "Irish";
        student1.age = 29;
        student1.gender = 'M';
        student1.studentID = "Cydeo25-1";
        System.out.println(student1);

        Student student2 = new Student();

        student2.name = "Isabella";
        student2.nation = "Italian";
        student2.age = 30;
        student2.gender = 'F';
        student2.studentID = "Cydeo25-2";
        System.out.println(student2);

        Student student3 = new Student();
        student3.setInfo("Christoper", "US", 31, 'M', "Cydeo25-3");
        System.out.println(student3);

        student1.eat();
        student2.drink();
        student3.code();
        student1.sleep();
    }
}
