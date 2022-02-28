package Day09;

public class MinNumber {
    public static void main(String[] args) {
        int n1=100,
                n2=200;
        boolean n1Ismin=n1<n2,
                n2Ismin=n1>n2,
                equal=n1==n2;
        if(n1Ismin){
            System.out.println(n1+" is the minimum number");
        }
        if(n2Ismin){
            System.out.println(n2+" is the minimum number");
        }
        if(equal){
            System.out.println("n1 is equal of n2");
        }
    }
}
/*
1. Create a class called MinNumber, Write a program that can print the minimum
number between two numbers, if both are equal then print Equal
            Ex:
                n1= 100, n2 = 200;
            output:
                100 is the minimum number
 */