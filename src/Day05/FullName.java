package Day05;

public class FullName {
    public static void main(String[] args) {
        String firstName="Tatiana";
        String lastName="Obada";
        int age =33;
        String jobTitle="SDEF";
        String  companyName="Apple Inc";
        double salary=100000.58;

        String fullName=firstName+" "+lastName;
        System.out.println("fullName = " + fullName);
        //___is__years old
        System.out.println(fullName);
        //___is__years old
        System.out.println(fullName +" is " +age+ "  years old");
        //FullName is JobTitle+, works at + company Name
        System.out.println(fullName+" is "+jobTitle+","+" works at "+companyName+ ", and "+firstName+"' salary is "+salary);
    }
}
