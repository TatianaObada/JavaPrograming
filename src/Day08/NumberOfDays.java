package Day08;

public class NumberOfDays {
    public static void main(String[] args) {
        int number=2;
        boolean a=number==1 || number==3 || number== 5 || number==7 ||number== 8||number==10||number==12;
        boolean b=number==4 || number==6||number==9 || number==11;
        boolean c=number==2;
        if(a){
            System.out.println("Months that has 31 days");
        }
        if(b){
            System.out.println("Months that has 30 days");
        }
        if(c){
            System.out.println("Months that has 28 days");
        }

    }
}
/*
3. Create a class called NumberOfDays, Write a program that can print the number of days in a month
            Ex:
                number = 1;
            output:
                31 Days
            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */