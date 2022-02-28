package Day08;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int  number=65;

        boolean num1=65%2==0;
        boolean num2=65%3==0;
        boolean num3=65%5==0;

        System.out.println(number+" is divisible by 2: "+num1);
        System.out.println(number+" is divisible by 3: "+num2);
        System.out.println((int)(10.0/3));


    }
}
/*
2. Create a class called EvenlyDivisible, and write a program that can check if a
number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */