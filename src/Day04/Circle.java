package Day04;

public class Circle {
    public static void main(String[] args) {
        double radius=1;
        double PI=3.14;
        double diameter=2*radius;
        double aria=PI*radius*radius;
        double length=PI*diameter;

        System.out.println("diameter = " + diameter);
        System.out.println("length = " + length);
        System.out.println("aria = " + aria);
    }
}
