package Day04;

public class PrimitiveIntro {
    public static void main(String[] args) {
        //age: 38 years old
        byte age=38;
        //weight: 160 pounds
        //byte weight=160;-  byte-128  to 128
        short  weight=160; //160 is within the range
        //salary: 100000 $
        //short --32,768 to 32768
        int salary=100_000;
        char ch3=35000;
        System.out.println("ch3 = " + ch3);
        char  geder='F';
        System.out.println("geder = " + geder);
        char grade='F';
        System.out.println("grade = " + grade);
        boolean isMarried= true;
        System.out.println("isMarried = " + isMarried);
        boolean result=100>300;
        System.out.println("result = " + result);

    }
}
