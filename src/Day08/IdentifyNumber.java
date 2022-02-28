package Day08;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number=200;
        boolean num1=number>0;
        boolean num2=number<0;
        boolean num3=number==0;
        System.out.println(number+" is positive number: "+num1);
        System.out.println(number+" is negative number: "+num2);
        System.out.println(number+" is zero: "+num3);

    }
}
/*
1. Create a class called IdentifyNumber, and write a program that can identify if
the given number is positive, or negative or zero.
            Ex:
                number = 200
            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false
 */