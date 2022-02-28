package Day04;

public class SalaryCalculetor {
    public static void main(String[] args) {
        //hourlyRate, weekyHours
        int  hourslyRate  = 50;
        int weeklyHours =40;

        int salary = hourslyRate*weeklyHours*52;
        //System.out.println();
        System.out.println("Salary is: $"+salary);
        System.out.println(salary);
        System.out.println("salary = " + salary);
        //shortcat soutv
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourslyRate = $" + hourslyRate);
        System.out.println("salary = $" + salary);
    }
}
