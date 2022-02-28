package Day32_;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public Employee(String name){
        this.name = name;
    }
    public Employee(String name, char gender){
        this.name=name;
        this.gender=gender;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    /*
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        method1();
    }
    */
}
