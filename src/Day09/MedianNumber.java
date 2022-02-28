package Day09;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10,
              b=15,
                c=20;
        //                             a=15,b=10,c=20    a=15,c=10,b=20
        boolean aIsMedian = (a > b || a < c) && (a < b || a > c);
        boolean bIsMedian = (b < a || b < c) && (b > a || b > c);
        boolean cIsMedian = (c < a || c < b) && (c > a || c > b);
        //boolean cIsMedian= !aIsMedian  && !bIsMedian;

        if (aIsMedian){// if a is the median number
            System.out.println( a + " is the median number");
        }
        if (bIsMedian){// if b is the median number
            System.out.println( b + " is the median number");
        }
        if (cIsMedian){// if c is the median number
            System.out.println( c + " is the median number");
        }
    }
}
/*
2. Create a class called MedianNumber. Write a program that can find the median
number between three DIFFERENT given integers
            Ex:
                a = 10, b= 15, c = 20;
            Output:
                15 is the median number

 */