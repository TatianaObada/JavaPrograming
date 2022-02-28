package Day20;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int num[]=new int[10];
        System.out.print("enter 10 numbers");
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
        }
        int max=num[0];
        int min=num[0];

        for (int i = 0; i < num.length; i++) {


            if (num[i] > max) {

                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("the min number is "+min+". The max number is "+max+".");
    }
}
