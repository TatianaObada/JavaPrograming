package Day04;

public class Rectangle {
    public static void main(String[] args) {
        double length=4;
        double width=3;
        double area=length*width;
        double perimeter=2*(length+width);

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}
/*
2. Create a class named Rectangle, write a program that can calculate
 the area & perimeter of any given Rectangle
                        length
                        width
                        area = length * width
                        perimeter =  2 * (length + width)
 */