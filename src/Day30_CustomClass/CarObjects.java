package Day30_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.color = "Light Gray";
        car1.year = 2018;
        car1.price = 21.801;

        System.out.println(car1);

        Car car2 = new Car();

        car2.brand = "MINI";
        car2.model = "Countryman";
        car2.color= "Navy Blue";
        car2.year = 2022;
        car2.price= 32.351;
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Audi", "Q5", "White", 2022, 45.601);
        System.out.println(car3);

        car1.drive();
        car2.start();
        car3.stop();

    }
}
